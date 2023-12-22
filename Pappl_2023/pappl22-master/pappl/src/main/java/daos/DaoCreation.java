/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;
import models.EcheanceSimplifiee;

/**
 *
 * @author 96441
 */
public class DaoCreation {
     
     /**
     * Cette méthode permet la création d'un nouveau redevable 
     * @param mailRedevable adresse mail du redevable 
     * @param nomRedevable nom et prénom du redevable 
     * @param listEcheance liste des échéances 
     * @param libelle 
     * @param montant montant de la dette 
     * @param infoComplementaire
     * @param actionentre action entreprendre 
     * @param actEfect action effectuée 
     * @param idAgent nom de l'agent chargé 
     */
     public void CreationRedevable(String mailRedevable, String nomRedevable, ArrayList<EcheanceSimplifiee> listEcheance, String libelle, String montant, String infoComplementaire, String actionentre, String actEfect ,String idAgent){
        
       try {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(DaoHistorique.url,"postgres", DaoHistorique.motDePass);
        PreparedStatement  stmt = null;
        String requete1 = "SELECT redevable.adresse_mail_redevable FROM redevable ";
        stmt=conn.prepareStatement(requete1);
        ResultSet res = stmt.executeQuery();
        boolean existe=false;
        res.next();
        while (res.next()) {
            if (res.getString("adresse_mail_redevable").equals(mailRedevable)) {
        existe = true;
        break; // Sortir de la boucle si l'adresse mail est trouvée
            }
        }
        
        if (existe==false){
            String requete2= "INSERT INTO redevable(adresse_mail_redevable , nom_redevable) VALUES (?,?) ";
            stmt=conn.prepareStatement(requete2);
            stmt.setString(1,mailRedevable);
            stmt.setString(2,nomRedevable);
            stmt.executeUpdate();
        }
        

        String id_dette = UUID.randomUUID().toString();
        String id_echeance = UUID.randomUUID().toString();
        
        String requete3="INSERT INTO dette(libelle , montant_dette , info_complementaire , adresse_mail_redevable , id_agent , date_creation , statut_dette , dette_actuelle , action_effectuee , action_entreprendre , id_dette) "
                        +"VALUES (? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?)";
        stmt=conn.prepareStatement(requete3,Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1,libelle);
        stmt.setDouble(2,Double.parseDouble(montant));
        stmt.setString(3,infoComplementaire);
        stmt.setString(4,mailRedevable);
        stmt.setString(5,idAgent);
        stmt.setDate(6,Date.valueOf(LocalDate.now()));
        stmt.setBoolean(7, false);
        stmt.setDouble(8, Double.parseDouble(montant));
        stmt.setString(9,actEfect);
        stmt.setString(10,actionentre);
        stmt.setString(11,id_dette);
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
            
            String de_id = "1";
            if(rs.next()){
                de_id = rs.getString(1);}
        //requete3="SELECT currval('dette_sequence')AS de_id FROM dette";
        //stmt=conn.prepareStatement(requete3);
        //res = stmt.executeQuery();
        //res.next();
        for (EcheanceSimplifiee e : listEcheance){
        String requete4 = "INSERT INTO echeance(date_deadline , montant_echeance , statut_paiement , statut_annulation , id_dette , id_echeance) "
                   +"VALUES (? , ? , ? , ? , ? , ?)";
        PreparedStatement stmtEcheance =conn.prepareStatement(requete4);
        
        LocalDate localdate = e.getDateDeadLine();
        
        stmtEcheance.setDate(1,Date.valueOf(e.getDateDeadLine()));
        stmtEcheance.setDouble(2,e.getMontant());
        stmtEcheance.setBoolean(3,false);
        stmtEcheance.setBoolean(4,false);
        stmtEcheance.setString(5,de_id);
        stmtEcheance.setString(6, id_echeance);
        stmtEcheance.executeUpdate();
        stmtEcheance.close() ;
        id_echeance = UUID.randomUUID().toString();
        }
        
        conn.close() ; 
         
     }
    catch (SQLException e) {
             e.printStackTrace();
    }
    catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } 
    }
}

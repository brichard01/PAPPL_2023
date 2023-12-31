/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Exceptions.MontantException;
import Exceptions.VideException;
import controllers.ConActif;
import controllers.ConEdition;
import daos.DaoEdition;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.DetteDetaillee;

/**
 *
 * @author 96441
 */
public class EditionAH extends javax.swing.JPanel {
    private JPanel panel;
    private ConActif conactif;
    private ConEdition conedition;
    private DaoEdition daoedition;
    /**
     * Creates new form DetailActif
     */
    public EditionAH() {
        initComponents();
        conactif= new ConActif();
        conedition = new ConEdition();
        daoedition = new DaoEdition();
    }
     public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTextField getIdDette() {
        return idDette;
    }

    public JTextField getActioneffectuee() {
        return actioneffectuee;
    }

    public JComboBox<String> getAgentComptable() {
        return agentComptable;
    }

   

    public JTextField getActionentreprendre() {
        return actionentreprendre;
    }

    public JTable getListeEcheances() {
        return listeEcheances;
    }

    public JTextField getInfocomplementaire() {
        return infocomplementaire;
    }

    public JTextField getLibelle() {
        return libelle;
    }

    public JTextField getMail() {
        return mail;
    }

    public JTextField getMontant() {
        return montant;
    }

    public JTextField getNom() {
        return nom;
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        libelle = new javax.swing.JTextField();
        montant = new javax.swing.JTextField();
        infocomplementaire = new javax.swing.JTextField();
        actionentreprendre = new javax.swing.JTextField();
        actioneffectuee = new javax.swing.JTextField();
        annuler = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listeEcheances = new javax.swing.JTable();
        idDette = new javax.swing.JTextField();
        enregistrer = new javax.swing.JButton();
        ajoutLigne = new javax.swing.JButton();
        effacerLigne = new javax.swing.JButton();
        agentComptable = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(0, 51, 102));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Logiciel Echéancier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 204, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Nom:");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Libellé:");

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Information complémentaire:");

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Adresse mail:");

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Montant dette:");

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Action à entreprendre:");

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Actions effectuées:");

        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });

        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });

        montant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montantKeyTyped(evt);
            }
        });

        infocomplementaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infocomplementaireActionPerformed(evt);
            }
        });

        actioneffectuee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actioneffectueeActionPerformed(evt);
            }
        });

        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        listeEcheances.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Echéance", "Date deadline", "Montant", "Payée?", "Date paiement", "Annulée?", "Raison annulation", "idEcheance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(listeEcheances);
        if (listeEcheances.getColumnModel().getColumnCount() > 0) {
            listeEcheances.getColumnModel().getColumn(0).setPreferredWidth(80);
            listeEcheances.getColumnModel().getColumn(1).setPreferredWidth(110);
            listeEcheances.getColumnModel().getColumn(2).setPreferredWidth(60);
            listeEcheances.getColumnModel().getColumn(3).setPreferredWidth(50);
            listeEcheances.getColumnModel().getColumn(4).setPreferredWidth(110);
            listeEcheances.getColumnModel().getColumn(5).setPreferredWidth(55);
            listeEcheances.getColumnModel().getColumn(6).setPreferredWidth(120);
        }

        enregistrer.setText("Enregister");
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });

        ajoutLigne.setText("Ajouter une ligne");
        ajoutLigne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutLigneActionPerformed(evt);
            }
        });

        effacerLigne.setText("Effacer une ligne");
        effacerLigne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effacerLigneActionPerformed(evt);
            }
        });

        agentComptable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        agentComptable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentComptableActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Agent Comptable:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(enregistrer)
                .addGap(194, 194, 194)
                .addComponent(annuler)
                .addGap(219, 219, 219))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(infocomplementaire, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actionentreprendre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actioneffectuee, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(idDette, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agentComptable, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(libelle, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(montant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajoutLigne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(effacerLigne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(libelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(montant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(infocomplementaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(agentComptable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(actionentreprendre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idDette, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actioneffectuee)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(annuler)
                            .addComponent(enregistrer)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(ajoutLigne)
                        .addGap(41, 41, 41)
                        .addComponent(effacerLigne)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void infocomplementaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infocomplementaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infocomplementaireActionPerformed

    private void actioneffectueeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actioneffectueeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actioneffectueeActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed

        ((CardLayout)panel.getLayout()).show(panel, "p5"); 
    }//GEN-LAST:event_annulerActionPerformed

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
        
        try {
            DetteDetaillee detteDetail = conedition.update(listeEcheances, idDette, nom, mail, libelle, montant, infocomplementaire, actionentreprendre, actioneffectuee, agentComptable);
            JTextField libelleE = ((DetailAH)panel.getComponent(3)).getLibelle();
            JTextField mailE = ((DetailAH)panel.getComponent(3)).getMail();
            JTextField montantE = ((DetailAH)panel.getComponent(3)).getMontant();
            JTextField infoE = ((DetailAH)panel.getComponent(3)).getInfocomplementaire();
            JTextField actionEntreE = ((DetailAH)panel.getComponent(3)).getActionentreprendre();
            JTextField actionEffectE = ((DetailAH)panel.getComponent(3)).getActioneffectuee();
            JTextField idDetteE = ((DetailAH)panel.getComponent(3)).getIdDette();
            JTextField agentComptableE = ((DetailAH)panel.getComponent(3)).getAgentComptable();
            JTable echeancesE = ((DetailAH)panel.getComponent(3)).getListeEcheances();
            JTextField nomE = ((DetailAH)panel.getComponent(3)).getNom();
            idDetteE.setVisible(false);
            conedition.afficherDonneesEditionAH(detteDetail, echeancesE, idDetteE, nomE, mailE, libelleE, montantE, infoE, actionEntreE, actionEffectE, agentComptableE);
            ((DetailAH)panel.getComponent(3)).setDetteEnregistre(detteDetail);
            ((CardLayout)panel.getLayout()).show(panel, "p5");
            
        } catch (ParseException e) {
            e.printStackTrace();
        }catch(VideException ex ){
            JOptionPane.showMessageDialog(this, "Il y a des champs vides qui ne peuvent pas l'être,"
                    + " ajoutez les données manquantes");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Le montant des écheances doit être une valeur numérique non vide");
        }catch(MontantException es){
            JOptionPane.showMessageDialog(this, "Le montant total de la dette n'est pas égal à la somme des "
                    + "échéances, veuillez modifier les valeurs et sauvegarder à nouveau");
        }
    }//GEN-LAST:event_enregistrerActionPerformed

    private void ajoutLigneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutLigneActionPerformed
        DefaultTableModel model = (DefaultTableModel)listeEcheances.getModel();
        Object[] ligne = new Object[7];
        int i = model.getRowCount() + 1;
        ligne[0]= "Deadline " + i;
        model.addRow(ligne);
    }//GEN-LAST:event_ajoutLigneActionPerformed

    private void effacerLigneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effacerLigneActionPerformed
        DefaultTableModel model = (DefaultTableModel)listeEcheances.getModel();
        int row = listeEcheances.getSelectedRow(); 
        model.removeRow(row);
    }//GEN-LAST:event_effacerLigneActionPerformed

    private void agentComptableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentComptableActionPerformed
      
    }//GEN-LAST:event_agentComptableActionPerformed

    private void montantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montantKeyTyped
    char c=evt.getKeyChar();   
          if (!((Character.isDigit(c))||(c=='.')||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
              getToolkit().beep();
              evt.consume();  
          }        
    }//GEN-LAST:event_montantKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actioneffectuee;
    private javax.swing.JTextField actionentreprendre;
    private javax.swing.JComboBox<String> agentComptable;
    private javax.swing.JButton ajoutLigne;
    private javax.swing.JButton annuler;
    private javax.swing.JButton effacerLigne;
    private javax.swing.JButton enregistrer;
    private javax.swing.JTextField idDette;
    private javax.swing.JTextField infocomplementaire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField libelle;
    private javax.swing.JTable listeEcheances;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField montant;
    private javax.swing.JTextField nom;
    // End of variables declaration//GEN-END:variables
}

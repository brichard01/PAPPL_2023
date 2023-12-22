/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ConAgent;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;


/**
 *
 * @author Luz
 */
public class Agent extends javax.swing.JPanel {

    /**
     * Creates new form Agent
     */
    
    JPanel panel; 
    static ConAgent conAgent = new ConAgent();

    public static ConAgent getConAgent() {
        return conAgent;
    }

    public void setConAgent(ConAgent conAgent) {
        this.conAgent = conAgent;
    }
  
    
    public Agent() {
        initComponents();
        this.conAgent = new ConAgent();
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTable getjTable1() {
        return jTable1;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nouveauAgent = new javax.swing.JButton();
        enregistrer = new javax.swing.JButton();
        effacer = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 102));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Logiciel Echéancier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Modification Agent Comptable");

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                if (colIndex == 3){return false;}
                else {return true;}
            }
        };
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Mail", "Statut", "Compte"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(165);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(95);
        }

        nouveauAgent.setText("Nouvel Agent");
        nouveauAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauAgentActionPerformed(evt);
            }
        });

        enregistrer.setText("Retourner");
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });

        effacer.setText("Effacer");
        effacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effacerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nouveauAgent)
                    .addComponent(effacer, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(enregistrer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(effacer)
                        .addGap(27, 27, 27)
                        .addComponent(nouveauAgent))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(enregistrer)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nouveauAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauAgentActionPerformed
       String texte=null,texte2 = null,texte3 = null;
         texte= JOptionPane.showInputDialog("Ajoutez le nom de l'agent: ");
       if (texte!=null){
         texte2= JOptionPane.showInputDialog("Ajoutez l'adresse mail de l'agent ");
       }
       if (texte2!=null){
        texte3= JOptionPane.showInputDialog("Ajoutez l'identifiant de l'agent ");
       }
       if ((texte3!=null)){
               conAgent.ajouterAgent(texte, texte2, texte3,jTable1); 
        }
    }//GEN-LAST:event_nouveauAgentActionPerformed

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
         conAgent.mettreAJourAgents(jTable1);
         ((CardLayout)panel.getLayout()).show(panel, "p1");
         
    }//GEN-LAST:event_enregistrerActionPerformed

    private void effacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effacerActionPerformed
        boolean exeption = conAgent.effacerAgent(jTable1);
        if (exeption){
            JOptionPane.showMessageDialog(this, "Nous ne pouvons pas supprimer cet agent "
                    + " car il existe des dettes enregistrées à leur nom et leur suppression "
                    + "entraînerait la perte de données.");
        }  
        
    }//GEN-LAST:event_effacerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton effacer;
    private javax.swing.JButton enregistrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nouveauAgent;
    // End of variables declaration//GEN-END:variables
}

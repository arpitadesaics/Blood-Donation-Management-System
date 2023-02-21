/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BloodDonationManagement.Receiver;

import javax.swing.table.DefaultTableModel;
import model.FAQ;
import model.system;

/**
 *
 * @author arpid
 */
public class BDReceiverFAQPanel extends javax.swing.JPanel {

    /**
     * Creates new form BDReceiverFAQPanel
     */
    system s;
    public BDReceiverFAQPanel(system s) {
        initComponents();
        this.s = s;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablefaq = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1125, 800));

        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablefaq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Question", "Answer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablefaq);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 660, 640));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonationManagement/a7.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 1210, 920));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1143, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablefaq;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
    DefaultTableModel model = (DefaultTableModel) tablefaq.getModel();
    model.setRowCount(0);
//    tablefaq.setShowGrid(true);
//    tablefaq.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    for (FAQ ep:s.getFaqdirectory().getFAQ()){
            
            Object[] row = new Object[2];
            row[0] = ep;
            row[1] = ep.getAnswers();  
                
                      
            model.addRow(row);
}     
 
}
}

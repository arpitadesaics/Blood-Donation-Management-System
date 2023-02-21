/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BloodDonationManagement.Applicant;

import javax.swing.table.DefaultTableModel;
import model.Accept;
import model.BloodDonationEvent;
import model.system;

/**
 *
 * @author arpid
 */
public class BDHiringAcceptedApplications extends javax.swing.JPanel {

    /**
     * Creates new form BDHiringAcceptedApplications
     */
    system s;
    public BDHiringAcceptedApplications(system s) {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tableaccept = new javax.swing.JTable();
        username = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableaccept.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Centre Name", "Application ID", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableaccept);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 114, 797, 472));

        username.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 42, 97, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("USERNAME");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 51, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonationManagement/Applicant/HP.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tableaccept;
    public static javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
          DefaultTableModel model = (DefaultTableModel) tableaccept.getModel();
          model.setRowCount(0);
        
        for (Accept ep:s.getAcceptdirectory().getAccept()){
                                                     
            if(BDHiringAcceptedApplications.username.equals(ep.getUsername()))
            {            
                Object[] row = new Object[4];
                row[0] = ep;
                row[1] = ep.getCentre();
                row[2] = ep.getId();
                row[3] = ep.getDate();                  
                       
                model.addRow(row);
            }
        }
}

}

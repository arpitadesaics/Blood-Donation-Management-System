/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BloodDonationManagement.Applicant;
import Main.MainLogin;
import javax.swing.JOptionPane;
import model.Applicant;
import model.system;

/**
 *
 * @author arpid
 */
public class BDHiringApplicantProfile extends javax.swing.JPanel {

    /**
     * Creates new form BDHiringApplicantProfile
     */
    system s;
    public BDHiringApplicantProfile(system s) {
        initComponents();
        this.s = s;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        emailid = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        bloodcentre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        usertype = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        qualification = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Age:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Contact:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Email ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        name.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 154, -1));

        age.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 154, -1));

        emailid.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 154, -1));

        contact.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 154, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 153, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Applicant ID:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        id.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 154, -1));

        bloodcentre.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(bloodcentre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 154, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Blood Center:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Gender:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        gender.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Female", "Male", "Other" }));
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 154, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("User Type:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        usertype.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Volunteer", "Paid Job", " " }));
        jPanel1.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 154, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setText("Application");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 337, 42));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Username:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        qualification.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(qualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 154, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Qualification:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        username.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 154, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setText("Date:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        date.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 154, -1));

        password.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 154, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("Password:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 153, 36));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BloodDonationManagement/Applicant/HP.png"))); // NOI18N
        jLabel14.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Applicant ep = null;
        for (Applicant epp:s.getApplicantdirectory().getApplicant()){
            if (username.getText().equals(epp.getUsername())){
                ep = epp;
            }
        }
        s.getApplicantdirectory().deleteApplicant(ep);
        int flag =1;
        String s1 = (String)usertype.getSelectedItem();
        if(s1.equals("select"))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"UserType field cannot be empty");
            return;
        }
        String s2 = name.getText();
        if(s2.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
            return;
        }
        char[] chars = s2.toCharArray();
        for(char c : chars)
        {
            if(Character.isDigit(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
                return;
            }
        }

        String ss3 = age.getText();

        if(ss3.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Age field cannot be empty or contain alphabet");
            return;
        }
        char[] chars1 = ss3.toCharArray();
        for(char c : chars1)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Age field cannot be empty or contain alphabet");
                return;
            }
        }
        int s3 = Integer.parseInt(ss3);

        String s4 = (String)gender.getSelectedItem();
        if(s4.equals("select"))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Gender field cannot be empty");
            return;
        }
        String ss5 = id.getText();

        if(ss5.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
            return;
        }
        char[] chars3 = ss5.toCharArray();
        for(char c : chars3)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
                return;
            }
        }
        int s5 = Integer.parseInt(ss5);

        for (Applicant epp:s.getApplicantdirectory().getApplicant()){
            if (s5 == (epp.getId())){
                flag=0;
                JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");

            }
        }

        String ss6 =  contact.getText();

        if(ss6.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet");
            return;
        }
        if(ss6.length()!=10)
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Cell phone number must be 10 digits");
            return;
        }
        char[] chars5 = ss6.toCharArray();
        for(char c : chars5)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet");
                return;
            }
        }
        long s6 = Long.parseLong(ss6);
        String s7 = emailid.getText();
        if(s7.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"EmailId field cannot be empty");
            return;
        }
        String s8 = bloodcentre.getText();
        if(s8.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"BloodCentre field cannot be empty");
            return;
        }
        String s9 = date.getText();
        if(s9.equals(""))
        {
           flag=0;
           JOptionPane.showMessageDialog(this,"Please enter date");
           return;                     
        }
         if (s9.length()<10){
             flag=0;
            JOptionPane.showMessageDialog(this,"Please enter correct date in format mm/dd/yyyy" );
            return;
        }
        
        StringBuffer sBuffer = new StringBuffer(s9);
        String mm;
        String dd;
        String yr;

        mm = sBuffer.substring(0,2);
        dd = sBuffer.substring(3,5);
        yr = sBuffer.substring(6,10);

        
        if(mm.matches("0[1-9]|1[0-2]") && dd.matches("0[1-9]|[12][0-9]|3[01]") && yr.matches("(19|20)\\d\\d"))
        {
          
        }
        else
        {
            flag=0;
         JOptionPane.showMessageDialog(this, "Please enter correct date in format mm/dd/yyyy");
         return;
        }

        String s10 = qualification.getText();
        if(s10.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Qualification field cannot be empty");
            return;
        }

        String s11 = username.getText();
        if(s11.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Username field cannot be empty");
            return;
        }

        for (Applicant ep1:s.getApplicantdirectory().getApplicant()){
            if (s11.equals(ep1.getUsername())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Username already exists, please try again");
            }

        }
        String s12 = password.getText();
        if(s12.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Password field cannot be empty");
            return;
        }

        for (Applicant ep1:s.getApplicantdirectory().getApplicant()){
            if (s12.equals(ep1.getPassword())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Password already exists, please try again");
            }
        }

        if(flag == 1)
        {

            Applicant pp = s.getApplicantdirectory().addNewApplicant();
            pp.setUsertype(s1);
            pp.setName(s2);
            pp.setAge(s3);
            pp.setGender(s4);
            pp.setId(s5);
            pp.setContact(s6);
            pp.setEmailid(s7);
            pp.setCentre(s8);
            pp.setDate(s9);
            pp.setQualification(s10);
            pp.setUsername(s11);
            pp.setPassword(s12);

            JOptionPane.showMessageDialog(this,"Applicant Profile updated successfully");
        }

       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MainLogin sapframe = new MainLogin(s);
        sapframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField age;
    public static javax.swing.JTextField bloodcentre;
    public static javax.swing.JTextField contact;
    public static javax.swing.JTextField date;
    public static javax.swing.JTextField emailid;
    public static javax.swing.JComboBox<String> gender;
    public static javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField name;
    public static javax.swing.JTextField password;
    public static javax.swing.JTextField qualification;
    public static javax.swing.JTextField username;
    public static javax.swing.JComboBox<String> usertype;
    // End of variables declaration//GEN-END:variables
}
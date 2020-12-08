package employeemanagement;

import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Ryan Curtis
 */
public class createCompany extends javax.swing.JFrame {

    Company cp;
    
    public createCompany() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createCompanyNext = new javax.swing.JButton();
        createCompanyBack = new javax.swing.JButton();
        companyNameLabel = new javax.swing.JLabel();
        industryLabel = new javax.swing.JLabel();
        establishedLabel = new javax.swing.JLabel();
        companyNameText = new javax.swing.JTextField();
        industryText = new javax.swing.JTextField();
        establishedText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createCompanyNext.setText("Create Departments");
        createCompanyNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCompanyNextActionPerformed(evt);
            }
        });

        createCompanyBack.setText("Back");
        createCompanyBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCompanyBackActionPerformed(evt);
            }
        });

        companyNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        companyNameLabel.setText("Company Name");

        industryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        industryLabel.setText("Industry");

        establishedLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        establishedLabel.setText("Established");

        companyNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyNameTextActionPerformed(evt);
            }
        });

        establishedText.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(companyNameLabel)
                            .addComponent(companyNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(industryLabel)
                            .addComponent(industryText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(establishedText, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(establishedLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(createCompanyBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createCompanyNext)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyNameLabel)
                    .addComponent(industryLabel)
                    .addComponent(establishedLabel))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(industryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(establishedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCompanyBack)
                    .addComponent(createCompanyNext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void createCompanyBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCompanyBackActionPerformed
        this.setVisible(false);
        new Console().setVisible(true);
    }//GEN-LAST:event_createCompanyBackActionPerformed
    private void createCompanyNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCompanyNextActionPerformed
        String currentPath = System.getProperty("user.dir");
        File folder = new File(currentPath + "\\Companies");
        File[] listFolder = folder.listFiles();
                
        createDepartments depts = new createDepartments(this, true);
        depts.setVisible(true);
        ArrayList<Department> deptArrayList = depts.getData();
        
        for(Department d : deptArrayList) { 
            ArrayList employeeArrayList = new ArrayList();
            createEmployees ce = new createEmployees(this, true);
            ce.setVisible(true);
            employeeArrayList = ce.getData();
            d.employees = employeeArrayList;
        } 
        cp = new Company(companyNameText.getText(), industryText.getText(),
                deptArrayList, Integer.parseInt(establishedText.getText()));
        
        BufferedWriter bw = null;        
        File file = new File(folder, companyNameText.getText() + ".txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("File Did Not Exist and Could Not Be Writtn");
            }
        }
        
        try {
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
        } catch (IOException ex) {
            System.out.println("Issues Making FileWriter or BufferedWriter");
        }
             
        try {
            bw.write(companyNameText.getText() + "\n" +
                   industryText.getText() + " Industry\n" 
                   + "est. " + establishedText.getText() + "\n\n");
            for(Department d : deptArrayList) {
                bw.write("   " + d.deptName + " dept.\n   Employees:" + "\n");
                for(Employee e : d.employees) {
                    bw.write(e + "\n");
                }
                bw.write("\n");
            }
        } catch (IOException ex) {
            System.out.println("Issues Writing to File");
        }
        
        try {
            bw.close();
        } catch (IOException ex) {
            System.out.println("Could Not Close BufferedWritter");
        }
    }//GEN-LAST:event_createCompanyNextActionPerformed

    private void companyNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyNameTextActionPerformed
    public Company getCompany() {
        return cp;
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(createCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createCompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel companyNameLabel;
    private javax.swing.JTextField companyNameText;
    private javax.swing.JButton createCompanyBack;
    private javax.swing.JButton createCompanyNext;
    private javax.swing.JLabel establishedLabel;
    private javax.swing.JTextField establishedText;
    private javax.swing.JLabel industryLabel;
    private javax.swing.JTextField industryText;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

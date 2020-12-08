package employeemanagement;

import java.io.*;
/**
 * @author Ryan Curtis
 */
public class seeCompanies extends javax.swing.JFrame {
    String currentPath = System.getProperty("user.dir");
    File folder = new File(currentPath + "\\Companies");
    File[] listFolder = folder.listFiles();
    String selectedFile = null;
    public seeCompanies() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        seeCompaniesButton = new javax.swing.JButton();
        seeCompanySelect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        companyTextArea = new javax.swing.JTextArea();
        seeCompaniesCombo = new javax.swing.JComboBox<>();
        companyBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("View Companies");

        seeCompaniesButton.setText("See Companies");
        seeCompaniesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeCompaniesButtonActionPerformed(evt);
            }
        });

        seeCompanySelect.setText("Select");
        seeCompanySelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeCompanySelectActionPerformed(evt);
            }
        });

        companyTextArea.setColumns(20);
        companyTextArea.setRows(5);
        jScrollPane1.setViewportView(companyTextArea);

        seeCompaniesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeCompaniesComboActionPerformed(evt);
            }
        });

        companyBackButton.setText("Back");
        companyBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(seeCompaniesButton)
                                .addGap(18, 18, 18)
                                .addComponent(seeCompanySelect))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(companyBackButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(seeCompaniesCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seeCompaniesButton)
                            .addComponent(seeCompanySelect))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(companyBackButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seeCompaniesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void seeCompaniesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeCompaniesButtonActionPerformed
        
        seeCompaniesCombo.removeAllItems();
        for(File f : listFolder) {
            seeCompaniesCombo.addItem(f.toString());
        }
        
        
    }//GEN-LAST:event_seeCompaniesButtonActionPerformed
    private void companyBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyBackButtonActionPerformed
        this.setVisible(false);
        new Console().setVisible(true);
    }//GEN-LAST:event_companyBackButtonActionPerformed
    private void seeCompaniesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeCompaniesComboActionPerformed
  
    }//GEN-LAST:event_seeCompaniesComboActionPerformed
    private void seeCompanySelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeCompanySelectActionPerformed
        BufferedReader br = null;
        String totalText = "";
        String selectedFile = (String)seeCompaniesCombo.getSelectedItem();
        
        try {   
            if(selectedFile != null) {
                br = new BufferedReader(new FileReader(new File(selectedFile)));
            }
            String line = "";
            try {
                while((line = br.readLine()) != null){
                    totalText += line + "\n";
                }
            } catch (Exception ex) {
                System.out.println("Issue Reading Lines!");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        }
        companyTextArea.setText(totalText);
    }//GEN-LAST:event_seeCompanySelectActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(seeCompanies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seeCompanies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seeCompanies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seeCompanies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seeCompanies().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton companyBackButton;
    private javax.swing.JTextArea companyTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton seeCompaniesButton;
    private javax.swing.JComboBox<String> seeCompaniesCombo;
    private javax.swing.JButton seeCompanySelect;
    // End of variables declaration//GEN-END:variables
}

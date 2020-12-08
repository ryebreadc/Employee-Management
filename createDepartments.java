package employeemanagement;

import java.util.ArrayList;
/**
 * @author Ryan Curtis
 */
public class createDepartments extends javax.swing.JDialog {
    ArrayList<Department> depts = new ArrayList();
    ArrayList totalName = new ArrayList();

    public createDepartments(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        departmentNameLabel = new javax.swing.JLabel();
        departmentNameText = new javax.swing.JTextField();
        createDeptAddButton = new javax.swing.JButton();
        departmentRemoveButton = new javax.swing.JButton();
        departmentsBackButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        departmentTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        departmentNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departmentNameLabel.setText("Department Name");

        createDeptAddButton.setText("Add");
        createDeptAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDeptAddButtonActionPerformed(evt);
            }
        });

        departmentRemoveButton.setText("Remove");
        departmentRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentRemoveButtonActionPerformed(evt);
            }
        });

        departmentsBackButton.setText("Back");
        departmentsBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentsBackButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        departmentTextArea.setColumns(20);
        departmentTextArea.setRows(5);
        jScrollPane1.setViewportView(departmentTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departmentNameLabel)
                    .addComponent(departmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(createDeptAddButton)
                        .addGap(18, 18, 18)
                        .addComponent(departmentRemoveButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(departmentsBackButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(departmentNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(departmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createDeptAddButton)
                            .addComponent(departmentRemoveButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departmentsBackButton)
                            .addComponent(jButton1))))
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
    private void createDeptAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDeptAddButtonActionPerformed
        String name = departmentNameText.getText();

        totalName.add(name);
        String returner = "";
        for(int i = 0; i < totalName.size(); i++) {
            returner += totalName.get(i) + "\n";
        }
        departmentTextArea.setText(returner);
        depts.add(new Department(departmentNameText.getText(), new ArrayList()));
    }//GEN-LAST:event_createDeptAddButtonActionPerformed
    private void departmentRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentRemoveButtonActionPerformed
        String name = departmentNameText.getText();
        for(int i = 0; i < totalName.size(); i++) {
            if(totalName.get(i).equals(name)) {
                totalName.remove(i);
                depts.remove(i);
            }
        }
        String returner = "";
        for(int i = 0; i < totalName.size(); i++) {
            returner += totalName.get(i) + "\n";
        }
        departmentTextArea.setText(returner);
    }//GEN-LAST:event_departmentRemoveButtonActionPerformed
    public ArrayList<Department> getData() {
        return depts;
    }
    private void departmentsBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentsBackButtonActionPerformed
        this.setVisible(false);
        new createCompany().setVisible(true);
    }//GEN-LAST:event_departmentsBackButtonActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
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
                createDepartments dialog = new createDepartments(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createDeptAddButton;
    private javax.swing.JLabel departmentNameLabel;
    private javax.swing.JTextField departmentNameText;
    private javax.swing.JButton departmentRemoveButton;
    private javax.swing.JTextArea departmentTextArea;
    private javax.swing.JButton departmentsBackButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

package employeemanagement;

import java.util.ArrayList;
/**
 * @author Ryan Curtis
 */
public class createEmployees extends javax.swing.JDialog {
    ArrayList totalName = new ArrayList();
    ArrayList<Employee> emps = new ArrayList();
    public createEmployees(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        employeeAddButton = new javax.swing.JButton();
        employeDoneButton = new javax.swing.JButton();
        employeeFullNameLabel = new javax.swing.JLabel();
        employeeFullNameText = new javax.swing.JTextField();
        employeePositionLabel = new javax.swing.JLabel();
        employeePositionText = new javax.swing.JTextField();
        employeeTimeLabel = new javax.swing.JLabel();
        employeeTimeText = new javax.swing.JTextField();
        employeeSalaryLabel = new javax.swing.JLabel();
        employeeSalaryText = new javax.swing.JTextField();
        employeeNumberLabel = new javax.swing.JLabel();
        employeeNumberText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTextArea = new javax.swing.JTextArea();
        employeeRemoveLabel = new javax.swing.JLabel();
        employeeRemoveText = new javax.swing.JTextField();
        employeeRemoveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        employeeAddButton.setText("Add Employee");
        employeeAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeAddButtonActionPerformed(evt);
            }
        });

        employeDoneButton.setText("Done");
        employeDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeDoneButtonActionPerformed(evt);
            }
        });

        employeeFullNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employeeFullNameLabel.setText("Full Name");

        employeePositionLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employeePositionLabel.setText("Position");

        employeeTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employeeTimeLabel.setText("Time at Company");

        employeeTimeText.setText("0");

        employeeSalaryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employeeSalaryLabel.setText("Salary");

        employeeSalaryText.setText("0");

        employeeNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employeeNumberLabel.setText("Employee Number");

        employeeNumberText.setText("0");

        employeeTextArea.setColumns(20);
        employeeTextArea.setRows(5);
        jScrollPane1.setViewportView(employeeTextArea);

        employeeRemoveLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employeeRemoveLabel.setText("Remove employee");

        employeeRemoveButton.setText("Remove");
        employeeRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeRemoveButtonActionPerformed(evt);
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(employeeSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(employeePositionText, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employeeFullNameLabel)
                                    .addComponent(employeeSalaryLabel))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(employeeNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(employeeNumberLabel)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(employeePositionLabel))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(employeeAddButton)
                                .addGap(18, 18, 18)
                                .addComponent(employeDoneButton)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeRemoveButton)
                            .addComponent(employeeRemoveLabel)
                            .addComponent(employeeRemoveText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeTimeLabel)))
                    .addComponent(employeeFullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeFullNameLabel)
                            .addComponent(employeeNumberLabel)
                            .addComponent(employeeTimeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeFullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeSalaryLabel)
                            .addComponent(employeePositionLabel)
                            .addComponent(employeeRemoveLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeePositionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeRemoveText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeRemoveButton)
                            .addComponent(employeeAddButton)
                            .addComponent(employeDoneButton))))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void employeeRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeRemoveButtonActionPerformed
        String name = employeeRemoveText.getText();
        for(int i = 0; i < totalName.size(); i++) {
            if(totalName.get(i).equals(name)) {
                totalName.remove(i);
                emps.remove(i);
            }
        }
        String returner = "";
        for(int i = 0; i < totalName.size(); i++) {
            returner += totalName.get(i) + "\n";
        }
        employeeTextArea.setText(returner);
    }//GEN-LAST:event_employeeRemoveButtonActionPerformed
    private void employeeAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeAddButtonActionPerformed
        String name = employeeFullNameText.getText();
        
        totalName.add(name);
        String returner = "";
        for(int i = 0; i < totalName.size(); i++) {
            returner += totalName.get(i) + "\n";
        }
        employeeTextArea.setText(returner);
        emps.add(new Employee(employeeFullNameText.getText(), employeePositionText.getText(),
                Integer.parseInt(employeeTimeText.getText()), Integer.parseInt(employeeSalaryText.getText()),
                Integer.parseInt(employeeNumberText.getText())));
    }//GEN-LAST:event_employeeAddButtonActionPerformed
    private void employeDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeDoneButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_employeDoneButtonActionPerformed
    public ArrayList getData() {
        return emps;
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
            java.util.logging.Logger.getLogger(createEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createEmployees dialog = new createEmployees(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton employeDoneButton;
    private javax.swing.JButton employeeAddButton;
    private javax.swing.JLabel employeeFullNameLabel;
    private javax.swing.JTextField employeeFullNameText;
    private javax.swing.JLabel employeeNumberLabel;
    private javax.swing.JTextField employeeNumberText;
    private javax.swing.JLabel employeePositionLabel;
    private javax.swing.JTextField employeePositionText;
    private javax.swing.JButton employeeRemoveButton;
    private javax.swing.JLabel employeeRemoveLabel;
    private javax.swing.JTextField employeeRemoveText;
    private javax.swing.JLabel employeeSalaryLabel;
    private javax.swing.JTextField employeeSalaryText;
    private javax.swing.JTextArea employeeTextArea;
    private javax.swing.JLabel employeeTimeLabel;
    private javax.swing.JTextField employeeTimeText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

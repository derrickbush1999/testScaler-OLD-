/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscaler;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author derri
 */
public class TSEditTest extends javax.swing.JFrame {

    /**
     * Creates new form TSEditTest
     */
    public TSEditTest() {
        initComponents();
    }
    
    public void tableFill()
    {
        Test testinfo = new Test();
        DefaultTableModel model = (DefaultTableModel) TestNameTable.getModel();
        ArrayList<String> tests = new ArrayList<>();
        tests = testinfo.testsToArray();
        for(int i = 0; i < tests.size(); i++)
        {
            model.addRow(new Object[]{i+1, tests.get(i)});
        }
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
        TestNameTable = new javax.swing.JTable();
        TestSizeLablel = new javax.swing.JLabel();
        TestNumText = new javax.swing.JTextField();
        NextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Test");
        setMinimumSize(new java.awt.Dimension(852, 755));
        setPreferredSize(new java.awt.Dimension(852, 755));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TestNameTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TestNameTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Test Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TestNameTable.setRowHeight(30);
        jScrollPane1.setViewportView(TestNameTable);
        if (TestNameTable.getColumnModel().getColumnCount() > 0) {
            TestNameTable.getColumnModel().getColumn(0).setMinWidth(100);
            TestNameTable.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        TestSizeLablel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TestSizeLablel.setText("Test number:");
        TestSizeLablel.setPreferredSize(new java.awt.Dimension(132, 30));

        TestNumText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TestNumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestNumTextActionPerformed(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NextButton.setText("NEXT");
        NextButton.setPreferredSize(new java.awt.Dimension(81, 37));
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TestSizeLablel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TestNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TestNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TestSizeLablel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
        Test Testinfo = new Test();
        DefaultTableModel model = (DefaultTableModel) TestNameTable.getModel();
        String hold = (model.getValueAt(Integer.valueOf(TestNumText.getText())-1, 1)).toString();
        new TSEditTestTests(hold).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NextButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tableFill();
        TestNumText.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void TestNumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestNumTextActionPerformed
        // TODO add your handling code here:
        Test Testinfo = new Test();
        DefaultTableModel model = (DefaultTableModel) TestNameTable.getModel();
        String hold = (model.getValueAt(Integer.valueOf(TestNumText.getText())-1, 1)).toString();
        new TSEditTestTests(hold).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TestNumTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TSEditTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TSEditTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TSEditTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TSEditTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TSEditTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NextButton;
    private javax.swing.JTable TestNameTable;
    private javax.swing.JTextField TestNumText;
    private javax.swing.JLabel TestSizeLablel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

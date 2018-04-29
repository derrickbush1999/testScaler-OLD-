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
public class TSRemoveTest extends javax.swing.JFrame {

    /**
     * Creates new form TSRemoveTest
     */
    public TSRemoveTest() {
        initComponents();
    }
    
    public void tableClear()
    {
        DefaultTableModel model = (DefaultTableModel) ClassTable.getModel();
        model.setRowCount(0);
    }
    public void tableFill()
    {
        Test testinfo = new Test();
        DefaultTableModel model = (DefaultTableModel) ClassTable.getModel();
        ArrayList<String> tests = new ArrayList<>();
        tests = testinfo.testsToArray();
        for(int i = 0; i < tests.size(); i++)
        {
            model.addRow(new Object[]{i+1, tests.get(i)});
        }
        ClassTable.setAutoCreateRowSorter(true);
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
        ClassTable = new javax.swing.JTable();
        ClassNumberLabel = new javax.swing.JLabel();
        ClassNumberText = new javax.swing.JTextField();
        NextButton = new javax.swing.JButton();
        DoneButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remove Test");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        ClassTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ClassTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Tests"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ClassTable.setRowHeight(30);
        jScrollPane1.setViewportView(ClassTable);
        if (ClassTable.getColumnModel().getColumnCount() > 0) {
            ClassTable.getColumnModel().getColumn(0).setMinWidth(100);
            ClassTable.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        ClassNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ClassNumberLabel.setText("Test Number:");

        ClassNumberText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ClassNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassNumberTextActionPerformed(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NextButton.setText("Next");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        DoneButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DoneButton.setText("Done");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ClassNumberLabel)
                        .addGap(12, 12, 12)
                        .addComponent(ClassNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(NextButton)
                        .addGap(18, 18, 18)
                        .addComponent(DoneButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ClassNumberLabel))
                            .addComponent(ClassNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NextButton)
                            .addComponent(DoneButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClassNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassNumberTextActionPerformed
        // TODO add your handling code here:
        Test testinfo = new Test();
        testinfo.DeleteTestNum(Integer.parseInt(ClassNumberText.getText())-1);
        tableClear();
        tableFill();
        ClassNumberText.setText("");
        ClassNumberText.requestFocus();
    }//GEN-LAST:event_ClassNumberTextActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
        Test testinfo = new Test();
        testinfo.DeleteTestNum(Integer.parseInt(ClassNumberText.getText())-1);
        tableClear();
        tableFill();
        ClassNumberText.setText("");
        ClassNumberText.requestFocus();
    }//GEN-LAST:event_NextButtonActionPerformed

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_DoneButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        tableFill();
        ClassNumberText.requestFocus();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(TSRemoveTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TSRemoveTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TSRemoveTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TSRemoveTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TSRemoveTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClassNumberLabel;
    private javax.swing.JTextField ClassNumberText;
    private javax.swing.JTable ClassTable;
    private javax.swing.JButton DoneButton;
    private javax.swing.JButton NextButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

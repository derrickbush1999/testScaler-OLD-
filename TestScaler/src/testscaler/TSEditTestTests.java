/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscaler;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author derri
 */
public class TSEditTestTests extends javax.swing.JFrame {

    /**
     * Creates new form TSEditTestTests
     */
    int ClassSize;
    private static ArrayList<String> names = new ArrayList<>(Arrays.asList());
    private static ArrayList<String> Score = new ArrayList<>(Arrays.asList());
    private static ArrayList<Double> Grade = new ArrayList<>(Arrays.asList());
    private static ArrayList<String> testValues = new ArrayList<>(Arrays.asList());
    String TestName;
    String ClassName;
    int testworth;
    public TSEditTestTests() {
        initComponents();
    }
    
    public TSEditTestTests(String testname) {
        initComponents();
        TestName = testname;
    }
    public void setValues()
    {
        Test testinfo = new Test();
        ArrayList<String> testvalues = new ArrayList<>();
        try {
            testvalues = testinfo.ValuesToArrayConsole(TestName);
        } catch (IOException ex) {
            Logger.getLogger(TSViewClassStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
        ClassSize = Integer.parseInt(testvalues.get(0));
        ClassName = testvalues.get(1);
        testworth = Integer.parseInt(testvalues.get(3));
        TestName = testvalues.get(2);
        for(int i = 4; i < testvalues.size(); i+=3)
        {
            names.add(testvalues.get(i));
            Score.add(testvalues.get(i+1));
            Grade.add(Double.parseDouble(testvalues.get(i+2)));
        }
        NamesTable.setAutoCreateRowSorter(true);
    }
    public void tableClear()
    {
        DefaultTableModel model = (DefaultTableModel) NamesTable.getModel();
        model.setRowCount(0);
        NamesTable.setAutoCreateRowSorter(true);
    }
    public void tableFill()
    {
        
        DefaultTableModel model = (DefaultTableModel) NamesTable.getModel();
        for(int i = 0; i < ClassSize; i++)
        {
            model.addRow(new Object[]{i+1, names.get(i), Score.get(i), Grade.get(i)});
        }
        NamesTable.setAutoCreateRowSorter(true);
    }
    public void tableFillGradeStart()
    {
        DefaultTableModel model = (DefaultTableModel) NamesTable.getModel();
        DecimalFormat round2 = new DecimalFormat("#.00");
        double hold;
        int avalue = 0;
        int bvalue = 0;
        int cvalue = 0;
        int dvalue = 0;
        int fvalue = 0;
        for(int i = 0; i < Grade.size(); i++)
        {
            hold = Grade.get(i);
            if(hold >= .90)
            {
                avalue++;
            }
            else if(hold >= .80)
            {
                bvalue++;
            }
            else if(hold >= .70)
            {
                cvalue++;
            }
            else if(hold >= .60)
            {
                dvalue++;
            }
            else{
                fvalue++;
            }
        }
        AValues.setText(String.valueOf(avalue));
        BValues.setText(String.valueOf(bvalue));
        CValues.setText(String.valueOf(cvalue));
        DValues.setText(String.valueOf(dvalue));
        FValues.setText(String.valueOf(fvalue));
        NamesTable.setAutoCreateRowSorter(true);
        NamesTable.setAutoCreateRowSorter(true);
    }
    public void tableFillGrade()
    {
        
        DefaultTableModel model = (DefaultTableModel) NamesTable.getModel();
        DecimalFormat round2 = new DecimalFormat("#.00");
        double hold;
        int avalue = 0;
        int bvalue = 0;
        int cvalue = 0;
        int dvalue = 0;
        int fvalue = 0;
        
        for(int i = 0; i < Score.size(); i++)
        {
            hold = Double.parseDouble(round2.format((Double.parseDouble(Score.get(i)))/testworth));
            Grade.set(i, hold);
            if(hold >= .90)
            {
                avalue++;
            }
            else if(hold >= .80)
            {
                bvalue++;
            }
            else if(hold >= .70)
            {
                cvalue++;
            }
            else if(hold >= .60)
            {
                dvalue++;
            }
            else{
                fvalue++;
            }
        }
        
        AValues.setText(String.valueOf(avalue));
        BValues.setText(String.valueOf(bvalue));
        CValues.setText(String.valueOf(cvalue));
        DValues.setText(String.valueOf(dvalue));
        FValues.setText(String.valueOf(fvalue));
        for(int i = 0; i < Grade.size(); i++)
        {
            String name = names.get(i);
            String score = Score.get(i);
            String grade = Grade.get(i).toString();
            model.addRow(new Object[]{i+1, name, score, grade});
        }
        NamesTable.setAutoCreateRowSorter(true);
    }
    public void testValuesFill()
    {
        for(int i = 0; i < Grade.size(); i++)
        {
            testValues.add(names.get(i));
            testValues.add(Score.get(i));
            testValues.add(Grade.get(i).toString());
        }
    }
    public void testValuesClear()
    {
        testValues.clear();
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
        NamesTable = new javax.swing.JTable();
        ChangeGradeCheckBox = new javax.swing.JCheckBox();
        ChangeWorthCheckBox = new javax.swing.JCheckBox();
        StudentNumberLabel = new javax.swing.JLabel();
        StudentNumberText = new javax.swing.JTextField();
        StudentGradeLabel = new javax.swing.JLabel();
        StudentGradeText = new javax.swing.JTextField();
        DoneButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        TestWorthLabel = new javax.swing.JLabel();
        TestWorthText = new javax.swing.JTextField();
        BValues = new javax.swing.JLabel();
        CValues = new javax.swing.JLabel();
        DValues = new javax.swing.JLabel();
        FValues = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AValues = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Test Info");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        NamesTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NamesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Names", "Points", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NamesTable.setRowHeight(30);
        jScrollPane1.setViewportView(NamesTable);
        if (NamesTable.getColumnModel().getColumnCount() > 0) {
            NamesTable.getColumnModel().getColumn(0).setMinWidth(100);
            NamesTable.getColumnModel().getColumn(0).setMaxWidth(100);
            NamesTable.getColumnModel().getColumn(2).setMinWidth(100);
            NamesTable.getColumnModel().getColumn(2).setMaxWidth(100);
            NamesTable.getColumnModel().getColumn(3).setMinWidth(100);
            NamesTable.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        ChangeGradeCheckBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ChangeGradeCheckBox.setText("Change Grade");
        ChangeGradeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeGradeCheckBoxActionPerformed(evt);
            }
        });

        ChangeWorthCheckBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ChangeWorthCheckBox.setText("Change Worth");
        ChangeWorthCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeWorthCheckBoxActionPerformed(evt);
            }
        });

        StudentNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StudentNumberLabel.setText("Student Number:");

        StudentNumberText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StudentNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNumberTextActionPerformed(evt);
            }
        });

        StudentGradeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StudentGradeLabel.setText("Student Points:");

        StudentGradeText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StudentGradeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentGradeTextActionPerformed(evt);
            }
        });

        DoneButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DoneButton.setText("Done");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NextButton.setText("Refresh");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        TestWorthLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TestWorthLabel.setText("Test Worth:");

        TestWorthText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TestWorthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestWorthTextActionPerformed(evt);
            }
        });

        BValues.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BValues.setText("0");

        CValues.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CValues.setText("0");

        DValues.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DValues.setText("0");

        FValues.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FValues.setText("0");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("A");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("B");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("C");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("D");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("F");

        AValues.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AValues.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TestWorthLabel)
                                        .addGap(4, 4, 4)
                                        .addComponent(TestWorthText, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(StudentNumberLabel)
                                            .addGap(4, 4, 4)
                                            .addComponent(StudentNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(StudentGradeLabel)
                                            .addGap(4, 4, 4)
                                            .addComponent(StudentGradeText, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FValues)
                                            .addComponent(DValues)
                                            .addComponent(CValues)
                                            .addComponent(BValues)
                                            .addComponent(AValues)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ChangeGradeCheckBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(ChangeWorthCheckBox)))))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NextButton)
                        .addGap(18, 18, 18)
                        .addComponent(DoneButton)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChangeWorthCheckBox)
                            .addComponent(ChangeGradeCheckBox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(StudentNumberLabel))
                            .addComponent(StudentNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(StudentGradeLabel))
                            .addComponent(StudentGradeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(TestWorthLabel))
                            .addComponent(TestWorthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NextButton)
                            .addComponent(DoneButton))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(AValues))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(BValues))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CValues))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(DValues))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(FValues))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChangeGradeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeGradeCheckBoxActionPerformed
        // TODO add your handling code here:
        ChangeWorthCheckBox.setSelected(false);
        StudentGradeLabel.setVisible(true);
        StudentGradeText.setVisible(true);
        StudentNumberLabel.setVisible(true);
        StudentNumberText.setVisible(true);
        TestWorthLabel.setVisible(false);
        TestWorthText.setVisible(false);
        StudentNumberText.requestFocus();
    }//GEN-LAST:event_ChangeGradeCheckBoxActionPerformed

    private void ChangeWorthCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeWorthCheckBoxActionPerformed
        // TODO add your handling code here:
        ChangeGradeCheckBox.setSelected(false);
        StudentGradeLabel.setVisible(false);
        StudentGradeText.setVisible(false);
        StudentNumberLabel.setVisible(false);
        StudentNumberText.setVisible(false);
        TestWorthLabel.setVisible(true);
        TestWorthText.setVisible(true);
        TestWorthText.requestFocus();
    }//GEN-LAST:event_ChangeWorthCheckBoxActionPerformed

    private void StudentNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNumberTextActionPerformed
        // TODO add your handling code here:
//        Class classinfo = new Class();
//        try {
//            classinfo.RemoveStudent(ClassName, Integer.parseInt(StudentNumberText.getText())-1);
//        } catch (IOException ex) {
//            Logger.getLogger(TSEditClassStudents.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        tableClear();
//        tableFill();
//        StudentNumberText.setText("");
    }//GEN-LAST:event_StudentNumberTextActionPerformed

    private void StudentGradeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentGradeTextActionPerformed
        // TODO add your handling code here:
        Score.set(Integer.parseInt(StudentNumberText.getText())-1, String.valueOf(StudentGradeText.getText()));
            testValuesClear();
            tableClear();
            tableFillGrade();
            testValuesFill();
            Test testreset = new Test();
            try {
                testreset.ResetTest(TestName, ClassName, testValues, ClassSize, testworth);
            } catch (IOException ex) {
                Logger.getLogger(TSEditTestTests.class.getName()).log(Level.SEVERE, null, ex);
            }
            StudentNumberText.setText("");
            StudentGradeText.setText("");
            StudentNumberText.requestFocus();
    }//GEN-LAST:event_StudentGradeTextActionPerformed

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_DoneButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
        if(ChangeWorthCheckBox.isSelected() == true)
        {
            testworth = Integer.parseInt(TestWorthText.getText());
            testValuesClear();
            tableClear();
            tableFillGrade();
            testValuesFill();
            Test testreset = new Test();
            try {
                testreset.ResetTest(TestName, ClassName, testValues, ClassSize, testworth);
            } catch (IOException ex) {
                Logger.getLogger(TSEditTestTests.class.getName()).log(Level.SEVERE, null, ex);
            }
            TestWorthText.setText("");
        }
        if(ChangeGradeCheckBox.isSelected() == true)
        {
            Score.set(Integer.parseInt(StudentNumberText.getText())-1, String.valueOf(StudentGradeText.getText()));
            testValuesClear();
            tableClear();
            tableFillGrade();
            testValuesFill();
            Test testreset = new Test();
            try {
                testreset.ResetTest(TestName, ClassName, testValues, ClassSize, testworth);
            } catch (IOException ex) {
                Logger.getLogger(TSEditTestTests.class.getName()).log(Level.SEVERE, null, ex);
            }
            StudentNumberText.setText("");
            StudentGradeText.setText("");
            StudentNumberText.requestFocus();
        }
    }//GEN-LAST:event_NextButtonActionPerformed

    private void TestWorthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestWorthTextActionPerformed
        // TODO add your handling code here:
        testworth = Integer.parseInt(TestWorthText.getText());
            testValuesClear();
            tableClear();
            tableFillGrade();
            testValuesFill();
            Test testreset = new Test();
            try {
                testreset.ResetTest(TestName, ClassName, testValues, ClassSize, testworth);
            } catch (IOException ex) {
                Logger.getLogger(TSEditTestTests.class.getName()).log(Level.SEVERE, null, ex);
            }
            TestWorthText.setText("");
    }//GEN-LAST:event_TestWorthTextActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setValues();
        tableFill();
        tableFillGradeStart();
        ChangeGradeCheckBox.setSelected(true);
        StudentGradeLabel.setVisible(true);
        StudentGradeText.setVisible(true);
        StudentNumberLabel.setVisible(true);
        StudentNumberText.setVisible(true);
        TestWorthLabel.setVisible(false);
        TestWorthText.setVisible(false);
        StudentNumberText.requestFocus();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TSEditTestTests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TSEditTestTests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TSEditTestTests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TSEditTestTests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TSEditTestTests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AValues;
    private javax.swing.JLabel BValues;
    private javax.swing.JLabel CValues;
    private javax.swing.JCheckBox ChangeGradeCheckBox;
    private javax.swing.JCheckBox ChangeWorthCheckBox;
    private javax.swing.JLabel DValues;
    private javax.swing.JButton DoneButton;
    private javax.swing.JLabel FValues;
    private javax.swing.JTable NamesTable;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel StudentGradeLabel;
    private javax.swing.JTextField StudentGradeText;
    private javax.swing.JLabel StudentNumberLabel;
    private javax.swing.JTextField StudentNumberText;
    private javax.swing.JLabel TestWorthLabel;
    private javax.swing.JTextField TestWorthText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

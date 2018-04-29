package testscaler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
public class TSNewTestStudents extends javax.swing.JFrame{
    String TestName;
    String ClassName;
    String ValueTextV;
    int counter;
    private static ArrayList<String> names = new ArrayList<>(Arrays.asList());
    private static ArrayList<String> Score = new ArrayList<>(Arrays.asList());
    private static ArrayList<Double> Grade = new ArrayList<>(Arrays.asList());
    public TSNewTestStudents() {
        initComponents();
    }
    public TSNewTestStudents(String Testname, String Classname) {
        initComponents();
        TestName = Testname;
        ClassName = Classname;
    }
    public void tableClear()
    {
        DefaultTableModel model = (DefaultTableModel) GradeTable.getModel();
        model.setRowCount(0);
    }
    public void tableFillName()
    {
        DefaultTableModel model = (DefaultTableModel) GradeTable.getModel();
        for(int i = 0; i < names.size(); i++)
        {
            model.addRow(new Object[]{names.get(i)});
        }
    }
    public void tableFillScore()
    {
        DefaultTableModel model = (DefaultTableModel) GradeTable.getModel();
        for(int i = 0; i < Score.size(); i++)
        {
            String name = names.get(i);
            String score = Score.get(i);
            model.addRow(new Object[]{name, score});
        }
        for(int i = Score.size(); i < names.size(); i++)
        {
            String name = names.get(i);
            model.addRow(new Object[]{name});
        }
    }
    public void tableScoreRow()
    {
        int rowcount = GradeTable.getRowCount();
        
        for(int i = 0; i < rowcount; i++)
        {
        Score.add(GradeTable.getValueAt(i, 1).toString());
        }
    }
    public void tableFillGrade()
    {
        ValueTextV= ValueText.getText();
        DefaultTableModel model = (DefaultTableModel) GradeTable.getModel();
        DecimalFormat round2 = new DecimalFormat("#.00");
        double hold;
        int avalue = 0;
        int bvalue = 0;
        int cvalue = 0;
        int dvalue = 0;
        int fvalue = 0;
        for(int i = 0; i < Score.size(); i++)
        {
            hold = Double.parseDouble(round2.format((Double.parseDouble(Score.get(i)))/(Double.parseDouble(ValueText.getText()))));
            Grade.add(hold);
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
            model.addRow(new Object[]{name, score, grade});
        }
        
        GradeTable.setAutoCreateRowSorter(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        GradeTable = new javax.swing.JTable();
        StudentNameLabel = new javax.swing.JLabel();
        GradeText = new javax.swing.JTextField();
        GradeNextButton = new javax.swing.JButton();
        TestValueLabel = new javax.swing.JLabel();
        ValueText = new javax.swing.JTextField();
        ValueRefreshButton = new javax.swing.JButton();
        DoneButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AValues = new javax.swing.JLabel();
        BValues = new javax.swing.JLabel();
        CValues = new javax.swing.JLabel();
        DValues = new javax.swing.JLabel();
        FValues = new javax.swing.JLabel();
        NameRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Test Info");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        GradeTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        GradeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Points", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GradeTable.setRowHeight(30);
        jScrollPane1.setViewportView(GradeTable);
        if (GradeTable.getColumnModel().getColumnCount() > 0) {
            GradeTable.getColumnModel().getColumn(2).setMinWidth(100);
            GradeTable.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        StudentNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StudentNameLabel.setText("\"Student Name\"");

        GradeText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        GradeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradeTextActionPerformed(evt);
            }
        });

        GradeNextButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        GradeNextButton.setText("Next");
        GradeNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradeNextButtonActionPerformed(evt);
            }
        });

        TestValueLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TestValueLabel.setText("Test Value:");

        ValueText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ValueText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValueTextActionPerformed(evt);
            }
        });

        ValueRefreshButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ValueRefreshButton.setText("Refresh");
        ValueRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValueRefreshButtonActionPerformed(evt);
            }
        });

        DoneButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DoneButton.setText("Done");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });

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

        BValues.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BValues.setText("0");

        CValues.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CValues.setText("0");

        DValues.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DValues.setText("0");

        FValues.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FValues.setText("0");

        NameRefresh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NameRefresh.setText("Refresh");
        NameRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(DoneButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameRefresh)
                                .addGap(31, 31, 31)
                                .addComponent(GradeNextButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(StudentNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(GradeText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TestValueLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ValueText, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ValueRefreshButton)))
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
                                        .addComponent(AValues)))))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StudentNameLabel)
                            .addComponent(GradeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GradeNextButton)
                            .addComponent(NameRefresh))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ValueText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TestValueLabel)
                            .addComponent(ValueRefreshButton))
                        .addGap(60, 60, 60)
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
                            .addComponent(FValues))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                        .addComponent(DoneButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        names.clear();
        Score.clear();
        Grade.clear();
        Class classinfo = new Class();
        try {
            names = classinfo.NamesToArray(ClassName);
        } catch (IOException ex) {
            Logger.getLogger(TSViewClassStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
        counter = 0;
        StudentNameLabel.setText(names.get(counter));
        tableFillName();
        StudentNameLabel.setVisible(true);
        GradeText.setVisible(true);
        GradeNextButton.setVisible(true);
        NameRefresh.setVisible(true);
        TestValueLabel.setVisible(false);
        ValueText.setVisible(false);
        ValueRefreshButton.setVisible(false);
        GradeText.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void GradeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradeTextActionPerformed
        // TODO add your handling code here:
        tableClear();
        Score.add(GradeText.getText().toString());
        tableFillScore();
        counter++;
        if(counter < names.size())
        {
            StudentNameLabel.setText(names.get(counter));
        }
        if(Score.size() >= names.size())
        {
            StudentNameLabel.setVisible(false);
            GradeText.setVisible(false);
            GradeNextButton.setVisible(false);
            NameRefresh.setVisible(false);
            TestValueLabel.setVisible(true);
            ValueText.setVisible(true);
            ValueRefreshButton.setVisible(true);
            ValueText.requestFocus();
        }
        GradeText.setText("");
    }//GEN-LAST:event_GradeTextActionPerformed

    private void GradeNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradeNextButtonActionPerformed
        // TODO add your handling code here:
        tableClear();
        Score.add(GradeText.getText().toString());
        tableFillScore();
        counter++;
        if(counter < names.size())
        {
            StudentNameLabel.setText(names.get(counter));
        }
        if(Score.size() >= names.size())
        {
            StudentNameLabel.setVisible(false);
            GradeText.setVisible(false);
            GradeNextButton.setVisible(false);
            NameRefresh.setVisible(false);
            TestValueLabel.setVisible(true);
            ValueText.setVisible(true);
            ValueRefreshButton.setVisible(true);
            ValueText.requestFocus();
        }
        GradeText.setText("");
    }//GEN-LAST:event_GradeNextButtonActionPerformed

    private void ValueRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValueRefreshButtonActionPerformed
        // TODO add your handling code here:
        tableClear();
        Grade.clear();
        tableFillGrade();
        ValueText.setText("");
    }//GEN-LAST:event_ValueRefreshButtonActionPerformed

    private void ValueTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValueTextActionPerformed
        // TODO add your handling code here:
        tableClear();
        Grade.clear();
        tableFillGrade();
        ValueText.setText("");
    }//GEN-LAST:event_ValueTextActionPerformed

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<String> testvalues = new ArrayList<>(Arrays.asList());
        Test testcreator = new Test();
        for( int r = 0; r < GradeTable.getRowCount(); r++)
        {
            for(int c = 0; c < GradeTable.getColumnCount(); c++)
            {
                testvalues.add(GradeTable.getValueAt(r, c).toString());
            }
        }
        try {
            testcreator.AddTest(TestName, ClassName, testvalues, GradeTable.getRowCount(), Integer.parseInt(ValueTextV));
        } catch (IOException ex) {
            Logger.getLogger(TSNewTestStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_DoneButtonActionPerformed

    private void NameRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameRefreshActionPerformed
        // TODO add your handling code here:
        tableScoreRow();
        StudentNameLabel.setVisible(false);
        GradeText.setVisible(false);
        GradeNextButton.setVisible(false);
        NameRefresh.setVisible(false);
        TestValueLabel.setVisible(true);
        ValueText.setVisible(true);
        ValueRefreshButton.setVisible(true);
        ValueText.setText("");
        ValueText.requestFocus();
    }//GEN-LAST:event_NameRefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TSNewTestStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AValues;
    private javax.swing.JLabel BValues;
    private javax.swing.JLabel CValues;
    private javax.swing.JLabel DValues;
    private javax.swing.JButton DoneButton;
    private javax.swing.JLabel FValues;
    private javax.swing.JButton GradeNextButton;
    private javax.swing.JTable GradeTable;
    private javax.swing.JTextField GradeText;
    private javax.swing.JButton NameRefresh;
    private javax.swing.JLabel StudentNameLabel;
    private javax.swing.JLabel TestValueLabel;
    private javax.swing.JButton ValueRefreshButton;
    private javax.swing.JTextField ValueText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

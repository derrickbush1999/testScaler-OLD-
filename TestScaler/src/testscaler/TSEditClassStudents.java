package testscaler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class TSEditClassStudents extends javax.swing.JFrame {
    String ClassName;
    public TSEditClassStudents() {
        initComponents();
    }
    public TSEditClassStudents(String classinfo) {
        initComponents();
        ClassName = classinfo;
    }
    public void tableClear()
    {
        DefaultTableModel model = (DefaultTableModel) NamesTable.getModel();
        model.setRowCount(0);
    }
    public void tableFill()
    {
        Class classinfo = new Class();
        DefaultTableModel model = (DefaultTableModel) NamesTable.getModel();
        ArrayList<String> names = new ArrayList<>();
        try {
            names = classinfo.NamesToArray(ClassName);
        } catch (IOException ex) {
            Logger.getLogger(TSViewClassStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i = 0; i < names.size(); i++)
        {
            model.addRow(new Object[]{i+1, names.get(i)});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        NamesTable = new javax.swing.JTable();
        DoneButton = new javax.swing.JButton();
        RemoveCheckBox = new javax.swing.JCheckBox();
        AddCheckBox = new javax.swing.JCheckBox();
        StudentNumberLabel = new javax.swing.JLabel();
        StudentNumberText = new javax.swing.JTextField();
        StudentNameLabel = new javax.swing.JLabel();
        StudentNameText = new javax.swing.JTextField();
        NextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Student Info");
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
                "Number", "Names"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
        }

        DoneButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DoneButton.setText("Done");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });

        RemoveCheckBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RemoveCheckBox.setText("Remove");
        RemoveCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveCheckBoxActionPerformed(evt);
            }
        });

        AddCheckBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddCheckBox.setText("Add");
        AddCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCheckBoxActionPerformed(evt);
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

        StudentNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StudentNameLabel.setText("Student Name:");

        StudentNameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        StudentNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNameTextActionPerformed(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NextButton.setText("Next");
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
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(RemoveCheckBox)
                        .addGap(38, 38, 38)
                        .addComponent(AddCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StudentNumberLabel)
                        .addGap(4, 4, 4)
                        .addComponent(StudentNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StudentNameLabel)
                        .addGap(4, 4, 4)
                        .addComponent(StudentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(NextButton)
                        .addGap(18, 18, 18)
                        .addComponent(DoneButton)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RemoveCheckBox)
                            .addComponent(AddCheckBox))
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
                                .addComponent(StudentNameLabel))
                            .addComponent(StudentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NextButton)
                            .addComponent(DoneButton))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_DoneButtonActionPerformed

    private void RemoveCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveCheckBoxActionPerformed
        // TODO add your handling code here:
        AddCheckBox.setSelected(false);
        StudentNameLabel.setVisible(false);
        StudentNameText.setVisible(false);
        StudentNumberLabel.setVisible(true);
        StudentNumberText.setVisible(true);
        StudentNumberText.requestFocus();
    }//GEN-LAST:event_RemoveCheckBoxActionPerformed

    private void AddCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCheckBoxActionPerformed
        // TODO add your handling code here:
        RemoveCheckBox.setSelected(false);
        StudentNameLabel.setVisible(true);
        StudentNameText.setVisible(true);
        StudentNumberLabel.setVisible(false);
        StudentNumberText.setVisible(false);
        StudentNameText.requestFocus();
    }//GEN-LAST:event_AddCheckBoxActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tableFill();
        RemoveCheckBox.setSelected(true);
        AddCheckBox.setSelected(false);
        StudentNameLabel.setVisible(false);
        StudentNameText.setVisible(false);
        StudentNumberLabel.setVisible(true);
        StudentNumberText.setVisible(true);
        StudentNumberText.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
        if(AddCheckBox.isSelected() == true)
        {
            Class classinfo = new Class();
            try {
                classinfo.AddStudent(ClassName, StudentNameText.getText());
            } catch (IOException ex) {
                Logger.getLogger(TSEditClassStudents.class.getName()).log(Level.SEVERE, null, ex);
            }
            tableClear();
            tableFill();
            StudentNameText.setText("");
        }
        if(RemoveCheckBox.isSelected() == true)
        {
            Class classinfo = new Class();
            try {
                classinfo.RemoveStudent(ClassName, Integer.parseInt(StudentNumberText.getText())-1);
            } catch (IOException ex) {
                Logger.getLogger(TSEditClassStudents.class.getName()).log(Level.SEVERE, null, ex);
            }
            tableClear();
            tableFill();
            StudentNumberText.setText("");
        }
    }//GEN-LAST:event_NextButtonActionPerformed

    private void StudentNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNumberTextActionPerformed
        // TODO add your handling code here:
        Class classinfo = new Class();
            try {
                classinfo.RemoveStudent(ClassName, Integer.parseInt(StudentNumberText.getText())-1);
            } catch (IOException ex) {
                Logger.getLogger(TSEditClassStudents.class.getName()).log(Level.SEVERE, null, ex);
            }
            tableClear();
            tableFill();
            StudentNumberText.setText("");
    }//GEN-LAST:event_StudentNumberTextActionPerformed

    private void StudentNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNameTextActionPerformed
        // TODO add your handling code here:
        Class classinfo = new Class();
            try {
                classinfo.AddStudent(ClassName, StudentNameText.getText());
            } catch (IOException ex) {
                Logger.getLogger(TSEditClassStudents.class.getName()).log(Level.SEVERE, null, ex);
            }
            tableClear();
            tableFill();
            StudentNameText.setText("");
    }//GEN-LAST:event_StudentNameTextActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TSEditClassStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AddCheckBox;
    private javax.swing.JButton DoneButton;
    private javax.swing.JTable NamesTable;
    private javax.swing.JButton NextButton;
    private javax.swing.JCheckBox RemoveCheckBox;
    private javax.swing.JLabel StudentNameLabel;
    private javax.swing.JTextField StudentNameText;
    private javax.swing.JLabel StudentNumberLabel;
    private javax.swing.JTextField StudentNumberText;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

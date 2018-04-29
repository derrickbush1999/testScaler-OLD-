package testscaler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class TSAddClassStudents extends javax.swing.JFrame {
    private String ClassName;
    private int Counter=1;
    private int ClassSize;
    public TSAddClassStudents() {
        initComponents();
    }
    public TSAddClassStudents(String classname, int classsize) {
        initComponents();
        ClassName = classname;
        ClassSize = classsize;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StudentNameLabel = new javax.swing.JLabel();
        StudentNameText = new javax.swing.JTextField();
        NextButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        NameTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Students");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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

        NameTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NameTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NameTable.setRowHeight(30);
        jScrollPane1.setViewportView(NameTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StudentNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StudentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StudentNameLabel)
                            .addComponent(StudentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
        Class classinfo = new Class();
        if(Counter+1 == ClassSize)
            NextButton.setText("Done");
        if(Counter <= ClassSize-1)
        {
        DefaultTableModel model = (DefaultTableModel) NameTable.getModel();
        model.addRow(new Object[]{StudentNameText.getText()});
        StudentNameText.setText("");
        Counter++;
        StudentNameText.requestFocus();
        }
        else
        {
        DefaultTableModel model = (DefaultTableModel) NameTable.getModel();
        model.addRow(new Object[]{StudentNameText.getText()});
        ArrayList<String> names = new ArrayList<>();
        for (int runner = 0; runner < model.getRowCount(); runner++)
        {
            names.add(model.getValueAt(runner, 0).toString());
        }
            try {
                classinfo.AddClass(names, ClassName, ClassSize);
            } catch (IOException ex) {
                Logger.getLogger(TSAddClassStudents.class.getName()).log(Level.SEVERE, null, ex);
            }
        this.dispose();
        }
    }//GEN-LAST:event_NextButtonActionPerformed

    private void StudentNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNameTextActionPerformed
        // TODO add your handling code here:
        Class classinfo = new Class();
        if(Counter+1 == ClassSize)
            NextButton.setText("Done");
        if(Counter <= ClassSize-1)
        {
        DefaultTableModel model = (DefaultTableModel) NameTable.getModel();
        model.addRow(new Object[]{StudentNameText.getText()});
        StudentNameText.setText("");
        Counter++;
        }
        else
        {
        DefaultTableModel model = (DefaultTableModel) NameTable.getModel();
        model.addRow(new Object[]{StudentNameText.getText()});
        StudentNameText.setText("");
        ArrayList<String> names = new ArrayList<>();
        for (int runner = 0; runner < model.getRowCount(); runner++)
        {
            names.add(model.getValueAt(runner, 0).toString());
        }
            try {
                classinfo.AddClass(names, ClassName, ClassSize);
            } catch (IOException ex) {
                Logger.getLogger(TSAddClassStudents.class.getName()).log(Level.SEVERE, null, ex);
            }
        this.dispose();
        }
    }//GEN-LAST:event_StudentNameTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TSAddClassStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable NameTable;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel StudentNameLabel;
    private javax.swing.JTextField StudentNameText;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

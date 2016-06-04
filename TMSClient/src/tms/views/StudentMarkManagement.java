/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.views;

import SeverConnector.Connector;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import tms.controllercommon.ClassController;
import tms.controllercommon.ExamController;
import tms.controllercommon.PaperController;
import tms.controllercommon.StudentController;
import tms.model.ClassS;
import tms.model.Exam;
import tms.model.Paper;
import tms.model.Student;

/**
 *
 * @author Gimhani Uthpala
 */
public class StudentMarkManagement extends javax.swing.JDialog {

    PaperController paperController;
    ClassController classController;
    StudentController studentController;
    ExamController examController;

    /**
     * Creates new form StudentMarkManagement
     */
    public StudentMarkManagement(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            Connector sConnector = Connector.getSConnector();
            paperController = sConnector.getPaperController();
            classController = sConnector.getClassController();
            studentController = sConnector.getStudentController();
            examController=sConnector.getExamController();
        } catch (SQLException | ClassNotFoundException | NotBoundException | MalformedURLException | RemoteException | InterruptedException ex) {
            Logger.getLogger(StudentMarkManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        setPaperID();
        loadClassCombo();
        loadPaperIdCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        paperIdAddMarkL = new javax.swing.JLabel();
        paperIdAddMarkT = new javax.swing.JTextField();
        classIdAddMarkL = new javax.swing.JLabel();
        classIdAddMarkC = new javax.swing.JComboBox<>();
        loadAddMarkB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        conductedDateT = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addStudentMarkTable = new javax.swing.JTable();
        addMarkB = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        paperIdAddMarkL1 = new javax.swing.JLabel();
        paperIdCombo = new javax.swing.JComboBox<>();
        loadAddMarkB1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        edittable = new javax.swing.JTable();
        editB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        paperIdAddMarkL.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        paperIdAddMarkL.setText("Paper Id");

        paperIdAddMarkT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperIdAddMarkTActionPerformed(evt);
            }
        });

        classIdAddMarkL.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        classIdAddMarkL.setText("Class Id");

        classIdAddMarkC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classIdAddMarkCActionPerformed(evt);
            }
        });

        loadAddMarkB.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        loadAddMarkB.setText("Load");
        loadAddMarkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadAddMarkBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel1.setText("Conducted Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paperIdAddMarkL, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(classIdAddMarkL, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paperIdAddMarkT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(classIdAddMarkC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(loadAddMarkB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(conductedDateT, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paperIdAddMarkL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paperIdAddMarkT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(classIdAddMarkL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classIdAddMarkC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conductedDateT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loadAddMarkB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addStudentMarkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Student Id", "Mark"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(addStudentMarkTable);

        addMarkB.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        addMarkB.setText("Add Mark");
        addMarkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMarkBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addMarkB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addMarkB)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Student Mark", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        paperIdAddMarkL1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        paperIdAddMarkL1.setText("Paper Id");

        paperIdCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperIdComboActionPerformed(evt);
            }
        });

        loadAddMarkB1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        loadAddMarkB1.setText("Load");
        loadAddMarkB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadAddMarkB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(paperIdAddMarkL1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(paperIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(loadAddMarkB1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paperIdAddMarkL1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paperIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loadAddMarkB1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        edittable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Student Id", "Mark"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(edittable);

        editB.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        editB.setText("Edit Mark");
        editB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editB)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Edit Student Mark", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paperIdAddMarkTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperIdAddMarkTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paperIdAddMarkTActionPerformed

    private void classIdAddMarkCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classIdAddMarkCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classIdAddMarkCActionPerformed

    private void loadAddMarkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadAddMarkBActionPerformed
        try {
            String classId = String.valueOf(classIdAddMarkC.getSelectedItem());
            ArrayList<Student> studentOfClass = studentController.getStudentOfClass(classId);

            DefaultTableModel tableModel = (DefaultTableModel) addStudentMarkTable.getModel();
            tableModel.getDataVector().removeAllElements();
            revalidate();
            for (Student student : studentOfClass) {
                tableModel.addRow(new Object[]{student.getName(), student.getStudentId(), null});
            }
        } catch (RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentMarkManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadAddMarkBActionPerformed

    private void addMarkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMarkBActionPerformed
        try {
            String paperId = paperIdAddMarkT.getText();
            String conductedDate = conductedDateT.getText();
            String classId = String.valueOf(classIdAddMarkC.getSelectedItem());
            ClassS searchClass = classController.searchClass(classId);
            int grade = searchClass.getGrade();
            Paper paper = new Paper(paperId, conductedDate, classId, grade);

            ArrayList<Exam> results = new ArrayList<Exam>();

            DefaultTableModel model = (DefaultTableModel) addStudentMarkTable.getModel();

            for (int count = 0; count < model.getRowCount(); count++) {

                String studentId = model.getValueAt(count, 1).toString();
                Student student = studentController.searchStudent(studentId);
                int mark = Integer.parseInt(model.getValueAt(count, 2).toString());
                Exam exam = new Exam(student, paper, mark, 0);
                results.add(exam);
            }

            Collections.sort(results, new Comparator<Exam>() {
                @Override
                public int compare(Exam exam1, Exam exam2) {
                    if (exam1.getMark() > exam2.getMark()) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            });
            ArrayList<Exam> resultfinal = new ArrayList<Exam>();
            int topScore = 0;
            int count = 1;
            double totalmark = 0;
            for (Exam result : results) {
                if (result.getMark() > 0) {
                    resultfinal.add(result);
                    result.setRank(count);
                    if (topScore < result.getMark()) {
                        topScore = result.getMark();
                    }
                    totalmark += result.getMark();
                    count++;
                }
            }
            paper.setNumberOfFacedStudent(count-1);
            paper.setTopScore(topScore);
            paper.setAverage(totalmark/count);
            boolean addNewExamResult = examController.addNewExamResult(paper, results);
            if(addNewExamResult){
                JOptionPane.showMessageDialog(this,"result is added successfully");
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this,"result is not added successfully");
            }
        } catch (RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentMarkManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addMarkBActionPerformed

    private void loadAddMarkB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadAddMarkB1ActionPerformed
        try {
            String paperId = String.valueOf(paperIdCombo.getSelectedItem());
            ArrayList<Exam> allResults = examController.getAllResults(paperId);

            DefaultTableModel tableModel = (DefaultTableModel) edittable.getModel();
            tableModel.getDataVector().removeAllElements();
            revalidate();
            for (Exam exam :allResults) {
                tableModel.addRow(new Object[]{exam.getStudent().getName(), exam.getStudent().getStudentId(), exam.getMark()});
            }
      
// TODO add your handling code here:
        } catch (RemoteException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentMarkManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadAddMarkB1ActionPerformed

    private void editBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBActionPerformed
try{
            
            
            String paperId = String.valueOf(paperIdCombo.getSelectedItem());
            Paper paper = paperController.searchPaper(paperId);
            ArrayList<Exam> results = new ArrayList<Exam>();

            DefaultTableModel model = (DefaultTableModel)edittable.getModel();

            
            
            for (int count = 0; count < model.getRowCount(); count++) {

               
                    String studentId = model.getValueAt(count, 1).toString();
                    Student student = studentController.searchStudent(studentId);
                    int mark = Integer.parseInt(model.getValueAt(count, 2).toString());
                    Exam exam = new Exam(student, paper, mark, 0);
                    results.add(exam);
            }

            Collections.sort(results, new Comparator<Exam>() {
                @Override
                public int compare(Exam exam1, Exam exam2) {
                    if (exam1.getMark() > exam2.getMark()) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            });
            ArrayList<Exam> resultfinal = new ArrayList<Exam>();
            int topScore = 0;
            int count = 1;
            double totalmark = 0;
            for (Exam result : results) {
                if (result.getMark() > 0) {
                    resultfinal.add(result);
                    result.setRank(count);
                    if (topScore < result.getMark()) {
                        topScore = result.getMark();
                    }
                    totalmark += result.getMark();
                    count++;
                }
            }
            paper.setNumberOfFacedStudent(count-1);
            paper.setTopScore(topScore);
            paper.setAverage(totalmark/count);
            
            
            boolean editExamResult = examController.editExamResult(paper, results);
            if(editExamResult){
                JOptionPane.showMessageDialog(this,"result is updeted successfully");
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this,"result is not updated successfully");
            }

            } catch (RemoteException ex) {
                    Logger.getLogger(StudentMarkManagement.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentMarkManagement.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(StudentMarkManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
    



        // TODO add your handling code here:
    }//GEN-LAST:event_editBActionPerformed

    private void paperIdComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperIdComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paperIdComboActionPerformed

    private void setPaperID() {
        try {
            int paperCount = paperController.getPaperCount() + 1;
            if (paperCount < 10) {
                paperIdAddMarkT.setText("P000" + String.valueOf(paperCount));
            } else if (paperCount < 100) {
                paperIdAddMarkT.setText("P00" + String.valueOf(paperCount));
            } else if (paperCount < 1000) {
                paperIdAddMarkT.setText("P0" + String.valueOf(paperCount));
            } else {
                paperIdAddMarkT.setText("P" + String.valueOf(paperCount));
            }
        } catch (RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentMarkManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadClassCombo() {
        classIdAddMarkC.removeAllItems();
        try {
            ArrayList<ClassS> allClass = classController.getAllClass();
            for (ClassS cls : allClass) {
                classIdAddMarkC.addItem(cls.getClassId());
            }
        } catch (RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentMarkManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    private void loadPaperIdCombo() {
        paperIdCombo.removeAllItems();
        try {
            ArrayList<Paper> allPaper = paperController.getAllPaper();
            for (Paper paper : allPaper) {
                paperIdCombo.addItem(paper.getPaperId());
            }
        } catch (RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentMarkManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(StudentMarkManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMarkManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMarkManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMarkManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StudentMarkManagement dialog = new StudentMarkManagement(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton addMarkB;
    private javax.swing.JTable addStudentMarkTable;
    private javax.swing.JComboBox<String> classIdAddMarkC;
    private javax.swing.JLabel classIdAddMarkL;
    private javax.swing.JTextField conductedDateT;
    private javax.swing.JButton editB;
    private javax.swing.JTable edittable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loadAddMarkB;
    private javax.swing.JButton loadAddMarkB1;
    private javax.swing.JLabel paperIdAddMarkL;
    private javax.swing.JLabel paperIdAddMarkL1;
    private javax.swing.JTextField paperIdAddMarkT;
    private javax.swing.JComboBox<String> paperIdCombo;
    // End of variables declaration//GEN-END:variables
}

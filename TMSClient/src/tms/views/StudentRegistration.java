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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tms.controllercommon.ClassController;
import tms.controllercommon.RegistrationController;
import tms.controllercommon.StudentController;
import tms.model.ClassS;
import tms.model.Registration;
import tms.model.Student;

/**
 *
 * @author Nuwantha
 */
public class StudentRegistration extends javax.swing.JInternalFrame {

    JFrame frontpage;
    StudentController studentController;
    ClassController classController;
    RegistrationController registrationController;

    /**
     * Creates new form StudentRegistration
     */
    public StudentRegistration() {
        initComponents();
    }

    public StudentRegistration(JFrame frontpage) {
        this();
        this.frontpage = frontpage;

        try {

            studentController = Connector.getSConnector().getStudentController();
            classController = Connector.getSConnector().getClassController();
            registrationController = Connector.getSConnector().getRegistrationController();

        } catch (SQLException | InterruptedException | ClassNotFoundException | NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(StudentDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        loadClassCombo();
        loadClassComboView();
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        classRL = new javax.swing.JLabel();
        classsRCo = new javax.swing.JComboBox<>();
        registerRB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        indexNumberRL = new javax.swing.JLabel();
        nameRL = new javax.swing.JLabel();
        birthdayRL = new javax.swing.JLabel();
        addressRL = new javax.swing.JLabel();
        parentRL = new javax.swing.JLabel();
        contactNumberRL = new javax.swing.JLabel();
        nameRT = new javax.swing.JTextField();
        birthdayRT = new javax.swing.JTextField();
        parentRT = new javax.swing.JTextField();
        contactNumberRT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressRT = new javax.swing.JTextArea();
        indexNumberCombo = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        classsIdComboView = new javax.swing.JComboBox<>();
        classsIdLV = new javax.swing.JLabel();
        searchB = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        classRL.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        classRL.setText("Class");

        classsRCo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classsRCoItemStateChanged(evt);
            }
        });
        classsRCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classsRCoActionPerformed(evt);
            }
        });

        registerRB.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        registerRB.setText("Register");
        registerRB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registerRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerRBActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setText("Add Student");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(classRL, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(classsRCo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(classRL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(classsRCo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162)
                .addComponent(registerRB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        indexNumberRL.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        indexNumberRL.setText("Index Number");

        nameRL.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        nameRL.setText("Name");

        birthdayRL.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        birthdayRL.setText("Birthday");

        addressRL.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        addressRL.setText("Address");

        parentRL.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        parentRL.setText("Parent");

        contactNumberRL.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        contactNumberRL.setText("Contact Number");

        nameRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRTActionPerformed(evt);
            }
        });

        birthdayRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdayRTActionPerformed(evt);
            }
        });

        addressRT.setColumns(20);
        addressRT.setRows(5);
        jScrollPane1.setViewportView(addressRT);

        indexNumberCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                indexNumberComboItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indexNumberRL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameRL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(birthdayRL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressRL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parentRL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contactNumberRL, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nameRT)
                        .addComponent(birthdayRT)
                        .addComponent(parentRT)
                        .addComponent(contactNumberRT)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                    .addComponent(indexNumberCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indexNumberRL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(indexNumberCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameRT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameRL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayRL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdayRT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressRL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parentRT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parentRL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNumberRL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactNumberRT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Student Registration", jPanel1);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        classsIdComboView.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classsIdComboViewItemStateChanged(evt);
            }
        });
        classsIdComboView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classsIdComboViewActionPerformed(evt);
            }
        });

        classsIdLV.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        classsIdLV.setText("Class");

        searchB.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        searchB.setText("Search Registrated Student");
        searchB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(classsIdLV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(classsIdComboView, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(classsIdLV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(classsIdComboView, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(searchB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StudentId", "Name", "Address", "Birthday", "Parent Name", "Contact Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(viewTable);
        if (viewTable.getColumnModel().getColumnCount() > 0) {
            viewTable.getColumnModel().getColumn(0).setResizable(false);
            viewTable.getColumnModel().getColumn(1).setResizable(false);
            viewTable.getColumnModel().getColumn(2).setResizable(false);
            viewTable.getColumnModel().getColumn(3).setResizable(false);
            viewTable.getColumnModel().getColumn(4).setResizable(false);
            viewTable.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("View Registration", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indexNumberComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_indexNumberComboItemStateChanged
        String selectedStudentId = String.valueOf(indexNumberCombo.getSelectedItem());
        try {
            Student searchStudent = studentController.searchStudent(selectedStudentId);
            nameRT.setText(searchStudent.getName());
            birthdayRT.setText(searchStudent.getContactNumber());
            addressRT.setText(searchStudent.getAddress());
            parentRT.setText(searchStudent.getParentName());
            contactNumberRT.setText(searchStudent.getContactNumber());
        } catch (RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_indexNumberComboItemStateChanged

    private void birthdayRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdayRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdayRTActionPerformed

    private void nameRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameRTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StudentDetail studentDetail = new StudentDetail(frontpage, true);
        studentDetail.setLocationRelativeTo(null);
        studentDetail.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registerRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerRBActionPerformed
        try {
            String selectedClassId = (String) classsRCo.getSelectedItem();
            ClassS classSelected = classController.searchClass(selectedClassId);
            int year = classSelected.getYear();
            String selectedStudentId = (String) indexNumberCombo.getSelectedItem();
            Student student = studentController.searchStudent(selectedStudentId);
            Registration registration = new Registration(classSelected, student,year);
            boolean addNewRegistration = registrationController.addNewRegistration(registration);
            if(addNewRegistration){
                JOptionPane.showMessageDialog(this," registration is added successfully");
                nameRT.setText(null);
                birthdayRT.setText(null);
                addressRT.setText(null);
                contactNumberRT.setText(null);
                parentRT.setText(null);
            }
        } catch (RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerRBActionPerformed

    private void classsRCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classsRCoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classsRCoActionPerformed

    private void classsRCoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classsRCoItemStateChanged

        try {
            String classId = String.valueOf(classsRCo.getSelectedItem());
            ClassS searchClass = classController.searchClass(classId);
            loadStudentArrayList(searchClass);
            
        } catch (RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_classsRCoItemStateChanged

    private void classsIdComboViewItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classsIdComboViewItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_classsIdComboViewItemStateChanged

    private void classsIdComboViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classsIdComboViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classsIdComboViewActionPerformed

    private void searchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBActionPerformed
        try {
            String classId = String.valueOf(classsIdComboView.getSelectedItem());
            ArrayList<Student> students = studentController.getStudentOfClass(classId);
            
                DefaultTableModel tableModel = (DefaultTableModel) viewTable.getModel();
            tableModel.getDataVector().removeAllElements();
            revalidate();
            for (Student student : students) {
                tableModel.addRow(new Object[]{student.getStudentId(), student.getName(),student.getAddress(),student.getBirthDay(),student.getParentName(),student.getContactNumber()});
            }
            
        } catch (RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchBActionPerformed

    private void loadStudentArrayList(ClassS studentClass) {
        indexNumberCombo.removeAllItems();
        try {
            ArrayList<Student> allStudent = studentController.getAvailableRegistrationStudentForClass(studentClass);
            for (Student student : allStudent) {
                indexNumberCombo.addItem(student.getStudentId());
            }
        } catch (RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadClassCombo() {
        classsRCo.removeAllItems();
        try {
            ArrayList<ClassS> allClass = classController.getAllClassForNewYear();
            for (ClassS cls : allClass) {
                classsRCo.addItem(cls.getClassId());
            }
        } catch (RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void loadClassComboView() {
        classsIdComboView.removeAllItems();
        try {
            ArrayList<ClassS> allClass = classController.getAllClass();
            for (ClassS cls : allClass) {
                classsIdComboView.addItem(cls.getClassId());
            }
        } catch (RemoteException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressRL;
    private javax.swing.JTextArea addressRT;
    private javax.swing.JLabel birthdayRL;
    private javax.swing.JTextField birthdayRT;
    private javax.swing.JLabel classRL;
    private javax.swing.JComboBox<String> classsIdComboView;
    private javax.swing.JLabel classsIdLV;
    private javax.swing.JComboBox<String> classsRCo;
    private javax.swing.JLabel contactNumberRL;
    private javax.swing.JTextField contactNumberRT;
    private javax.swing.JComboBox<String> indexNumberCombo;
    private javax.swing.JLabel indexNumberRL;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel nameRL;
    private javax.swing.JTextField nameRT;
    private javax.swing.JLabel parentRL;
    private javax.swing.JTextField parentRT;
    private javax.swing.JButton registerRB;
    private javax.swing.JButton searchB;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables
}

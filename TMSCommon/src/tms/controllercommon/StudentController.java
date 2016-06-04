/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllercommon;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import tms.model.Student;

/**
 *
 * @author Nuwantha
 */
public interface StudentController extends Remote{
        public int getStudentCount() throws RemoteException, SQLException,ClassNotFoundException; 
        public boolean addNewStudent(Student student) throws RemoteException, SQLException,ClassNotFoundException;
        public Student searchStudent(String studentId) throws RemoteException, SQLException,ClassNotFoundException;
        public ArrayList<Student> getAllStudent() throws RemoteException, SQLException,ClassNotFoundException;
        public ArrayList<Student> getAllStudentRegisterForNewYear() throws RemoteException, SQLException,ClassNotFoundException;
        public ArrayList<Student> getStudentOfClass(String classId) throws RemoteException, SQLException,ClassNotFoundException;
        public boolean editStudentDetail(Student student) throws RemoteException,ClassNotFoundException, SQLException;

        
}

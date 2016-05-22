/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllerimple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import tms.controller.StudentControllerD;
import tms.controllercommon.StudentController;
import tms.model.Student;

/**
 *
 * @author Nuwantha
 */
public class StudentControllerImple extends UnicastRemoteObject implements StudentController {

    private final StudentControllerD studentControllerD;

    public StudentControllerImple() throws RemoteException {
        this.studentControllerD = new StudentControllerD();
    }

    @Override
    public int getStudentCount() throws RemoteException, SQLException, ClassNotFoundException {
      return  studentControllerD.getStudentCount();
    }

    @Override
    public boolean addNewStudent(Student student) throws RemoteException, SQLException, ClassNotFoundException {
        return studentControllerD.addNewStudent(student);
    }

    @Override
    public Student searchStudent(String studentId) throws RemoteException, SQLException, ClassNotFoundException {
        return studentControllerD.searchStudent(studentId);
    }

    @Override
    public ArrayList<Student> getAllStudent() throws RemoteException, SQLException, ClassNotFoundException {
        return studentControllerD.getAllStudent(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> getAllStudentRegisterForNewYear() throws RemoteException, SQLException, ClassNotFoundException {
        return studentControllerD.getAllStudentRegisterForNewYear();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> getStudentOfClass(String classId) throws RemoteException, SQLException, ClassNotFoundException {
        return  studentControllerD.getStudentOfClass(classId); //To change body of generated methods, choose Tools | Templates.
    }

}

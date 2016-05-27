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
import tms.controller.ClassFeesControllerD;
import tms.controllercommon.ClassFeesController;
import tms.model.ClassFees;
import tms.model.Student;

/**
 *
 * @author Nuwantha
 */
public class ClassFeesControllerImple extends UnicastRemoteObject implements ClassFeesController{

    private ClassFeesControllerD classFeesControllerD;
    public ClassFeesControllerImple() throws RemoteException{
        this.classFeesControllerD=new ClassFeesControllerD();
    }

    @Override
    public boolean addNewClassFees(ClassFees classFees) throws RemoteException, ClassNotFoundException, SQLException {
        return classFeesControllerD.addNewClassFees(classFees); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> getClassFeesPaidStudents(String classId, int month) throws RemoteException, ClassNotFoundException, SQLException {
        return classFeesControllerD.getClassFeesPaidStudents(classId, month);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> getClassFeesNotPaidStudents(String classId, int month) throws RemoteException, ClassNotFoundException, SQLException {
        return classFeesControllerD.getClassFeesNotPaidStudents(classId, month);//To change body of generated methods, choose Tools | Templates.
    }
    
    
}

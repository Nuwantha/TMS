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
import tms.controller.ClassControllerD;
import tms.controllercommon.ClassController;
import tms.model.ClassS;

/**
 *
 * @author Nuwantha
 */
public class ClassControllerImpe extends UnicastRemoteObject implements ClassController {

    private final ClassControllerD classControllerD;

    public ClassControllerImpe() throws RemoteException {
        this.classControllerD = new ClassControllerD();
    }

    @Override
    public ArrayList<ClassS> getAllClass() throws RemoteException, SQLException, ClassNotFoundException {
       return classControllerD.getAllClass();
    }

    @Override
    public ClassS searchClass(String classId) throws RemoteException, SQLException, ClassNotFoundException {
        return classControllerD.searchClass(classId);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ClassS> getAllClassForNewYear() throws RemoteException, SQLException, ClassNotFoundException {
        return  classControllerD.getAllClassForNewYear();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addNewClass(ClassS classDetail) throws RemoteException, ClassNotFoundException, SQLException {
        return classControllerD.addNewClass(classDetail);
    }

    @Override
    public boolean editClassDetail(ClassS classDetail) throws RemoteException, ClassNotFoundException, SQLException {
        return classControllerD.editClassDetail(classDetail);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getClassCount() throws RemoteException, ClassNotFoundException, SQLException {
        return classControllerD.getClassCount();//To change body of generated methods, choose Tools | Templates.
    }

}

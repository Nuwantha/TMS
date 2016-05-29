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
import tms.controller.SchoolarshipResultControllerD;
import tms.controllercommon.SchoolarshipResultController;
import tms.model.SchoolarshipResult;

/**
 *
 * @author Nuwantha
 */
public class SchoolarshipResultControllerImple extends UnicastRemoteObject implements SchoolarshipResultController {

    private final SchoolarshipResultControllerD schoolarshipResultControllerD;

    public SchoolarshipResultControllerImple() throws RemoteException {
        this.schoolarshipResultControllerD = new SchoolarshipResultControllerD();
    }

    @Override
    public boolean addSchoolarshipResult(SchoolarshipResult schoolarshipResult) throws RemoteException, ClassNotFoundException, SQLException {
        return schoolarshipResultControllerD.addSchoolarshipResult(schoolarshipResult);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editSchoolarshipResult(SchoolarshipResult schoolarshipResult) throws RemoteException, ClassNotFoundException, SQLException {
        return schoolarshipResultControllerD.editSchoolarshipResult(schoolarshipResult);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SchoolarshipResult searchSchoolarshipResult(String indexNumber) throws RemoteException, ClassNotFoundException, SQLException {
        return schoolarshipResultControllerD.searchSchoolarshipResult(indexNumber);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SchoolarshipResult> getAllSchoolarshipResult() throws RemoteException, ClassNotFoundException, SQLException {
            return schoolarshipResultControllerD.getAllSchoolarshipResult();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SchoolarshipResult> getSchoolarshipResultOfYear(int year) throws RemoteException, ClassNotFoundException, SQLException {
        return schoolarshipResultControllerD.getSchoolarshipResultOfYear(year);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Integer> getYears() throws RemoteException, ClassNotFoundException, SQLException {
        return schoolarshipResultControllerD.getYears();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int particateStudentCountOfYear(int year) throws RemoteException, ClassNotFoundException, SQLException {
        return schoolarshipResultControllerD.particateStudentCountOfYear(year);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int passStudentCountOfYear(int year) throws RemoteException, ClassNotFoundException, SQLException {
        return schoolarshipResultControllerD.passStudentCountOfYear(year);//To change body of generated methods, choose Tools | Templates.
    }
}

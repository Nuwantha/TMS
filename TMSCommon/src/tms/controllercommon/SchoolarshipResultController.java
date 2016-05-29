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
import tms.model.SchoolarshipResult;

/**
 *
 * @author Nuwantha
 */
public interface SchoolarshipResultController extends Remote{
   
    public boolean addSchoolarshipResult(SchoolarshipResult schoolarshipResult) throws RemoteException,ClassNotFoundException, SQLException;
    public boolean editSchoolarshipResult(SchoolarshipResult schoolarshipResult) throws RemoteException, ClassNotFoundException, SQLException;
    public  SchoolarshipResult searchSchoolarshipResult(String indexNumber) throws RemoteException,ClassNotFoundException, SQLException;
    public  ArrayList<SchoolarshipResult> getAllSchoolarshipResult() throws RemoteException, ClassNotFoundException, SQLException;
    public  ArrayList<SchoolarshipResult> getSchoolarshipResultOfYear(int year) throws RemoteException,ClassNotFoundException, SQLException ;
    public  ArrayList<Integer> getYears() throws RemoteException,ClassNotFoundException, SQLException;
    public int particateStudentCountOfYear(int year) throws RemoteException,ClassNotFoundException, SQLException ;
    public int passStudentCountOfYear(int year) throws RemoteException,ClassNotFoundException, SQLException ;
 
}

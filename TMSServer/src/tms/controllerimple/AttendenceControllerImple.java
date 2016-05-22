/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllerimple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import tms.controller.AttendenceControllerD;
import tms.controllercommon.AttendenceController;
/**
 *
 * @author Nuwantha
 */
public class AttendenceControllerImple extends UnicastRemoteObject implements AttendenceController{
    
    private final AttendenceControllerD attendenceControllerD;
    
    public AttendenceControllerImple() throws RemoteException{
        this.attendenceControllerD=new AttendenceControllerD();
    
    }
    
}

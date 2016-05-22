/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllerimple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import tms.controller.ExamControllerD;
import tms.controllercommon.ExamController;

/**
 *
 * @author Nuwantha
 */
public class ExamControllerImple extends UnicastRemoteObject implements ExamController{
    
    
   private final ExamControllerD examControllerD; 
   public ExamControllerImple() throws RemoteException{
        this.examControllerD=new ExamControllerD();
   }
    
}

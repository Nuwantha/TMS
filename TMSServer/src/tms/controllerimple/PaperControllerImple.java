/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllerimple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import tms.controller.PaperControllerD;
import tms.controllercommon.PaperController;

/**
 *
 * @author Nuwantha
 */
public class PaperControllerImple extends UnicastRemoteObject implements PaperController {

    private final PaperControllerD paperControllerD;

    public PaperControllerImple() throws RemoteException {
        this.paperControllerD = new PaperControllerD();
    }

    @Override
    public int getPaperCount() throws RemoteException, SQLException, ClassNotFoundException {
       return paperControllerD.getPaperCount();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controllerimple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import tms.controller.SchoolarshipResultControllerD;
import tms.controllercommon.SchoolarshipResultController;

/**
 *
 * @author Nuwantha
 */
public class SchoolarshipResultControllerImple extends UnicastRemoteObject implements SchoolarshipResultController {

    private final SchoolarshipResultControllerD schoolarshipResultControllerD;

    public SchoolarshipResultControllerImple() throws RemoteException {
        this.schoolarshipResultControllerD = new SchoolarshipResultControllerD();
    }
}

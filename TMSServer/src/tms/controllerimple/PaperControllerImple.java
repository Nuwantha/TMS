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
import tms.controller.PaperControllerD;
import tms.controllercommon.PaperController;
import tms.model.Paper;

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

    @Override
    public boolean addNewPaper(Paper paper) throws RemoteException, ClassNotFoundException, SQLException {
        return  paperControllerD.addNewPaper(paper);
    }

    @Override
    public ArrayList<Paper> getAllPaper() throws RemoteException, ClassNotFoundException, SQLException {
        return paperControllerD.getAllPaper();
    }

    @Override
    public Paper searchPaper(String paperId) throws RemoteException, ClassNotFoundException, SQLException {
        return paperControllerD.searchPaper(paperId);
    }
}

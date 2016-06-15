/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmsclient;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import tms.views.Login;

/**
 *
 * @author Nuwantha
 */
public class TMSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new AcrylLookAndFeel());
            Login login = new Login();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TMSClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

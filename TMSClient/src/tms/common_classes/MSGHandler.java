package tms.common_classes;

import java.net.*;
import java.util.ArrayList;
import tms.model.Student;

public class MSGHandler {

    public void sendNotification(ArrayList<Student> students,String msg) {

        for (Student student : students) {
            try {
                String recipient = student.getContactNumber();
                String message = msg;
                String username = "admin";
                String password = "Gimhani@1120";
                String originator = "+94710742361";

                String requestUrl = "http://127.0.0.1:9501/api?action=sendmessage&"
                        + "username=" + URLEncoder.encode(username, "UTF-8")
                        + "&password=" + URLEncoder.encode(password, "UTF-8")
                        + "&recipient=" + URLEncoder.encode(recipient, "UTF-8")
                        + "&messagetype=SMS:TEXT"
                        + "&messagedata=" + URLEncoder.encode(message, "UTF-8")
                        + "&originator=" + URLEncoder.encode(originator, "UTF-8")
                        + "&serviceprovider=GSMModem2"
                        + "&responseformat=html";

                URL url = new URL(requestUrl);
                HttpURLConnection uc = (HttpURLConnection) url.openConnection();

                System.out.println(uc.getResponseMessage());

                uc.disconnect();

            } catch (Exception ex) {
                System.out.println(ex.getMessage());

            }

        }

    }

}

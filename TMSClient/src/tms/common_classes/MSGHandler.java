package tms.common_classes;

import java.net.*;
import java.util.ArrayList;
import tms.model.Student;

public class MSGHandler {

    public static void sendNotification(ArrayList<Student> students,String msg) {

        for (Student student : students) {
            try {
                String recipient = "0"+student.getContactNumber();
                String message = student.getName()+" "+msg;
                String username = "admin";
                String password = "sanga@1234";
                String originator = "+94750344152";

                String requestUrl = "http://127.0.0.1:9501/api?action=sendmessage&"
                        + "username=" + URLEncoder.encode(username, "UTF-8")
                        + "&password=" + URLEncoder.encode(password, "UTF-8")
                        + "&recipient=" + URLEncoder.encode(recipient, "UTF-8")
                        + "&messagetype=SMS:TEXT"
                        + "&messagedata=" + URLEncoder.encode(message, "UTF-8")
                        + "&originator=" + URLEncoder.encode(originator, "UTF-8")
                        + "&serviceprovider=GSMModem0"
                        + "&responseformat=html";

                URL url = new URL(requestUrl);
                HttpURLConnection uc = (HttpURLConnection) url.openConnection();
                System.out.println("msg handler");
                System.out.println(uc.getResponseMessage());
                
                uc.disconnect();

            } catch (Exception ex) {
                System.out.println(ex.getMessage());

            }

        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controller;

import java.io.IOException;

/**
 *
 * @author Nuwantha
 */
public class BackUpControllerD {
   
    public static int  writeBackup() throws IOException,InterruptedException {
        Runtime runTime = Runtime.getRuntime();
        String password="";
        Process exec = runTime.exec("C:\\wamp\\bin\\mysql\\mysql5.6.17\\bin\\mysqldump TMS -h localhost -u root -p -r  E:\\Project\\TMS\\back.sql");
        return exec.waitFor();
    }

    public static int restoreBackup() throws IOException, InterruptedException {
        String[] executeCmd = new String[]{"mysql", "--user=root", "--password=","TMS", "-e", " source  E:\\Project\\TMS\\back.sql"};
        Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
        int waitFor = runtimeProcess.waitFor();
        return  waitFor;
    }

   /*
    public static int writeBackup(String path) throws IOException, InterruptedException {
        Runtime runTime = Runtime.getRuntime();
        Process runtimeProcess = runTime.exec("mysqldump DrivingSchool -h localhost -u root -p0213 -r " + path + ".txt");
        int res = runtimeProcess.waitFor();
        return res;
        
        
    }

    public static int restoreBackup(String path) throws IOException, InterruptedException {
        String[] executeCmd = new String[]{"mysql", "DrivingSchool", "--user=root", "--password=0213", "-e", " source " + path};
        Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
        int res = runtimeProcess.waitFor();
        return res;
    }

    */
}

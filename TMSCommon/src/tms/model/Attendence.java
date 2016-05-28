/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.model;

import java.io.Serializable;

/**
 *
 * @author Nuwantha
 */
public class Attendence implements Serializable{

    private String classId;
    private String studentId;
    private String date;
    private int status;

    public Attendence(String classId, String studentId, String date, int status) {
        this.classId = classId;
        this.studentId = studentId;
        this.date = date;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    
}

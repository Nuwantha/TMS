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
public class ClassFeesPavement implements Serializable{
    private ClassS studentClass;
    private Student student;
    private String date;

    public ClassFeesPavement(ClassS studentClass, Student student, String date) {
        this.studentClass = studentClass;
        this.student = student;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ClassS getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(ClassS studentClass) {
        this.studentClass = studentClass;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    
}

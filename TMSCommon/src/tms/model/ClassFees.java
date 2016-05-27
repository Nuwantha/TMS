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
public class ClassFees implements Serializable{
    private Student student;
    private ClassS classStudent;	
    private String payDate;
    private int	month;

    public ClassFees(Student student, ClassS classStudent, String payDate, int month) {
        this.student = student;
        this.classStudent = classStudent;
        this.payDate = payDate;
        this.month = month;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ClassS getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(ClassS classStudent) {
        this.classStudent = classStudent;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    
}

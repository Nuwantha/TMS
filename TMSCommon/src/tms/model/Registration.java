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
public class Registration implements Serializable{

    private ClassS studentClass;
    private Student student;
    private int year;

    public Registration(ClassS studentClass, Student student, int year) {
        this.studentClass = studentClass;
        this.student = student;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

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
public class ClassS implements Serializable {
    private String classId;
    private int grade;
    private String conductedDate;  
    private int classFeesAmount;
    private int year;

    public ClassS(String classId, int grade, String conductedDate, int classFeesAmount, int year) {
        this.classId = classId;
        this.grade = grade;
        this.conductedDate = conductedDate;
        this.classFeesAmount = classFeesAmount;
        this.year = year;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getConductedDate() {
        return conductedDate;
    }

    public void setConductedDate(String conductedDate) {
        this.conductedDate = conductedDate;
    }

    public int getClassFeesAmount() {
        return classFeesAmount;
    }

    public void setClassFeesAmount(int classFeesAmount) {
        this.classFeesAmount = classFeesAmount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

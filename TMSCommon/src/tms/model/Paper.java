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
public class Paper implements Serializable{
    private String paperId;
    private String dateOfConduct;
    private int numberOfFacedStudent;
    private int grade;
    private int topScore;
    private double average;

    public Paper(String paperId, String dateOfConduct, int numberOfFacedStudent, int grade, int topScore, double average) {
        this.paperId = paperId;
        this.dateOfConduct = dateOfConduct;
        this.numberOfFacedStudent = numberOfFacedStudent;
        this.grade = grade;
        this.topScore = topScore;
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public String getDateOfConduct() {
        return dateOfConduct;
    }

    public void setDateOfConduct(String dateOfConduct) {
        this.dateOfConduct = dateOfConduct;
    }

    public int getNumberOfFacedStudent() {
        return numberOfFacedStudent;
    }

    public void setNumberOfFacedStudent(int numberOfFacedStudent) {
        this.numberOfFacedStudent = numberOfFacedStudent;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getTopScore() {
        return topScore;
    }

    public void setTopScore(int topScore) {
        this.topScore = topScore;
    }

    
}

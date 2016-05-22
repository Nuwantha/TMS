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
    private String classFeesId;
    private ClassS classStudent;	
    private int year;
    private int	month;

    public ClassFees(String classFeesId, ClassS classStudent, int year, int month) {
        this.classFeesId = classFeesId;
        this.classStudent = classStudent;
        this.year = year;
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getClassFeesId() {
        return classFeesId;
    }

    public void setClassFeesId(String classFeesId) {
        this.classFeesId = classFeesId;
    }

    public ClassS getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(ClassS classStudent) {
        this.classStudent = classStudent;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
	 
}

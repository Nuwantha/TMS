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
public class Student implements Serializable {
    
    private String studentId;
    private String birthDay;
    private String name;
    private String address;
    private String parentName;
    private String contactNumber;

    public Student(String studentId, String birthDay, String name, String address, String parentName, String contactNumber) {
        this.studentId = studentId;
        this.birthDay = birthDay;
        this.name = name;
        this.address = address;
        this.parentName = parentName;
        this.contactNumber = contactNumber;
    }

    

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

     
	
}

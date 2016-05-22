/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controller;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tms.model.Student;

/**
 *
 * @author Nuwantha
 */
public class StudentControllerDTest {
    
    public StudentControllerDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStudentCount method, of class StudentControllerD.
     */
    @Test
    public void testGetStudentCount() throws Exception {
        System.out.println("getStudentCount");
        int expResult = 0;
        int result = StudentControllerD.getStudentCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of addNewStudent method, of class StudentControllerD.
     */
    @Test
    public void testAddNewClient() throws Exception {
        System.out.println("addNewClient");
        Student student = new Student("st0001","2008-12-04", "Nimal","No34 Weligama", "asoka","0710793481");
        boolean expResult = true;
        boolean result = StudentControllerD.addNewStudent(student);
        assertEquals(expResult, result);
    }

    /**
     * Test of addNewStudent method, of class StudentControllerD.
     */
    @Test
    public void testAddNewStudent() throws Exception {
        System.out.println("addNewStudent");
        Student student = null;
        boolean expResult = false;
        boolean result = StudentControllerD.addNewStudent(student);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchStudent method, of class StudentControllerD.
     */
    @Test
    public void testSearchStudent() throws Exception {
        System.out.println("searchStudent");
        String studentId = "";
        Student expResult = null;
        Student result = StudentControllerD.searchStudent(studentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllStudent method, of class StudentControllerD.
     */
    @Test
    public void testGetAllStudent() throws Exception {
        System.out.println("getAllStudent");
        ArrayList<Student> expResult = null;
        ArrayList<Student> result = StudentControllerD.getAllStudent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

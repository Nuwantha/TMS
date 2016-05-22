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
import tms.model.ClassS;

/**
 *
 * @author Nuwantha
 */
public class ClassControllerDTest {
    
    public ClassControllerDTest() {
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
     * Test of getAllClass method, of class ClassControllerD.
     */
    @Test
    public void testGetAllClass() throws Exception {
        System.out.println("getAllClass");
        ArrayList<ClassS> expResult = null;
        ArrayList<ClassS> result = ClassControllerD.getAllClass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchClass method, of class ClassControllerD.
     */
    @Test
    public void testSearchClass() throws Exception {
        System.out.println("searchClass");
        String classId = "";
        ClassS expResult = null;
        ClassS result = ClassControllerD.searchClass(classId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

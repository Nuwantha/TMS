/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.common_classes;

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
public class MSGHandlerTest {
    
    public MSGHandlerTest() {
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
     * Test of sendNotification method, of class MSGHandler.
     */
    @Test
    public void testSendNotification() {
        System.out.println("sendNotification");
        Student student = new Student("", "", "nimal", "", "", "0750344156");
        ArrayList<Student> students =new ArrayList<>();
        students.add(student);
        String msg = "hi ozeki";
        MSGHandler.sendNotification(students, msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

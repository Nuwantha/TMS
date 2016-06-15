/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.common_classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nuwantha
 */
public class PatternCheckerTest {

    public PatternCheckerTest() {
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

    @Test
    public void testCheckNIC() {
        System.out.println("checkNIC");
        String nicText = "93023r";
        String expResult = "93023";
        String result = PatternChecker.checkNIC(nicText);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckNICdirect() {
        System.out.println("checkNICdirect");
        String nicText = "930few";
        boolean expResult = false;
        boolean result = PatternChecker.checkNICdirect(nicText);
        assertEquals(expResult, result);

    }

    @Test
    public void testCheckIndexNumdirect() {
        System.out.println("checkIndexNumdirect");
        String indexText = "123456";
        boolean expResult = true;
        boolean result = PatternChecker.checkIndexNumdirect(indexText);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIndex() {
        System.out.println("checkIndex");
        String indexText = "345r";
        String expResult = "345";
        String result = PatternChecker.checkIndex(indexText);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckResultdirect() {
        System.out.println("checkResultdirect");
        String resultText = "190";
        boolean expResult = true;
        boolean result = PatternChecker.checkResultdirect(resultText);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testCheckResult() {
        System.out.println("checkResult");
        String resultText = "34";
        String expResult = "34";
        String result = PatternChecker.checkResult(resultText);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckTelNum() {
        System.out.println("checkTelNum");
        String telText = "07856e";
        String expResult = "07856";
        String result = PatternChecker.checkTelNum(telText);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckTelNumdirect() {
        System.out.println("checkTelNumdirect");
        String telText = "0710756423";
        boolean expResult = true;
        boolean result = PatternChecker.checkTelNumdirect(telText);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIntegerdirect() {
        System.out.println("checkIntegerdirect");
        String text = "34";
        boolean expResult = true;
        boolean result = PatternChecker.checkIntegerdirect(text);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckStringdirect() {
        System.out.println("checkStringdirect");
        String text = "78";
        boolean expResult = false;
        boolean result = PatternChecker.checkStringdirect(text);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckstring() {
        System.out.println("checkstring");
        String text = "fggr6";
        String expResult = "fggr";
        String result = PatternChecker.checkstring(text);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckInteger() {
        System.out.println("checkInteger");
        String text = "34e";
        String expResult = "34";
        String result = PatternChecker.checkInteger(text);
        assertEquals(expResult, result);
    }


}

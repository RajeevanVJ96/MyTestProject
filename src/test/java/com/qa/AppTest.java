package com.qa;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private com.qa.App app;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMethodTest()
    {
        app = new App();
        assertEquals(2,app.testMethod(2,1));
    }

    @Test
    public void testFalseMethod(){
        app = new App();
        assertFalse("FUckface", app.testFalse(4,2));
    }

    @Test
    public void testNotNull(){
        app = new App();
        assertNotNull("Should return 4", app.testNotNull(2,2));
    }

    @Test
    public void testNotSame(){
        app = new App();
        assertNotSame("Should be different", app.testNotNull(2,3),app.testNotNull(2,3));
    }

    @Test
    public void testBlackJack(){
        app = new App();
        assertEquals(0, app.blackJack(23,23));
        assertEquals(18, app.blackJack(23,18));
        assertEquals(18, app.blackJack(18,23));
        assertEquals(18, app.blackJack(18,23));
        assertEquals(18, app.blackJack(18,23));


    }




}

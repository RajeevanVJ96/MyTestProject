package com.qa;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    
}

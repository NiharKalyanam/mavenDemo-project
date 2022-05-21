package com.learnmaven.mavendemo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.learnmaven.mavendemo.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAdd()
    {
        assertEquals(10, new Calculator().add(5, 5));
    }
    public void testSub()
    {
    	assertEquals(0, new Calculator().sub(5, 5));
    }
    public void testMultiple()
    {
    	assertEquals(2, new Calculator().multiple(5, 5));
    }
    public void testDivision()
    {
    	assertEquals(1, new Calculator().divison(5, 5));
    }
}

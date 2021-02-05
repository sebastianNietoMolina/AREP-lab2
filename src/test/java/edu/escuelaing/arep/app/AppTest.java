package edu.escuelaing.arep.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.List;

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
     * Test the mean of a set od data.
     */
    public void testMean1(){
        List lis = new LinkedList();

        lis.add(160.0);
        lis.add(591.0);
        lis.add(114.0);
        lis.add(229.0);
        lis.add(230.0);
        lis.add(270.0);
        lis.add(128.0);
        lis.add(1657.0);
        lis.add(624.0);
        lis.add(1503.0);

        Double res = MeanAndStandardDeviation.mean(lis);
        assertEquals(550.6,res);
    }

    /**
     * Test the standard deviation of a set of data.
     */
    public void testStdeviation1(){
        List lis = new LinkedList();

        lis.add(160.0);
        lis.add(591.0);
        lis.add(114.0);
        lis.add(229.0);
        lis.add(230.0);
        lis.add(270.0);
        lis.add(128.0);
        lis.add(1657.0);
        lis.add(624.0);
        lis.add(1503.0);

        Double res = MeanAndStandardDeviation.stDeviation(lis);
        assertEquals(572.026844746915, res);
    }

}

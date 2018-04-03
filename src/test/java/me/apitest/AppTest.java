package me.apitest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    public void testApp()
    {
//    	APIConnection apiConnection = new APIConnection("http://localhost:8888/football/live");
//        apiConnection.validateResponseStatusCode(apiConnection.get());
    	
//    	JSONObjectHandler jsonObjectConverter = new JSONObjectHandler();
    	
//    	jsonObjectConverter.getJSONObjectArray("http://localhost:8888/football/live");
    }
}

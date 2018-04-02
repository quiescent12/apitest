package me.apitest;


/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	APIConnection apiConnection = new APIConnection("http://localhost:8888/");
        apiConnection.get();
    }
}

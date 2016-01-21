package Search;

import java.util.Arrays;

import ArrayGenerator.SimpleRandomCount;

/**
 * An extension of RandomCount
 * 
 * @author David Thaxter
 * @version October 2015
 * @description:- A simple function to test the time function of the implementations of simple search timer and random search timer
 * using 3 different instances for each timer to get 3 comparative results. 
 **/

public class TimedComparisonQ2C {
	

	
	//use main to test functionality
    public static void main(String[] args) throws IndexingError {
    	SimpleRandomCount testArray1  = new SimpleRandomCount(600000);
    	SimpleRandomCount testArray2  = new SimpleRandomCount(984576);
    	SimpleRandomCount testArray3  = new SimpleRandomCount(154367);
    	SimpleSearchTimer simpleTimer = new SimpleSearchTimer();
		CleverSearchTimer cleverTimer = new CleverSearchTimer();
    	
		//test one 
    	System.out.println("time Taken for testArray1 in simpleTimer = " + simpleTimer.time(testArray1.array(),465798));
    	System.out.println("time Taken for testArray1 in cleverTimer = " + cleverTimer.time(testArray1.array(),465798));
    	//test two
    	System.out.println("time Taken for testArray2 in simpleTimer = " + simpleTimer.time(testArray2.array(),800648));
    	System.out.println("time Taken for testArray2 in cleverTimer = " + cleverTimer.time(testArray2.array(),800648));
    	//test three
    	System.out.println("time Taken for testArray3 in simpleTimer = " + simpleTimer.time(testArray2.array(),120142));
    	System.out.println("time Taken for testArray3 in cleverTimer = " + cleverTimer.time(testArray2.array(),120142));
    	
    	
    }
	
	
	
	

}

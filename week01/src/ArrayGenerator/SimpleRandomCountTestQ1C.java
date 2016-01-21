package ArrayGenerator;

/**
 * An extension of RandomCount
 * 
 * @author David Thaxter
 * @version October 2015
 * @description:- Junit test file to test the functionality of  the simple random count method and its ability to generate a random array
 * it then executes the findKthelment function of the simple search timer to return the 4th largest element of the array that should be 21
 **/


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Search.IndexingError;
import Search.SearchTimer;
import Search.SimpleSearchTimer;

public class SimpleRandomCountTestQ1C {
	
	//declare global test objects.
	public SimpleRandomCount test1;
	public SimpleRandomCount test2;
	public SimpleRandomCount test3;
	public SearchTimer timer;
	
	
	
	//before tests run create  objects.
	@Before 
	public void initialize() {
		test1  = new SimpleRandomCount(25);
		test2  = new SimpleRandomCount(6);
		test3  = new SimpleRandomCount(8);
		timer = new SimpleSearchTimer();
	}

	//test to find the kth element of object
	@Test
	public void testSimpleRandomCount25() throws IndexingError {
    	int[] array = test1.array();
    	assertEquals("4th largest element of the array must equal 21" , 21 , timer.findKthElement(array,4));
	}
	
	//test to find the kth element of object
	@Test
	public void testSimpleRandomCount6() throws IndexingError {
	    int[] array = test2.array();
	    assertEquals("4th largest element of array must equal 2" , 2 , timer.findKthElement(array,4));
	}
	
	//test to find the kth element of object
	@Test
	public void testSimpleRandomCount8() throws IndexingError {
	   	int[] array = test3.array();
	   	assertEquals("4th largest element of array must equal 4" , 4 , timer.findKthElement(array,4));
	}
	
}

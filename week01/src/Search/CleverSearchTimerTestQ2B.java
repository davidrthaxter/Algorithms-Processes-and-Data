package Search;

/**
 * An extension of RandomCount
 * 
 * @author David Thaxter
 * @version October 2015
 * @description:- A test class to test the functionality of the clever search timer, these tests use a Simple Random Count to set up the array 
 * and a clever Search timer to Find the k'th largest element 
 **/


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ArrayGenerator.SimpleRandomCount;
import Search.IndexingError;
import Search.SearchTimer;
import Search.SimpleSearchTimer;

public class CleverSearchTimerTestQ2B {
	
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

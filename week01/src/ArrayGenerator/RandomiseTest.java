package ArrayGenerator;

/**
 * An extension of RandomCount
 * 
 * @author David Thaxter
 * @version October 2015
 * @description:- A simple test file that runs tests the functionality of the
 * time function of 3 instatnces of Both Simple Random Count and clever random count  **/


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Search.IndexingError;
import Search.SearchTimer;
import Search.SimpleSearchTimer;

public class RandomiseTest {
	
	//declare global test objects.
	public SimpleRandomCount test1;
	public SimpleRandomCount test2;
	public SimpleRandomCount test3;
	public CleverRandomCount test4;
	public CleverRandomCount test5;
	public CleverRandomCount test6;
	
	
	
	//before tests run create  objects.
	@Before 
	public void initialize() {
		test1  = new SimpleRandomCount(20000000);
		test2  = new SimpleRandomCount(10000000);
		test3  = new SimpleRandomCount(5000000);
		test4  = new CleverRandomCount(20000000);
		test5  = new CleverRandomCount(10000000);
		test6  = new CleverRandomCount(5000000);
	}

	//test to find the time the randomisation of 300 length arary using simple random count
	@Test
	public void test1() throws IndexingError {
    	System.out.println("ms time taken to randomise an array of length 20000000 + simple random count " + test1.time());
	}
	
	//test to find the kth element of object
	@Test
	public void test2() throws IndexingError {
    	System.out.println("ms taken to randomise an array of length 10000000 + simple random count " + test2.time());
	}
	@Test
	public void test3() throws IndexingError {
    	System.out.println("ms taken to randomise an array of length 5000000 + simple random count " + test3.time());
	}
	@Test
	public void test4() throws IndexingError {
    	System.out.println("ms taken to randomise an array of length 20000000 + Clever random count " + test4.time());
	}
	@Test
	public void test5() throws IndexingError {
    	System.out.println("ms taken to randomise an array of length 10000000 + Clever random count " + test5.time());
	}
	@Test
	public void test6() throws IndexingError {
    	System.out.println("ms taken to randomise an array of length 5000000 + Clever random count " + test6.time());
	}
	
}

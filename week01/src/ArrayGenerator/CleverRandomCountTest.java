package ArrayGenerator;

/**
 * An extension of RandomCount
 * 
 * @author David Thaxter
 * @version October 2015
 * @description:- Junit test file to test the functionality of  the Clever random count method
 *  and its ability to generate a random array
 **/


import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class CleverRandomCountTest {
	//declare global test objects.
	public CleverRandomCount test1;
	public CleverRandomCount test2;
	public CleverRandomCount test3;
	
	//before tests run create  objects.
	@Before 
	public void initialize() {
		test1  = new CleverRandomCount(25);
		test2  = new CleverRandomCount(20);
		test3  = new CleverRandomCount(15);
	}
	//test to find the kth element of object
	@Test
	public void testSimpleRandomCount25(){
		System.out.println("All elements of test1" + Arrays.toString(test1.array()));
		System.out.println("All elements of test2" + Arrays.toString(test2.array()));
		System.out.println("All elements of test3" + Arrays.toString(test3.array()));
	}	
}

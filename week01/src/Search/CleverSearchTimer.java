package Search;

import java.util.Arrays;

import ArrayGenerator.CleverRandomCount;
import ArrayGenerator.SimpleRandomCount;

/**
 * An Implementation of timed Search that implements a clever solution.
 * 
 * @author David Thaxter
 * @version October 2015
 * @description:- This code uses predefined methods to implement timed search in a clever method the steps of this are as follows
 * @inputs : 2 inputs Received An array of integers and an array index (K)
 * @output : The k'th largest element in the array 
 * 1. Read the first k elements into an auxiliary array (these will be “the k largest found so far”) 
 * 2. sort the k-element array into descending order (in some way!)
 * 3. Loop through Each Remaining Element 
 * 4. If is smaller than smallest Throw it away
 * 5. if larger the remove the smallest element of aux array
 * 6. put the element in the correct location in aux array
 * 7. return the smallest element in k length array
 **/





public class CleverSearchTimer implements TimedSearch {

	// take an array input and the an integer k
	public int findKthElement(int[] array, int k) throws IndexingError {
		
		
		// read the first k numbers of array into a temporary array array (• read the first k elements into an 
		// auxiliary array (these will be “the largest found so far”)
		int[] largestSoFar =  new int[k];
		
		for(int index = 0; index < k;index++)
		{
			largestSoFar[index] = array[index];
		}
		
		//sort array into descending order
		
		
		//for each index in the array compare to every other index
		
		//sort the k-element array into descending order (in some way!)
		for(int index =0; index < k; index++)
		{
			for(int index2 = index+1; index2 < k; index2++)
			{
				if(largestSoFar[index] < largestSoFar[index2]) // if the value is greater than the original
				{
					int temp;
					temp = largestSoFar[index];
					largestSoFar[index] = largestSoFar[index2];
					largestSoFar[index2] = temp;
				}
			}
		}

		
		for(int index = k; index < array.length;index++)
		{
			if(array[index]<largestSoFar[largestSoFar.length-1])
			{
				//do nothing
			}else{
				//remove the current smallest element of the aux. array;
				
				//place the element into the correct position in the aux. array;
			}
		}

			

		
		//• Output: kth largest element of the array
		return 0;
	}

	public double time(int[] array, int k) throws IndexingError {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) throws IndexingError {
    	CleverRandomCount test  = new CleverRandomCount(20);
    	
    	int[] array = test.array();
    	CleverSearchTimer timer = new CleverSearchTimer();
    	System.out.println("2nd largest element of " + Arrays.toString(array) + " is " + timer.findKthElement(array,6));
    }

}

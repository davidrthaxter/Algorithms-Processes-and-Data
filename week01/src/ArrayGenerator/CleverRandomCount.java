package ArrayGenerator;

import java.util.Arrays; // in order to be able to use the fill(...) method
import java.util.Random;
/**
 * An extension of RandomCount
 * 
 * @author David Thaxter
 * @version October 2015
 * @note : A more efficient randomize method using a fisher yates shuffle
 **/
public class CleverRandomCount extends RandomCount
{
    /**Constructor*/
    public CleverRandomCount(int size) {
        super(size); //set the size of the array on creation of class
        			//this array then populated with numbers 1 -size
    }
    
    /** Randomize the array*/
    protected void randomise() { 
    	Random randomGenerator = new Random();
    	int randomInt;
    	int temp;
    	int length = array().length -1;//find length of parent array and 0 index
    	for(int index = length;index > 0; index--)
    	{
    		randomInt = randomGenerator.nextInt(index); //generate random int    		
    		temp = array()[index];
    		array()[index] = array()[randomInt];//swap two variables using a temp
    		array()[randomInt] = temp;
    	}	
    }//terminate function
}// End of class SimpleRandomCount
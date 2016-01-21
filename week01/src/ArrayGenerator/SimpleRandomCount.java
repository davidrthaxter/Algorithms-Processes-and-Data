package ArrayGenerator;

import java.util.Arrays; // in order to be able to use the fill(...) method
/**
 * An extension of RandomCount
 * 
 * @author Hugh Osborne
 * @version October 2013
 * @Edit : David Thaxter
 * @version : October 2015
 * @note : Changes of semantic and systematic errors within the code file 
 **/
public class SimpleRandomCount extends RandomCount
{
    /**
     * Constructor
     */
    public SimpleRandomCount(int size) {
        super(size); //set the size of the array on creation of class
        			//this array then populated with numbers 1 -size
    }
    
    /**
     * Randomize the array
     */
    protected void randomise() { //start the randomize function 
        int[] copy = new int[array().length];
        int randomIndex;//temp variable to store a random index
        // used to indicate if elements have been used
        boolean[] used = new boolean[array().length];
        Arrays.fill(used,false);
        for (int index = 0; index < array().length; index++) {
            do {
                randomIndex = randomIndex(); //create random index
            } while (used[randomIndex]); // if the random index is true
            copy[index] = randomIndex; // copy the value at index to the copy variable
            used[randomIndex] = true;//set used to true
        }
        for (int index =0; index < array().length; index++) {
            array()[index] = copy[index];
            //copy the tempary array to the original array
        }//
    }//terminate function

}// End of class SimpleRandomCount
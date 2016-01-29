/*
 * #Name : David Thaxter
 * #Date : 23/10/2015
 * #Version : 1.0.0
 * #Description : A basic class to implement a generic function, the generic function must take a array of generic type,
 * 					then also take two integer values and swap the arrays stored in the index's specified.  
 * 
 */



/*
 * Note : - 
 * int1 and int 2 > 0
 * int1 and int 2 > array.length
 * array length 0
 * 
 * For test classes test index in length, data type mismatch,  index1 < index2
 * Throw exceptions.
 * test data types that aren't comparable 
 */

/**/
public class Generics {
	
	/*Genric function to swap two values in generic array*/
	public static <T> void swap(T array[], int index1,int index2){
		T tempArray = array[index1];
		array[index1] = array[index2];
		array[index2] = tempArray;
	}
	
	public static <T extends Comparable<T>> void max(T array[], int index1,int index2){
		T tempMax = array[index1];
		
		for(int index = index1+1;index < index2;index++){
			
			if(array[index].compareTo(tempMax)>0){
				tempMax = array[index];
			}
		}
	}
	
	
	public static void main(String[] args) {

	}
}

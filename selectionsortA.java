package selectionsort;
import java.util.*;
public class selectionsortA {
	public static void selectionSort(int[] nums) 
	{
	 for (int i = 0; i < nums.length; i++) 
	{
	 // min is the index of the smallest element with an index greater or equal to i
	 int min = i;
	 for (int j = i + 1; j < nums.length; j++) 
	{
	 if (nums[j] < nums[min]) 
	 {
	 min = j;
	 }
	 }
	 // Swapping i-th and min-th elements
	 int swap = nums[i];
	 nums[i] = nums[min];
	 nums[min] = swap;
	 }
	}
	public static void main(String[] args) 
	{
	 int[] array = new int[10000];
	 for (int i = 0; i < array.length; i++) {
	 array[i] = i;
	 }
	 // Shuffle array
	 Collections.shuffle(Arrays.asList(array));
	 // Print shuffled collection
	 System.out.println(" Unsorted Array List is:")
	 System.out.println(\tArrays.toString(array));
	 long startTime = System.nanoTime();
	System.out.println("Selection Sort"); 
	selectionSort(array);
	 long endTime = System.nanoTime();
	 // Print sorted collection
	System.out.println(" the Sorted Array is:");
	 System.out.println(\tArrays.toString(array));
	 // Print runtime in seconds
	 System.out.println("Selection Sort runtime: " + (endTime - startTime)/1000000000);
	}

}

/*Output:
 * Unsorted Array List is: ---------
the Sorted Array is: 0 1 2 3…..10000
Selection Sort runtime: ---
*/
 */
 

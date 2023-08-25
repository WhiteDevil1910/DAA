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
	
	public static void main(String args[])
	{
	int max=50000;
	int n,i;
	Scanner in=new Scanner(System.in);
	Random rand=new Random();
	System.out.println("Selectionsort Test");
	/* Accept no.of Elements */
	System.out.println("\nEnter the number of elements");
	n=in.nextInt();
	/* create array of n elements */
	int arr[]=new int[n];
	try
	{
	/* Generate Random Numbers */
	for(i=0;i<n;i++)
	arr[i]=rand.nextInt(100);
	/* Print random numbers */
	System.out.println("\nthe random elements are ");
	for(i=0;i<n;i++)
	System.out.println(arr[i]+" ");
	long start_time=System.nanoTime();
	/*call method Selection Sort*/
	selectionSort(arr);
	long end_time=System.nanoTime();
	/* Print Sorted Array */
	System.out.println("\nThe Elements After sorting");
	for(i=0;i<n;i++)
	System.out.println(arr[i]+" ");
	long t=end_time - start_time;
	System.out.println("Time taken for execution is:"+t+" nanoseconds");
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
	System.out.println("Array Index reached maximum ");
	}
	}

}
/*
Selectionsort Test

Enter the number of elements
10

the random elements are 
74 
16 
87 
71 
59 
29 
56 
95 
53 
15 

The Elements After sorting
15 
16 
29 
53 
56 
59 
71 
74 
87 
95 
Time taken for execution is:4000 nanoseconds
*/
package quicksort;
import java.util.*;
public class quicksortA {
	static int max=50000;
	public static int partition(int a[],int low,int high)
	{ 
	int i,j,temp,key;
	key=a[low];
	i=low;
	j=high+1;
	while(i<=j)
	{
	do
	i++;
	while (key>=a[i]&& i<=high);
	do
	j--;
	while(key<a[j]);
	if(i<j)
	{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}
	temp=a[low];
	a[low]=a[j];
	a[j]=temp;
	return j;
	}
	public static void qs (int a[],int low, int high)
	{
	int mid;
	if(low<high)
	{
	mid=partition(a,low,high);
	qs(a,low,mid-1);
	qs(a,mid+1,high);
	}
	}
	public static void main(String args[])
	{
	int n,i;
	Scanner in=new Scanner(System.in);
	Random rand=new Random();
	System.out.println("Quicksort Test");
	/* Accept no.of Elements */
	System.out.println("\nEnter the number of elements");
	n=in.nextInt();
	/* create array of n elements */
	int arr[]=new int[max];
	try{
	/* Generate Random Numbers */
	for(i=0;i<=n;i++)
	arr[i]=rand.nextInt(100);
	/* Print random numbers */
	System.out.println("\nthe random elements are ");
	for(i=0;i<n;i++)
	System.out.println(arr[i]+" ");
	long start_time=System.nanoTime();
	/*call method Quick Sort*/
	qs(arr,0,n-1);
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
 * Quicksort Test

Enter the number of elements
10

the random elements are 
0 
20 
58 
93 
32 
36 
24 
61 
0 
71 

The Elements After sorting
0 
0 
20 
24 
32 
36 
58 
61 
71 
93 
Time taken for execution is:4600 nanoseconds
*/

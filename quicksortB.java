package quicksort;
import java.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class quicksortB {
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
	 public static void main(String[] args) {
	 System.out.println("Quick sort test\n");
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("\nEnter the file with path of the file:\n");
	 String filename = scanner.nextLine();
	 try {
	 File file = new File(filename);
	 Scanner fileScanner = new Scanner(file);
	 int arr[] = new int[50];
	 int i = 0;
	 while (fileScanner.hasNextInt()) {
	 int limit = fileScanner.nextInt();
	 arr[i] = limit;
	 i++;
	 }
	 fileScanner.close();
	 System.out.println("\nThe Random elements from file are:\n");
	 for (int j = 0; j < i; j++) {
	 System.out.println(arr[j] + " ");
	 }
	 long start_time = System.nanoTime();
	/*call method Quick Sort*/
	qs(arr,0,n-1);
	long end_time=System.nanoTime();
	/* Print Sorted Array */
	System.out.println("\nThe Elements after sorting");
	for(i=0;i<n;i++)
	System.out.println(arr[i]+" ");
	long t=end_time - start_time;
	System.out.println("Time taken for execution is:"+t+" nanoseconds");
	}
	catch (FileNotFoundException e) {
	 System.out.println("File Not Found\n");
	 }
	catch(ArrayIndexOutOfBoundsException ae)
	{
	System.out.println("Array Index reached maximum ");
	}
	 }
	}



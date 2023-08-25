package mergesort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class mergesortB {
	{
	static int max=50000;
	public static void mergesort(int a[],int low,int high)
	{
	 int mid;
	 if(high>low)
	 {
	 mid=(low+high)/2;
	 mergesort(a,low,mid);
	 mergesort(a,mid+1,high);
	 merge(a,low,mid,high);
	 }
	 }
	public static void merge(int a[],int low,int mid,int high)
	{
	 int k=low,j=mid+1,i=low;
	 int c[]=new int[1000];
	 while((i<=mid)&&(j<=high))
	 {
	 if(a[i]<=a[j])
	 {
	 c[k]=a[i];
	 i=i+1;
	 }
	 else
	 {
	 c[k]=a[j];
	 j=j+1;
	 }
	 k=k+1;
	}
	while(i<=mid)
	{
	 c[k]=a[i];
	 k=k+1;
	 i=i+1;
	}
	while(j<=high)
	{
	 c[k]=a[j];
	 k=k+1;
	 j=j+1;
	}
	for(i=low;i<=high;i++)
	a[i]=c[i];
	}
	 public static void main(String[] args) {
	 System.out.println("Merge sort test\n");
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
	mergesort(arr,0,n-1);
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

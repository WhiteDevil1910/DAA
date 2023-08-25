package selectionsort;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class selectionsortB {

	 public static void SelectionSort(int[] nums, int n) {
	 for (int i = 0; i < n; i++) {
	 int min = i;
	 for (int j = i + 1; j < n; j++) {
	 if (nums[j] < nums[min]) {
	 min = j;
	 }
	 }
	 int swap = nums[i];
	 nums[i] = nums[min];
	 nums[min] = swap;
	 }
	 }
	 public static void main(String[] args) {
	 System.out.println("Selection sort test\n");
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
	 SelectionSort(arr, i); // Pass the actual number of elements read
	 long end_time = System.nanoTime();
	 System.out.println("\nThe Elements after sorting:\n");
	 for (int k = 0; k < i; k++)
	 System.out.println(arr[k]);
	 long time = end_time - start_time;
	 System.out.println("\nTime taken for execution is: " + time + " nanoseconds");
	 } 
	catch (FileNotFoundException e) {
	 System.out.println("File Not Found\n");
	 }
	catch (ArrayIndexOutOfBoundsException e) {
	 System.out.println("Array Index reached maximum");
	 }
	 scanner.close();
	 }
	}



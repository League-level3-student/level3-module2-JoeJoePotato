package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
Random r=new Random();
		if(intArraySorted(array)==true) {
	System.exit(0);
}else {
	int indexone=r.nextInt(array.length);
	int indextwo=r.nextInt(array.length);
int noone=array[indexone];
int notwo=array[indextwo];
 array[indexone]=notwo;
 array[indextwo]=noone;
display.updateDisplay();
}
	}
	
	public static boolean intArraySorted(int[]arr) {
		boolean failed=false;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				failed=true;
			}
		}
		if(failed==true) {
			return false;
		}
		return true;
	}
}

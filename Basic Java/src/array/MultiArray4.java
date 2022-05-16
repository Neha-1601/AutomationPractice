package array;

import java.util.Arrays;

public class MultiArray4 {
// Java Program to clone the array
		public static void main(String args[]) {
			int arr[] = { 33, 3, 4, 5 };  // single dimen array
			System.out.println("Printing original array:");
			for (int i : arr) {
				System.out.println(i);
			}
			System.out.println("Printing clone of the array:");
			int carr[] = arr.clone();  // clone i.e. dicto / dublicate copy of array..
			for (int i : carr) {
				System.out.println(i);
			}
			System.out.println("Are both equal arr & carr ?");
			System.out.println(Arrays.equals(arr, carr));  // equals->compare 2 arrays base on their address/compare 2obj base on their address
			System.out.println("******************************");
			int newCopiedArray[]=Arrays.copyOf(arr, arr.length);  // aplyala have titk copy kru shkto
			for (int i : newCopiedArray){
				System.out.println(i);
			}
			System.out.println("******************************");
			int newCopiedRangeArray[]=Arrays.copyOfRange(arr, 0, 3);
			for (int i : newCopiedRangeArray){
				System.out.println(i);
			}
			System.out.println("Comparing newCopiedRangeArray & newCopiedArray : "
								+Arrays.equals(newCopiedArray, newCopiedRangeArray));	
			System.out.println("**************************");
			Arrays.sort(arr);//sort the array elements in ascending order and stores the sorted element in the same array
			System.out.println("After sorting original array:");
			for (int i : arr) {
				System.out.println(i);
			}

	}

}

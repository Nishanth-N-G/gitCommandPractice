package java8;

import java.util.Arrays;

public class ParallelSorting {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 1, 0, 6, 9 };

//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
		
		long start1 = System.nanoTime();
		Arrays.sort(arr);
		long end1 = System.nanoTime();
		
		System.out.println(end1-start1);

		//System.out.println("\nArray elements after sorting");

//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
		
		long start2 = System.nanoTime();
		Arrays.parallelSort(arr);
		long end2 = System.nanoTime();
		System.out.println(end2-start2);
		
		//System.out.println("\nArray elements after parallel sorting");

//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
	}

}

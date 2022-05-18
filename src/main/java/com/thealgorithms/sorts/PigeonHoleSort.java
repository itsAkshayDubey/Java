package com.thealgorithms.sorts;

/*
 * Java program for Pigeonhole sort 
 * Wikipedia: https://en.wikipedia.org/wiki/Pigeonhole_sort
 * 
 * Author: Akshay Dubey (https://github.com/itsAkshayDubey)
 * 
 * */

import java.util.Arrays;

public class PigeonHoleSort {

    /**
     * This method will sort any integer array passed as parameter using pigeonhole technique
     *
     * @param arr is an integer array to be sorted
     */
	public static void pigeonHoleSort(int[] arr) {
		
		int min = arr[0],max=arr[0];
		
		for(int i=0 ; i<arr.length ; i++) {
			max = arr[i]>max ? arr[i] : max;
			min = arr[i]<min ? arr[i] : min;
		}
		
		int range = max-min+1;
		
		int[] pHole = new int[range];
		
		Arrays.fill(pHole,0);
		
		for(int i=0 ; i<arr.length ; i++) 
			pHole[arr[i]-min]++;
		
		int index=0;
		
		for(int j=0 ; j<range ; j++)
			while(pHole[j]-->0)
				arr[index++]=j+min;
		
	}
}

package com.pgexample.algorithm.mergesort;

import java.util.Arrays;

public class MergeSort_nLogn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] intArray = { 0,2,2,2,6,0};

		mergeSort(intArray);

	}

	private static void mergeSort(int[] intArray) {
		int n = intArray.length;
		if(n < 2) return;
		int mid = n / 2;
		
		int[] left = new int[mid];
		int[] right = new int[n - mid];

		for(int i = 0; i < mid; i++){
			left[i] = intArray[i];
		}

		for(int i = mid; i < n; i++){
			right[i-mid] = intArray[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, intArray);
	}

	private static int[] merge(int[] leftArray, int[] rightArray, int[] intArray) {

		System.out.println(" Merge of leftArray "+Arrays.toString(leftArray)+" rightArray "+Arrays.toString(rightArray) + " rootArray "+Arrays.toString(intArray));
		
		int leftCount = 0;
		int rightCount = 0;
		int rootCount = 0;
		while(leftCount < leftArray.length && rightCount < rightArray.length){
			if(leftArray[leftCount] < rightArray[rightCount]){
				intArray[rootCount] = leftArray[leftCount];
				leftCount++;
			}else{
				intArray[rootCount] = rightArray[rightCount];
				rightCount++;
			}
			rootCount++;
		}
		while(leftCount < leftArray.length){
			intArray[rootCount] = leftArray[leftCount];
			leftCount++;
			rootCount++;
		}
		while(rightCount < rightArray.length){
			intArray[rootCount] = rightArray[rightCount];
			rightCount++;
			rootCount++;
		}

		System.out.println(" After Merge rootArray "+Arrays.toString(intArray));
		return leftArray;
	}
	
	private static int[] mergeTwoSortedArray(int[] leftArray, int[] rightArray, int[] intArray) {

		System.out.println(" Merge of leftArray "+Arrays.toString(leftArray)+" rightArray "+Arrays.toString(rightArray) + " rootArray "+Arrays.toString(intArray));
		
		int leftCount = 0;
		int rightCount = 0;
		int rootCount = 0;
		while(leftCount < leftArray.length && rightCount < rightArray.length){
			if(leftArray[leftCount] > rightArray[rightCount]){
				intArray[rootCount] = leftArray[leftCount];
				leftCount++;
			}else{
				intArray[rootCount] = rightArray[rightCount];
				rightCount++;
			}
			rootCount++;
		}
		while(leftCount < leftArray.length){
			intArray[rootCount] = leftArray[leftCount];
			leftCount++;
			rootCount++;
		}
		while(rightCount < rightArray.length){
			intArray[rootCount] = rightArray[rightCount];
			rightCount++;
			rootCount++;
		}

		System.out.println(" After Merge rootArray "+Arrays.toString(intArray));
		return leftArray;
	}

}

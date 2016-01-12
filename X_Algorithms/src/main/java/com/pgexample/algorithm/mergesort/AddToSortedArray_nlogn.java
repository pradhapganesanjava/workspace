package com.pgexample.algorithm.mergesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToSortedArray_nlogn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] intArray = new int[]{2,8,1,0,0,8,11,2,2,2,9,5};
		
		degreeSequence(intArray);

	}
	
	public static List<Integer> degreeSequence(int[] intArray) {
		List<Integer> degreeSeqList = new ArrayList<Integer>(0);
		int[] degreeSeqArr = new int[intArray.length];
		//int[] tempArr = new int[intArray.length];
		int[] tempArr = null;
		
		for(int i = 0; i < intArray.length; i++){
			int degree = intArray[i];
			System.out.println("Degree of " + i + " " + degree);
			// degreeSeqList.add(degree);

			if(i == 0){
				tempArr = new int[1];
				tempArr[0] = degree;
				degreeSeqArr[0] = degree;
				continue;
			}/*else{
				tempArr = new int[i+1];
				for(int j = 0; j < i; j++){
					tempArr[j] = degreeSeqArr[j];
				}
			}*/
			merge(new int[] { degree }, tempArr, degreeSeqArr);

			tempArr = new int[i+1];
			for(int j = 0; j <= i; j++){
				tempArr[j] = degreeSeqArr[j];
			}

		}

		return degreeSeqList;
	}
	
	private static int[] merge(int[] leftArray, int[] rightArray, int[] intArray) {

		System.out.println(" Merge of leftArray " + Arrays.toString(leftArray) + " rightArray "
				+ Arrays.toString(rightArray) + " rootArray " + Arrays.toString(intArray));

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

		System.out.println(" After Merge rootArray " + Arrays.toString(intArray));
		return leftArray;
	}

}

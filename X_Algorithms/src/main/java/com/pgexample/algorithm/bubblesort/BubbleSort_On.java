package com.pgexample.algorithm.bubblesort;

import java.util.Arrays;

public class BubbleSort_On {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arrInt[] = { 10, 5,11, 2, 1, 9 };

		for(int i = 0; i < arrInt.length; i++){
			for(int j = 0; j < arrInt.length-1; j++){
				int tmp = arrInt[j];
				if(tmp > arrInt[j+1]){
					arrInt[j] = arrInt[j+1];
					arrInt[j+1] = tmp;
				} } }
		
		System.out.println(" arrInt after sort "+Arrays.toString(arrInt));

	}

}

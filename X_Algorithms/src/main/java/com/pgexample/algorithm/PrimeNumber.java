package com.pgexample.algorithm;

import java.util.Arrays;

public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		int[] primNumbers = new int[num];
		int count = 0;
		int i = 1;
		while(count < num){
		/*for(int i = 1; i < num; i++){*/
			if(i < 4 && i > 0){
				primNumbers[count] = i;
				count++;
			}else{
				int factorCount = 0;
				for(int j = i - 1; j > 1; j--){
					if(i % j == 0){
						factorCount++;
					}
				}
				if(factorCount == 0){
					primNumbers[count] = i;
					count++;
				}
			}
			i++;
		}
		
		System.out.println(" primNums "+Arrays.toString(primNumbers));
	}
}

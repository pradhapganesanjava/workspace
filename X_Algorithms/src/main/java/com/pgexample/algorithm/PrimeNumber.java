package com.pgexample.algorithm;

import java.util.Arrays;

public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//O_n_PrimNums();
		O_sqrN_trialDivision_way(10);
	}
	
	//more efficient
	//
	private static void O_logOfLogOfN_sieveOfEratosthenes_way(int num){
		
	}
	
	//over all time consumption of this logic O (n * sqrt n)
	private static void O_sqrN_trialDivision_way(int num){
		
		int[] primNumbers = new int[num];

		int count = 0;
		int i = 1;
		while(count < num){
			if(i < 4 && i > 0){
				primNumbers[count] = i;
				count++;
			}else{
				int factorCount = 0;

				int sqrtVal = (int)Math.sqrt(i);
				System.out.println(count+"sqrt "+sqrtVal);

				//loop goes sqrt of N if n is 81 loops just 9times
				for(int j = 2; j <= sqrtVal; j++){
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

	private static void O_n_PrimNums() {

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
				//loop goes n-1 (almost 'n' times) if n is 81 loops just 80times
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

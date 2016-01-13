package com.pgexample.algorithm;

import java.math.BigInteger;
import java.util.Arrays;

public class FibonacciSeq {

	/**
	 * @param args
	 *            The series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
	 *            The next number is found by adding up the two numbers before
	 *            it. The 2 is found by adding the two numbers before it (1+1)
	 */
	public static void main(String[] args) {

		int count = 10;

		BigInteger[] fibonacciNumArray = new BigInteger[count];
		fibonacciNumArray[0] = new BigInteger("0");
		fibonacciNumArray[1] = new BigInteger("1");
		for (int index = 2; index < count; index++) {
			BigInteger fibonacciNum = new BigInteger("0");
			if (index > 1) {
				BigInteger lastNum = fibonacciNumArray[index - 1];
				BigInteger lastB4Num = fibonacciNumArray[index - 2];
				fibonacciNum = lastB4Num.add(lastNum);
			}
			fibonacciNumArray[index] = fibonacciNum;
		}
		System.out.println("Fibonacci Series for " + count + "'s are "
				+ Arrays.toString(fibonacciNumArray));
	}

}

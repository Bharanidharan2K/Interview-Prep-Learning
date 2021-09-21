package com.plus_one;

public class Main {

	public static void main(String[] args) {
		int[] digits = {9,9,3,9};
		int[] result = plusOne(digits);
		for(int i : result)
			System.out.print(i+" ");
	}
	public static int[] plusOne(int[] digits) {
		int n = digits.length-1;
		while(n >= 0) {
			if(digits[n] == 9) digits[n] = 0;
			else {
				digits[n]++;
				return digits;
			}
			n--;
		}
		int[] new_arr = new int[digits.length+1];
		new_arr[0] = 1;
		return new_arr;
	}

}

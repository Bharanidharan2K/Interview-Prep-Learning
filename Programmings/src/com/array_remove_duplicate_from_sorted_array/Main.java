package com.array_remove_duplicate_from_sorted_array;

public class Main {

	public static void main(String[] args) {
		int []nums = {0,0,1,1,1,2,2,3,3,4};
		Main m = new Main();
		System.out.println(m.removeDuplicates(nums));

	}
	public int removeDuplicates(int[] nums) {
		int i = 0;
		for(int j = 1; j < nums.length; j++) {
			if(nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
	}

}

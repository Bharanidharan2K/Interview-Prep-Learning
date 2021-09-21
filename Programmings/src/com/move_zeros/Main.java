package com.move_zeros;

public class Main {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}
	public static void moveZeroes(int[] nums) {
		int left = 0, right = 0, n = nums.length -1;
		while(right <= n) {
			if(nums[right] == 0) right++;
			else {
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left] = temp;
				left++;
				right++;
			}
		}
		for(int i : nums)
			System.out.print(i+" ");
	}

}

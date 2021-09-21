package com.interaction_of_two_array;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		Integer[] result = intersect(nums1, nums2);
		for(int i : result)
			System.out.print(i+" ");
	}
	public static Integer[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : nums1) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i : nums2) {
			int count = map.get(i);
			if(count > 0) {
				list.add(i);
				map.put(i, count -1);
			}
		}
		Integer[] result = list.toArray(new Integer[0]);
		return result;
	}

}

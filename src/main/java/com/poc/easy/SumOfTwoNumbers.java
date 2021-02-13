package com.poc.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumbers {
	//Time complexity : O(n)
	//Space complexity : O(n) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int target = 9;
		 int[] input = new int[] {2,11,15,7,3};
		 Arrays.stream(twoSum(input,target))
	      .mapToObj(i -> Integer.toUnsignedString(i, 16))
	      .forEach(System.out::println);
		 }
	
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	}


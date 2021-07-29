package com.dg.s2.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	
	public HashSet<Integer> makeLotto2() {
		
		HashSet<Integer> hashset = new HashSet<>();
		Random random = new Random();
		
		while(hashset.size() !=6) {
			int num = random.nextInt(45)+1;
			hashset.add(num);
		}
		
		return hashset;
		
		
		//boolean check = hashset.add(1);
		
		//System.out.println(check);
		
		//check = hashset.add(1);
		//System.out.println(check);
		
		
		
	}
	
	
	
	public int [] makeLotto() {
		Random random = new Random();
		ArrayList<Integer> ar = new ArrayList<>();
		
		int [] nums = new int [6];
		
		for(int i=0;i<nums.length;i++) {
		nums [i] = random.nextInt(45) + 1;
			
			for(int j=0;j<i;j++) {
			if(nums[j]==nums[i]) {
				i--;
				break;
			}
		 }
		
		
	}
		return nums;

}
}

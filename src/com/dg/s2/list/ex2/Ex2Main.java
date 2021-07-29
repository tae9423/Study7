package com.dg.s2.list.ex2;

import java.util.ArrayList;

public class Ex2Main {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(1);
		ar.add(2);
		
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("-----------------");
		MyList myList = new MyList();
		myList.add(ar, 5);
		
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("-----------------");
		
		myList.add(ar, 6);
		

		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("-----------------");
		myList.remove(ar);
		
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
	}

}

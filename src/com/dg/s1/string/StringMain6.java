package com.dg.s1.string;

public class StringMain6 {

	public static void main(String[] args) {
		String weather="서울-대구-대전-광주-부산-제주";
		String [] ar =weather.split("-");
		String weather2="32 89 45 67";
		String [] ar2 = weather2.split(" ");
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		for(int i=0;i<ar2.length;i++) {
			System.out.println(ar2[i]);
		}
		
		String name = "Te st ";
		
		name = name.trim();
		name = name.replace(" ","");
		
		
		
		
		
		System.out.println(name.equals("Test"));
		
		
	}
}

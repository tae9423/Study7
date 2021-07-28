package com.dg.s1.wrapper;

public class WrapperMain1 {

	public static void main(String[] args) {
		String jumin = "970515-1066817";
		jumin = jumin.replace("-", "");
		
		String year1 = jumin.substring(0, 6);
		String [] s1 = year1.split("");
		
		for(int i =0;i<s1.length;i++) {
			
			int y1 = Integer.parseInt(s1[i]);
			System.out.println(y1);
		}
		
		String year2 = jumin.substring(6, 12);
		String [] s2 = year2.split("");
				
		for(int i =0;i<s2.length;i++) {
			
			int y2 = Integer.parseInt(s2[i]);			
			System.out.println(y2);
		}
		
		String last = jumin.substring(12,13);
	
		
		
	}

}

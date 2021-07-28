package com.dg.s1.string;

public class StringMain7 {

	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("seoul, 37, 80, 맑음,");
		sb.append("daegu, 43, 90, 지옥,");
		sb.append("busan, -32, 10, 눈,");
		sb.append("jeju, 3, 40, 비");
		
		System.out.println(sb);
		
		String str = sb.toString();
		
		String [] st2 = str.split(",");
		
		for(int i =0;i<st2.length;i++) {
			System.out.println(st2[i].trim());
		}
	
		
	}

}

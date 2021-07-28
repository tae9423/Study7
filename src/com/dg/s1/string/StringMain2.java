package com.dg.s1.string;

public class StringMain2 {

	public static void main(String[] args) {
		//String name = new String();
		String name="hello World";
		
			
		name ="991021-1234567";
		
		char ch2 = name.charAt(7);
		
		System.out.println(ch2);
		
		if(ch2=='1'||ch2=='5') {
			System.out.println("남자");
		} else if(ch2=='2'||ch2=='6'){
			System.out.println("여자");
		} else {
			System.out.println("잘못 입력됐습니다.");
		}
	
	}
	
}



package com.dg.s1.string;

public class StringMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hello World";		
		char ch = 'o';
		int num=0;
		int count = 0;
		boolean check = true;
		while(check) {
			num = name.indexOf(ch, num);
			
			if(num > 0) {
				num = num +1;
				count = count + 1;
				
			} else {
				System.out.println("검색 종료");
				break;
			}
			
		}
		System.out.println(count);
	}

}

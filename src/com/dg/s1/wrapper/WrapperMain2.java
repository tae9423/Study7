package com.dg.s1.wrapper;

import java.util.Scanner;

public class WrapperMain2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력해주세요");
		String num = sc.next();
		String year = num.substring(0,2);
		int y = Integer.parseInt(year);
		
		
		if(y==20) {
			
			int agee = 2021-(y+2000)+1;
			System.out.println("나이는 "+agee+"살 입니다");
			
		}  else {	
		
		int age2 = 2021 - (y + 1900) + 1; 		
		System.out.println("나이는 "+age2+"살 입니다");
		
		}
			
		String season = num.substring(2, 4);
		
		int s = Integer.parseInt(season);
		
		
			  if(s>=3&&s<=5) {
				  System.out.println("봄에 태어났습니다."); 
				  } else  if(s>=6&&s<=8) {
					  System.out.println("여름에 태어났습니다."); 
					  } else if(s>=9&&s<=11) { 
						  System.out.println("가을에 태어났습니다."); 
					  } else if(s>=12&&s<=2) { 
						  System.out.println("겨울에 태어났습니다."); 
						  }
			 
		 

	}

}

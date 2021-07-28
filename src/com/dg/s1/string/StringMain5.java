package com.dg.s1.string;

import java.util.Scanner;

public class StringMain5 {

	public static void main(String[] args) {
		String n = "Hello.World";
		String n2 = n.replace('l', 'z');
		System.out.println(n);
		System.out.println(n2);
		
		String n3 = n.substring(n.indexOf("."));
		System.out.println(n3);
		
		String [] files = {"jpg", "gif", "png", "svg"};
		
		  Scanner sc = new Scanner(System.in); System.out.println("저장할 파일명을 입력");
		  
		  String name = sc.next();
		  int index = name.lastIndexOf('.');
		  String n4 = name.substring(index +1);
		  System.out.println(n4);
		  boolean check = false;
		  
		  for(int i=0;i<4;i++) {
			  if(n4.equals(files[i])) {
				  check = true;
				  break;
			  }
			 
		  }
		  if(check==true) {
				 System.out.println("이미지 파일입니다.");
			 }else {
				 System.out.println("이미지 파일이 아닙니다.");
			 }
	}

}

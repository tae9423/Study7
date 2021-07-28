package com.dg.s1.wrapper;

public class WrapperMain3 {

	public static void main(String[] args) {
		String jumin = "970515-1066817";
		jumin = jumin.replace("-", "");
		
		
		String year1 = jumin.substring(0, 6);
		String [] s1 = year1.split("");
		int result1 =0;
		
		for(int i =0;i<s1.length;i++) {
			
			int y1 = Integer.parseInt(s1[i]);
			result1 = result1 + y1*(i+2);
			System.out.println(result1);
		}
		
		String year2 = jumin.substring(6, 12);
		String [] s2 = year2.split("");
		int result2 =0;
				
		for(int i =0;i<s2.length;i++) {
			
			int y2 = Integer.parseInt(s2[i]);			
			
			if(i==0) {
				result2 = result2 + y2*8;
			} else if (i==1) {
				result2 = result2 + y2*9;
			} else {
				result2 = result2 + y2*i;
			}
			
			System.out.println(result2);
		}
		
		int a = result1 + result2;
		System.out.println("더한 값은 :" +a+" 입니다");
		
		String last2 = jumin.substring(12,13);
		int last = Integer.parseInt(last2);
		
		int aa = a%11;
		System.out.println("더한 값 나누기 11의 나머지는 :"+aa);
		if(11-aa==last) {
			System.out.println("11에서 뺀 나머지는 : "+(11-aa));
			System.out.println("검증번호는 : " + last);
			System.out.println("올바른 번호 입니다.");
		}
		

	}

}

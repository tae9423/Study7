package com.dg.s1.object;

public class ObjectMain1 {

	public static void main(String[] args) {
		//객체 생성
		//클래스명 참조변수명 = new 생성자();
		Object ob = new Object();
		System.out.println(ob.hashCode());
		System.out.println(ob.toString());
		
		boolean check = ob.equals(ob);
		System.out.println(check);
		
		Test test = new Test();
		Test test2 = new Test();
		System.out.println("=======================");
		System.out.println(test == test2);
		System.out.println(test.num==test2.num);
		
		test2.num2 = 10;
		
		System.out.println(test.equals(test2));

	}

}

package com.dg.s2.Calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		Date d1 = ca.getTime();
		System.out.println(d1);
		
		
		long l1 = ca.getTimeInMillis();//밀리세컨즈
		
		System.out.println(l1);
		
		ca.set(1997, 4, 15);
		long l2 = ca.getTimeInMillis();
		d1 = ca.getTime();
		System.out.println(d1);
		System.out.println(l2);
		
		long l3 = l1 - l2;
		System.out.println(l3);
		
		System.out.println("초 : "+l3/1000L);
		System.out.println("분 : "+l3/(1000L*60));
		System.out.println("시간 : "+l3/(1000L*60*60));
		System.out.println("일 : "+l3/(1000L*60*60*24));
		System.out.println("년 : " + l3/(1000L*60*60*24*365));
		
		
		

	}

}

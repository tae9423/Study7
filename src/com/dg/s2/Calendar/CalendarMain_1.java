package com.dg.s2.Calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain_1 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance(); // new GregorianCalendar();
		System.out.println(ca);
		
		int year = ca.get(Calendar.YEAR);
		System.out.println(year);
		int month = ca.get(Calendar.MONTH)+1;
		System.out.println(month);
		int date = ca.get(Calendar.DATE);
		System.out.println(date);
		
		int hour = ca.get(Calendar.HOUR);
		System.out.println(hour);
		
		int m = ca.get(Calendar.MINUTE);
		System.out.println(m);
		
		int s = ca.get(Calendar.SECOND);
		System.out.println(s);
		
		Date d = ca.getTime();
		System.out.println(d);
		
	}

}

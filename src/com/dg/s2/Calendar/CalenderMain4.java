package com.dg.s2.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderMain4 {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		
		
		Date date = ca.getTime();
		String pattern ="yyyy년 MM월 dd일";
		SimpleDateFormat sf = new SimpleDateFormat(pattern);
		String result = sf.format(date);
		
		System.out.println(result);

	}

}

package com.dg.s2.token;

import java.util.StringTokenizer;

public class TokenMain3 {
	
	public static void main(String[] args) {
		String str1 = "korea-usa-france";
		Nation nation = new Nation();
		String [] s = str1.split("-");
		
		for(int i =0;i<s.length;i++) {
			nation.setName(s[i]);
		}
		
		StringTokenizer st = new StringTokenizer(str1,"-");
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			nation.setName(name);
		}
		
		String str2 = "note10-100-iphone12-130-zflip-300";
		
		String [] str = str2.split("-");
		
		for(int i=0;i<str.length;i++) {
			Phone phone = new Phone();
			phone.setName(str[i]);
			phone.setPrice(str[i++]);
		
			
		}
		
		
	}

}

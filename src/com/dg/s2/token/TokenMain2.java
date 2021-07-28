package com.dg.s2.token;

import java.util.StringTokenizer;

public class TokenMain2 {
	
	public static void main(String[] args) {
		String str = "korea-usa-china*france*uk-canada-germany";
		
		str = str.replace("*", "-");
		
		StringTokenizer st = new StringTokenizer(str, "-");
		
		while(st.hasMoreTokens()) {
			String s =st.nextToken();
			System.out.println(s.toUpperCase());
			
		}
		
	}

}

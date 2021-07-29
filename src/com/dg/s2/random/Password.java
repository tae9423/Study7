package com.dg.s2.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Password {
	
	public String makepassword() {
	
	Random random = new Random();
	StringBuffer sb = new StringBuffer();
	
	for(int i=0; i<8 ;i++) {
		
		int select = random.nextInt(3)+1;
			
			if(select == 1) {
				int num3 = random.nextInt(26)+65;
				char ch = (char)num3;
				sb.append(ch);
				System.out.println(ch);	
			}
			
			else if(select == 2) {
				int num2 = random.nextInt(26)+97;
				char ch = (char)num2;
				sb.append(ch);
				System.out.println(ch);
			}
			else if(select == 3) {
				int num = random.nextInt(10);
				sb.append(num);
				System.out.println(num);
			}
		}

		return sb.toString();
	}

}

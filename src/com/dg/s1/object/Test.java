package com.dg.s1.object;

public class Test {
	
	int num = 1;
	int num2 = 1;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Test t2 = (Test)obj;
		boolean check = true;
		
		if(this.num == t2.num && this.num2==t2.num2) {
			check = true;
		}
		
		return check;
	}
	
	

}

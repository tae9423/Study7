package com.dg.s2.list.ex2;

import java.util.ArrayList;

public class MyList implements DataIO {

	@Override
	public void add(ArrayList<Integer> ar, int num) {
		ar.add(0, num);
		
	}

	@Override
	public void remove(ArrayList<Integer> ar) {
		ar.remove(ar.size()-1);
		
	}
	
	

}

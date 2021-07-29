package com.dg.s2.list;

import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {
		
		ArrayList<Member> ar = new ArrayList<>();
		
		Member member = new Member();
		member.setId("iu");
		member.setPw("pw");
		ar.add(member);
		
		ar.add(new Member());
		ar.get(1).setId("id");
		
		Member member2 = ar.get(0);
		
		

	}

}

package com.dg.s2.list.ex1;

public class MemberView {
	
	public void view() {
		
		MemberDTO memberDTO = MemberSession.SESSION.get("member");
		
		
		System.out.println("ID : "+memberDTO.getId());
		System.out.println("PW : "+memberDTO.getPw());
		System.out.println("AGE : "+memberDTO.getAge());
		

	}

}

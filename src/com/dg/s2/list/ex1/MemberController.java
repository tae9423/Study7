package com.dg.s2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	private Scanner sc;
	private MemberDAO memberDAO;
	private ArrayList<MemberDTO> ar; 
	private MemberView memberView;
	
	public MemberController() {
		sc = new Scanner(System.in);
		memberDAO = new MemberDAO();
		ar = memberDAO.memberInit();
		memberView = new MemberView();
	}
	
	
	public void start() {
		boolean check = true;
				
		while(check) {
			if(MemberSession.SESSION.get("member") != null) {
				this.afterLogin();
				break;
			} else {
			check = beforeLogin();
			}
		}
		
		
	}//start
	
	private void afterLogin() {
		System.out.println("1. Mypage");
		System.out.println("2. Logout");
		int select = sc.nextInt();
		if(select==1) {
			System.out.println("자기 정보 출력");
			memberView.view();
		} else {
			MemberSession.SESSION.put("member", null);
		}
		
		
	}
	
	private boolean beforeLogin() {
		
		System.out.println("번호를 선택해주세요.");
		System.out.println("1.회원가입\t 2.로그인\t 3.종료");
		int select = sc.nextInt();
		boolean flag = true;
		
		switch(select) {
		case 1 :
			memberDAO.memberAdd(ar);
			break;
			
		case 2 :
			MemberDTO memberDTO =  memberDAO.memberLogin(ar);
			if(memberDTO!= null) {
				System.out.println("로그인 성공");
				MemberSession.SESSION.put("member", memberDTO);
				
			} else {
				System.out.println("로그인 실패");
			}
			
			break;
		case 3 :
			System.out.println("종료합니다.");
			flag =false;
		
		}
		
		return flag;
	}

}

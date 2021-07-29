package com.dg.s2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;



public class MemberDAO {
	
	private String info;
	private Scanner sc;
	
	public MemberDAO() {		
		info = "iu,pw1,32,suzy,pw2,27,choa,pw3,30";
		sc = new Scanner(System.in);
	}

	//memberInit
	//info에 있는 정보를 파싱해서 MemberDTO 객체 생성해서 대입
	//ArrayList에 각각 추가하고 리턴
	
	public ArrayList<MemberDTO> memberInit() {
		
		ArrayList<MemberDTO> ar = new ArrayList();
		StringTokenizer st = new StringTokenizer(info, ",");
		
		while(st.hasMoreTokens()){
			MemberDTO memberDTO = new MemberDTO();
			String id = st.nextToken();
			memberDTO.setId(id);
			
			String pw = st.nextToken();
			memberDTO.setPw(pw);
			String age = st.nextToken();
			int age2 = Integer.parseInt(age);
			memberDTO.setAge(age2);
			
			ar.add(memberDTO);
			
		}
		
		return ar;
		}
	
	public void memberAdd(ArrayList<MemberDTO> ar) {
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("id를 입력하세요");
		memberDTO.setId(sc.next());
		
		System.out.println("pw를 입력하세요");
		memberDTO.setPw(sc.next());
		
		System.out.println("age를 입력하세요");
		memberDTO.setAge(sc.nextInt());
		
		ar.add(memberDTO);
	}
	
	public int memberDelete(ArrayList<MemberDTO> ar) {
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("id를 입력하세요");
		
		memberDTO.setId(sc.next());
		System.out.println("pw를 입력하세요");
		
		memberDTO.setPw(sc.next());
		int result = 0;
		
		for(int i=0;i<ar.size();i++) {
			if(memberDTO.getId().equals(ar.get(i).getId()) && memberDTO.getPw().equals(ar.get(i).getPw())) {
				ar.remove(i);
				result =1;
				break;
			}
		}
		return result;
	}
	
	public MemberDTO memberLogin(ArrayList<MemberDTO> ar) {
		MemberDTO memberDTO = new MemberDTO();		
		
		System.out.println("id를 입력하세요");
		
		memberDTO.setId(sc.next());
		System.out.println("pw를 입력하세요");
		
		memberDTO.setPw(sc.next());
		MemberDTO result = null;
		
		for(int i=0;i<ar.size();i++) {
			if(memberDTO.getId().equals(ar.get(i).getId()) && memberDTO.getPw().equals(ar.get(i).getPw())) {
				result = ar.get(i);
				break;
			}
			
		}
		return result;
	}
		
	}


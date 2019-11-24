package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	private Member[] m = new Member[SIZE];
	public static int SIZE = 10;
	// 이거자체가 11명 아닌가..? 11명으로 해보자..
	
	int currentMember = 0;
	public int existMemberNum() {
		return currentMember;
	}
	public Boolean checkId(String inputId) {
		Boolean checkId = true; 
		if(m[0] != null) {
			for(int i = 0; i <= currentMember-1; i++) {
				if(!m[i].getId().equals(inputId)) {
					checkId = false;
				} else if(m[i].getId().equals(inputId)) {
					checkId = true;
					break;
				}
			}
		}
		if(currentMember == 0) {
			checkId = false;
		}
		return checkId;
		// 새 배열을 만들어서? 하면은..
		// 다시 새 배열과 inputId를 비교해주는 for문을 만들어줘야하니까.. 딴걸로 하면
//		String checkId[] = new String[SIZE];
//		for(int i = 0; i < SIZE; i++) {
//			checkId[i] = m[i].getId();
//		}
	}
	public void insertMember(String id, String name, String password,
							String email, String gender, int age) {
		m[currentMember] = new Member(id, name, password, email, gender.charAt(0), age);
//		m[SIZE].setId(id);
//		m[SIZE].setName(name);
//		m[SIZE].setPassword(password);
//		m[SIZE].setEmail(email);
//		m[SIZE].setGender(gender.charAt(0));
//		m[SIZE].setAge(age);
		currentMember += 1;
	}
	
	public String searchId(String id) {
		int idArr = 0;
		for(int i = 0; i <= currentMember-1; i++) {
			if(i == 0 && m[i].getId().equals(id)) {
				return m[idArr].inform();
			} else if(m[i].getId().equals(id)) {
				idArr = i;
				return m[idArr].inform();
			}
		}
		return "검색 결과가 없습니다.";
	}
	public Member[] searchName(String name) {
		Member[] nameArr = new Member[currentMember];
		for(int i = 0; i <= currentMember-1; i++) {
			if(m[i].getName().equals(name)) {
				nameArr[i] = m[i];
			} else {
				nameArr = null;
			}
		}
		return nameArr;
	}
	public Member[] searchEmail(String email) {
		Member[] emailArr = new Member[currentMember];
		for(int i = 0; i <= currentMember-1; i++) {
			if(m[i].getEmail().equals(email)) {
				emailArr[i] = m[i];
			} else {
				emailArr = null;
			}
		}
		return emailArr;
	}
	
	public Boolean updatePassword(String id, String password) {
		Boolean okId = true;
		if(m[0] != null) {
			for(int i = 0; i <= currentMember-1; i++) {
				if(!m[i].getId().equals(id)) {
					okId = false;
				} else if(m[i].getId().equals(id)) {
					okId = true;
					m[i].setPassword(password);
					break;
				}
			}
		}
		if(currentMember == 0) {
			okId = false;
		}
		return okId;
	}
	public Boolean updateName(String id, String name) {
		Boolean okId = true;
		if(m[0] != null) {
			for(int i = 0; i <= currentMember-1; i++) {
				if(!m[i].getId().equals(id)) {
					okId = false;
				} else if(m[i].getId().equals(id)) {
					okId = true;
					m[i].setName(name);
					break;
				}
			}
		}
		if(currentMember == 0) {
			okId = false;
		}
		return okId;
	}
	
	public Boolean updateEmail(String id, String email) {
		Boolean okId = true;
		if(m[0] != null) {
			for(int i = 0; i <= currentMember-1; i++) {
				if(!m[i].getId().equals(id)) {
					okId = false;
				} else if(m[i].getId().equals(id)) {
					okId = true;
					m[i].setEmail(email);
					break;
				}
			}
		}
		if(currentMember == 0) {
			okId = false;
		}
		return okId;
	}
	
	public Boolean delete(String id) {
		Boolean okId = true;
		if(m[0] != null) {
			for(int i = 0; i <= currentMember-1; i++) {
				if(!m[i].getId().equals(id)) {
					okId = false;
				} else if(m[i].getId().equals(id)) {
					okId = true;
					m[i] = null;
					currentMember -= 1;
					break;
				}
			}
		}
//		if(currentMember == 0) {
//			okId = false;
//		}
		return okId;
	}
	
	public void delete() {
		m = null;
		currentMember -= 1;
	}
	public Member[] printAll() {
		Member[] allArr = new Member[currentMember];
		if(currentMember == 0) {
			allArr = null;
		}
		for(int i = 0; i <= currentMember-1; i++) {
			if(m != null) {
				allArr[i] = m[i];
			}
		}
		return allArr;
	}
}

package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		do {
			System.out.println();
			System.out.println("최대 등록 가능한 회원 수는 "+ mc.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는" + mc.existMemberNum() + "명입니다.");
	
			if(mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록");
			} else if(mc.existMemberNum() == 10) {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: insertMember(); break;
			case 2: searchMember(); break;
			case 3: updateMember(); break;
			case 4: deleteMember(); break;
			case 5: printAll(); break;
			case 9: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
			if(menuNum == 9) {
				break;
			}
		}while(true);
	}
	
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		
		String inputId = "";
		sc.nextLine();
		do {
			System.out.print("아이디 : ");
			inputId = sc.nextLine();
			if(mc.checkId(inputId)) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
			if(!mc.checkId(inputId)) {
				break;
			}
		}while(true);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		String gender = "";
		do{
			System.out.print("성별(M/F) : ");
			gender = sc.nextLine();
			if(gender.toUpperCase().equals("M") || gender.toUpperCase().equals("F")) {
				break;
			} else {
				System.out.println("성별을 다시 입력하세요.");
			}
		}while(true);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(inputId, name, password, email, gender, age);
		// mainMenu();
	}
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: searchId(); break;
		case 2: searchName(); break;
		case 3: searchEmail(); break;
		case 9: System.out.println("메인으로 돌아갑니다."); break;
		default: System.out.println("잘못 입력하셨습니다."); break;
		}
	}
	public void searchId() {
		sc.nextLine();
		System.out.print("검색할 아이디 : ");
		String inputId = sc.nextLine();
		if(mc.checkId(inputId)) {
			System.out.println("찾으신 검색 결과 입니다.");
			System.out.println(mc.searchId(inputId));
		} else {
			System.out.println(mc.searchId(inputId)); // mainMenu();
		}
	}
	public void searchName() {
		sc.nextLine();
		System.out.print("검색할 이름 : ");
		String inputName = sc.nextLine();
		if(mc.searchName(inputName) != null && mc.searchName(inputName).length != 0) {
			System.out.println("찾으신 회원 조회 결과 입니다.");
			for(int i = 0; i < mc.searchName(inputName).length; i++) {
				System.out.println(mc.searchName(inputName)[i].inform());
			}
		} else {
			System.out.println("검색 결과가 없습니다."); // mainMenu();
		}
	}
	public void searchEmail() {
		sc.nextLine();
		System.out.print("검색할 이메일 : ");
		String inputEmail = sc.nextLine();
		if(mc.searchEmail(inputEmail) != null && mc.searchName(inputEmail).length != 0) {
			System.out.println("찾으신 회원 조회 결과 입니다.");
			for(int i = 0; i < mc.searchEmail(inputEmail).length; i++) {
				System.out.println(mc.searchEmail(inputEmail)[i].inform());
			}
		} else {
			System.out.println("검색 결과가 없습니다."); // mainMenu();
		}
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: updatePassword(); break;
		case 2: updateName(); break;
		case 3: updateEmail(); break;
		case 9: System.out.println("메인으로 돌아갑니다."); break;
		default: System.out.println("잘못 입력하셨습니다."); break; 
		}
	}
	public void updatePassword() {
		sc.nextLine();
		System.out.print("수정할 회원의 아이디 : ");
		String inputId = sc.nextLine();
		System.out.print("수정할 비밀번호 : ");
		String inputPassword = sc.nextLine();
		if(mc.updatePassword(inputId, inputPassword)) {
			System.out.println("수정이 성공적으로 되었습니다.");
			// mainMenu();
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			// mainMenu();
		}
	}
	public void updateName() {
		sc.nextLine();
		System.out.print("수정할 회원의 아이디 : ");
		String inputId = sc.nextLine();
		System.out.print("수정할 이름 : ");
		String inputName = sc.nextLine();
		if(mc.updateName(inputId, inputName)) {
			System.out.println("수정이 성공적으로 되었습니다.");
			// mainMenu();
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			// mainMenu();
		}
	}
	public void updateEmail() {
		sc.nextLine();
		System.out.print("수정할 회원의 아이디 : ");
		String inputId = sc.nextLine();
		System.out.print("수정할 이메일 : ");
		String inputEmail = sc.nextLine();
		if(mc.updateEmail(inputId, inputEmail)) {
			System.out.println("수정이 성공적으로 되었습니다.");
			// mainMenu();
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			// mainMenu();
		}
	}
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: deleteOne(); break;
		case 2: deleteAll(); break;
		case 9: System.out.println("메인으로 돌아갑니다."); break;
		default: System.out.println("잘못 입력하셨습니다."); break; 
		}
	}
	public void deleteOne() {
		sc.nextLine();
		System.out.print("삭제할 회원의 아이디 : ");
		String inputId = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		String deleteCheck = sc.nextLine();
		if(deleteCheck.equalsIgnoreCase("Y")) {
			if(mc.delete(inputId)) {
				System.out.println("성공적으로 삭제하였습니다.");
				// mainMenu();
			} else if(!mc.delete(inputId)) {
				System.out.println("존재하지 않는 아이디입니다.");
				// mainMenu();
			}
		} else if (deleteCheck.equalsIgnoreCase("N")) {
			System.out.println("삭제하지 않습니다.");
			// mainMenu();
		}
	}
	public void deleteAll() {
		sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		String deleteCheck = sc.nextLine();
		if(deleteCheck.equalsIgnoreCase("Y")) {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
			// mainMenu();
		} else if (deleteCheck.equalsIgnoreCase("N")) {
			System.out.println("삭제하지 않습니다.");
			// mainMenu();
		}
	}
	
	public void printAll() {
		if(mc.printAll() == null) {
			System.out.println("저장된 회원이 없습니다.");
		} else {
			for(int i = 0; i < mc.printAll().length; i++) {
				System.out.println(mc.printAll()[i].inform());
			}
		}
	}
}

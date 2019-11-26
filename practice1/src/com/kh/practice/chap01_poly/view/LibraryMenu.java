package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		do {
		System.out.println();
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: System.out.println(lc.myInfo().toString()); break;
		case 2: selectAll(); break;
		case 3: searchBook(); break;
		case 4: rentBook(); break;
		case 9: System.out.println("프로그램을 종료합니다.."); break;
		}
		if(menuNum == 9) {
			break;
		}
		}while(true);
	}
	public void selectAll() {
//		for(int i = 0; i < lc.selectAll().length; i++) {
//			System.out.println(i + "번도서 : " + lc.selectAll()[i]);
//		}
		for(int i = 0; i < lc.selectAll().length; i++) {
			if(lc.selectAll()[i] instanceof AniBook) {
				System.out.println(i + "번도서 : " + ((AniBook)lc.selectAll()[i]).toString());
			} else if(lc.selectAll()[i] instanceof CookBook) {
				System.out.println(i + "번도서 : " + ((CookBook)lc.selectAll()[i]).toString());
			}
		}
	}
	public void searchBook() {
		System.out.println();
		System.out.print("검색할 제목 키워드 : ");
		sc.nextLine();
		String keyword = sc.nextLine();
//		for(int i = 0; i < lc.searchBook(keyword).length; i++) {
//			System.out.println(lc.searchBook(keyword)[i]);
//		}
		for(int i = 0; i < lc.searchBook(keyword).length; i++) {
			if(lc.searchBook(keyword)[i] instanceof AniBook) {
				System.out.println(((AniBook)lc.searchBook(keyword)[i]).toString());
			} else if(lc.searchBook(keyword)[i] instanceof CookBook) {
				System.out.println(((CookBook)lc.searchBook(keyword)[i]).toString());
			}
		}
	}
	public void rentBook() {
		System.out.println();
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		switch(lc.rentBook(index)) {
		case 0: System.out.println("성공적으로 대여되었습니다."); break;
		case 1: System.out.println("나이 제한으로 대여 불가능입니다."); break;
		case 2: System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요"); break;
		}
	}
}

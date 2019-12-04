package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		
		do {
		System.out.println("===== Welcome KH Library =====");
		System.out.println("=====****** 메인 메뉴  ******=====");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 : ");
		int menuNum = Integer.parseInt(sc.nextLine());
		
		switch(menuNum) {
		case 1:	insertBook(); break;
		case 2: selectList(); break;
		case 3: searchBook(); break;
		case 4: deleteBook(); break;
		case 5: ascBook(); break;
		case 9: System.out.println("프로그램을 종료합니다."); return;
		default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break;
		}
		}while(true);
		
	}
	
	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		String category = sc.nextLine();
		int category2 = Integer.parseInt(category);
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		switch(category2) {
		case 1: category = "인문"; break;
		case 2: category = "자연과학"; break;
		case 3: category = "의료"; break;
		case 4: category = "기타"; break;
		}
		Book b = new Book(title, author, category, price);
		bc.insertBook(b);
	}
	
	public void selectList() {
		System.out.println("===== 도서 전체 조회 =====");
//		bc.selectList();
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList = bc.selectList();
		
		if(bookList == null) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
	}
	
	public void searchBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
//		bc.searchBook(keyword);
		ArrayList<Book> searchList = new ArrayList<Book>();
		searchList = bc.searchBook(keyword);
		
		if(searchList == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}
	
	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();
		// 도서명과 저자명을 같이 입력 받는 이유
		// --> 같은 도서명이라고 해도 저자명이 다른 도서가 있을 수 있기 때문에
		Book remove = bc.deleteBook(title, author);
		
		if(remove == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		} else {
			System.out.println("성공적으로 삭제되었습니다.");
		}
	}
	
	public void ascBook() {
		if(bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}

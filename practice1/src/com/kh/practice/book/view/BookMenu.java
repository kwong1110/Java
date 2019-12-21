package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	public BookMenu(){
		bc.makeFile();
		bArr = bc.fileRead();
//		for(Book a : bArr) {
//			System.out.println(a);
//		}
	}
	
	public void mainMenu() {
		do {
			System.out.println("========도서 목록========");
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum){
			case 1: fileSave(); break;
			case 2: fileRead(); break;
			case 9: System.out.println("프로그램 종료.."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break; 
			}
		}while(true);
	}
	
	public void fileSave() {
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String[] dateArr = sc.nextLine().split("-");
		int year = Integer.parseInt(dateArr[0]);
		int month = Integer.parseInt(dateArr[1]);
		int intDate = Integer.parseInt(dateArr[2]);
		
		Calendar date = new GregorianCalendar(year, month-1, intDate, 0, 0, 0);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.print("할인율 : ");
		double discount = Double.parseDouble(sc.nextLine());
		
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[i] == null) {
				bArr[i] = new Book(title, author, price, date, discount);
				break;
			};
		}

		bc.fileSave(bArr);
	}
	
	public void fileRead() {
		for(Book b : bc.fileRead()) {
			if(b != null) {
				System.out.println(b);
			}
		}
		
//		for(int i = 0; i < bArr.length; i++) {
//			if(bArr[i] != null) {
//				System.out.println(bArr[i]);
//			}
//		}
	}
}

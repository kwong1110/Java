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
			System.out.println("========���� ���========");
			System.out.println("1. ���� �߰� ����");
			System.out.println("2. ���� ���� ���");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum){
			case 1: fileSave(); break;
			case 2: fileRead(); break;
			case 9: System.out.println("���α׷� ����.."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break; 
			}
		}while(true);
	}
	
	public void fileSave() {
		System.out.print("���� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String author = sc.nextLine();
		System.out.print("���� ���� : ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� ��¥(yyyy-mm-dd) : ");
		String[] dateArr = sc.nextLine().split("-");
		int year = Integer.parseInt(dateArr[0]);
		int month = Integer.parseInt(dateArr[1]);
		int intDate = Integer.parseInt(dateArr[2]);
		
		Calendar date = new GregorianCalendar(year, month-1, intDate, 0, 0, 0);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.print("������ : ");
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

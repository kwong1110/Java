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
		System.out.println("=====****** ���� �޴�  ******=====");
		System.out.println("1. �� ���� �߰�");
		System.out.println("2. ���� ��ü ��ȸ");
		System.out.println("3. ���� �˻� ��ȸ");
		System.out.println("4. ���� ����");
		System.out.println("5. ���� �� �������� ����");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ ���� : ");
		int menuNum = Integer.parseInt(sc.nextLine());
		
		switch(menuNum) {
		case 1:	insertBook(); break;
		case 2: selectList(); break;
		case 3: searchBook(); break;
		case 4: deleteBook(); break;
		case 5: ascBook(); break;
		case 9: System.out.println("���α׷��� �����մϴ�."); return;
		default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���."); break;
		}
		}while(true);
		
	}
	
	public void insertBook() {
		System.out.println("===== �� ���� �߰� =====");
		System.out.println("å ������ �Է����ּ���.");
		System.out.print("���� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String author = sc.nextLine();
		System.out.print("�帣(1. �ι� / 2. ���� / 3. �ܱ��� / 4. ��Ÿ) : ");
		String category = sc.nextLine();
		int category2 = Integer.parseInt(category);
		System.out.print("���� : ");
		int price = Integer.parseInt(sc.nextLine());
		
		switch(category2) {
		case 1: category = "�ι�"; break;
		case 2: category = "�ڿ�����"; break;
		case 3: category = "�Ƿ�"; break;
		case 4: category = "��Ÿ"; break;
		}
		Book b = new Book(title, author, category, price);
		bc.insertBook(b);
	}
	
	public void selectList() {
		System.out.println("===== ���� ��ü ��ȸ =====");
//		bc.selectList();
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList = bc.selectList();
		
		if(bookList == null) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		} else {
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
	}
	
	public void searchBook() {
		System.out.println("===== ���� �˻� =====");
		System.out.print("�˻� Ű���� : ");
		String keyword = sc.nextLine();
//		bc.searchBook(keyword);
		ArrayList<Book> searchList = new ArrayList<Book>();
		searchList = bc.searchBook(keyword);
		
		if(searchList == null) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}
	
	public void deleteBook() {
		System.out.println("===== ���� ���� =====");
		System.out.print("������ ���� �� : ");
		String title = sc.nextLine();
		System.out.print("������ ���� �� : ");
		String author = sc.nextLine();
		// ������� ���ڸ��� ���� �Է� �޴� ����
		// --> ���� �������̶�� �ص� ���ڸ��� �ٸ� ������ ���� �� �ֱ� ������
		Book remove = bc.deleteBook(title, author);
		
		if(remove == null) {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		} else {
			System.out.println("���������� �����Ǿ����ϴ�.");
		}
	}
	
	public void ascBook() {
		if(bc.ascBook() == 1) {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		} else {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		}
	}
}

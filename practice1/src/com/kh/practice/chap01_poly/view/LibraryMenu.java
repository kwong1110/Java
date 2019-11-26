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
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� : ");
		sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		do {
		System.out.println();
		System.out.println("==== �޴� ====");
		System.out.println("1. ����������");
		System.out.println("2. ���� ��ü ��ȸ");
		System.out.println("3. ���� �˻�");
		System.out.println("4. ���� �뿩�ϱ�");
		System.out.println("9. ���α׷� �����ϱ�");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: System.out.println(lc.myInfo().toString()); break;
		case 2: selectAll(); break;
		case 3: searchBook(); break;
		case 4: rentBook(); break;
		case 9: System.out.println("���α׷��� �����մϴ�.."); break;
		}
		if(menuNum == 9) {
			break;
		}
		}while(true);
	}
	public void selectAll() {
//		for(int i = 0; i < lc.selectAll().length; i++) {
//			System.out.println(i + "������ : " + lc.selectAll()[i]);
//		}
		for(int i = 0; i < lc.selectAll().length; i++) {
			if(lc.selectAll()[i] instanceof AniBook) {
				System.out.println(i + "������ : " + ((AniBook)lc.selectAll()[i]).toString());
			} else if(lc.selectAll()[i] instanceof CookBook) {
				System.out.println(i + "������ : " + ((CookBook)lc.selectAll()[i]).toString());
			}
		}
	}
	public void searchBook() {
		System.out.println();
		System.out.print("�˻��� ���� Ű���� : ");
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
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		switch(lc.rentBook(index)) {
		case 0: System.out.println("���������� �뿩�Ǿ����ϴ�."); break;
		case 1: System.out.println("���� �������� �뿩 �Ұ����Դϴ�."); break;
		case 2: System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���"); break;
		}
	}
}

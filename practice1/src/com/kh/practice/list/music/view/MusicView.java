package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.model.vo.Music;
import com.kh.practice.list.music.music.controller.MusicController;

public class MusicView {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		do {
			System.out.println();
			System.out.println("=====***** ���� �޴� *****=====");
			System.out.println("1. ������ ��ġ�� �� �߰�");
			System.out.println("2. ù ��ġ�� �� �߰�");
			System.out.println("3. ��ü �� ��� ���");
			System.out.println("4. Ư�� �� �˻�");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ���� ����");
			System.out.println("7. ��� �������� ����");
			System.out.println("8. ������ �������� ����");
			System.out.println("9. ����");
			System.out.println();
			System.out.print("�޴� ��ȣ �Է� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: addList(); break;
			case 2: addAtZero(); break;
			case 3: printAll(); break;
			case 4: searchMusic(); break;
			case 5: removeMusic(); break;
			case 6: setMusic(); break;
			case 7: ascTitle(); break;
			case 8: descSinger(); break;
			case 9: System.out.println("����!"); return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); 
			}
		}while(true);
	}
	
	public void addList() {
		System.out.println("****** ������ ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		Music m = new Music(title, singer);
//		mc.addList(m);
		if(mc.addList(m) == 1) {
			System.out.println("�߰� ����!!");
		} else {
			System.out.println("�߰� ����..");
		}
	}
	
	public void addAtZero() {
		System.out.println("****** ù ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		Music m = new Music(title, singer);
//		mc.addAtZero(m);
		if(mc.addAtZero(m) == 1) {
			System.out.println("�߰� ����!!");
		} else {
			System.out.println("�߰� ����..");
		}
	}
	
	public void printAll() {
		System.out.println("****** ��ü �� ��� ��� ******");
		if(mc.printAll() == 1) {
			System.out.println("��� ����!!");
		} else {
			System.out.println("��� ����..");
		}
	}
	
	// �ѹ�������***************
	public void searchMusic() {
		System.out.println("****** Ư�� �� �˻� ******");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
//		mc.searchMusic(title);
		if(mc.searchMusic(title).getTitle() == null) {
			System.out.println("�˻��� ���� �����ϴ�.");
		} else {
			System.out.println("�˻��� ���� " + mc.searchMusic(title) + "�Դϴ�.");
		}
	}
	// �ѹ�������***************
	public void removeMusic() {
		System.out.println("****** Ư�� �� ���� ******");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
//		mc.removeMusic(title);
		if(mc.searchMusic(title).getTitle() == null) {
			System.out.println("������ ���� �����ϴ�.");
		} else {
			System.out.println(mc.removeMusic(title) + "��(��) ���� �߽��ϴ�.");
		}
	}
	
	public void setMusic() {
		System.out.println("****** Ư�� �� ���� ���� ******");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
		System.out.print("������ �� �� : ");
		String reTitle = sc.nextLine();
		System.out.print("������ ���� �� : ");
		String singer = sc.nextLine();
		
		Music m = new Music(reTitle, singer);
		if(mc.setMusic(title, m).equals(m)) {
			System.out.println("������ ���� �����ϴ�");
		} else {
			System.out.println(mc.setMusic(title, m) + "�� ���� ���� �Ǿ����ϴ�.");
		}
	}
	
	public void ascTitle() {
		if(mc.ascTitle() == 1) {
			System.out.println("���� ����!!");
		} else {
			System.out.println("���� ����..");			
		}
	}
	
	public void descSinger() {
		if(mc.descSinger() == 1) {
			System.out.println("���� ����!!");
		} else {
			System.out.println("���� ����..");			
		}
	}
}

package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		int menuNum = 0;
		do {
			System.out.println("***** My Note *****");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: fileSave(); break;
			case 2: fileOpen(); break;
			case 3: fileEdit(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
			}
		}while(menuNum != 9);
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String contents = "";
		do {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� : ");
			contents = sc.nextLine();
			if(!contents.equals("ex��it")) {
				// �ٹٲ��Ͽ� ����! �ʱ��ϱ�!
				sb.append(contents + "\r\n");
//				saveC = contents;
//			} else if(!sb.equals(null) && !contents.equals("ex��it")){
//				sb.append(saveC).append(contents);
//				saveC = contents;
			}			
		}while(!contents.equals("ex��it"));
		
		String file = ""; 
		do {
			System.out.print("������ ���� ���� �Է����ּ���(ex. myFile.txt) : ");
			file = sc.nextLine();
			if(fc.checkName(file)) {
				System.out.print("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�?(y/n) : ");
				String overWrite = sc.nextLine();
				if(overWrite.equalsIgnoreCase("Y")) {
					break;
				} else if(overWrite.equalsIgnoreCase("N")){
					System.out.println("������ ���� ���� �Է����ּ��� ~ ");
				} else {
					System.out.println("y / n �߿� �Է����ּ���.");
				}
			} else {
				break;
			}
		} while(true);
		fc.fileSave(file, sb);
	}
	
	public void fileOpen() {
		System.out.print("�� ���� �� : ");
		String file = sc.nextLine();
		if(fc.checkName(file)) {
			System.out.println(fc.fileOpen(file));
		} else {
			System.out.println("���� �����Դϴ�.");
		}
	}
	
	public void fileEdit() {
		System.out.print("������ ���� �� : ");
		String file = sc.nextLine();
		if(fc.checkName(file)) {
			StringBuilder sb = new StringBuilder();
			String contents = "";
			do {
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
				System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
				System.out.print("���� : ");
				contents = sc.nextLine();
				if(!contents.equals("ex��it")) {
					sb.append(contents + "\r\n");
				}
			}while(!contents.equals("ex��it"));
			fc.fileEdit(file, sb);
		} else {
			System.out.println("���� �����Դϴ�.");
		}
	}
}

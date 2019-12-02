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
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: fileSave(); break;
			case 2: fileOpen(); break;
			case 3: fileEdit(); break;
			case 9: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}while(menuNum != 9);
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String contents = "";
		do {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			contents = sc.nextLine();
			if(!contents.equals("ex끝it")) {
				// 줄바꿈하여 저장! 필기하기!
				sb.append(contents + "\r\n");
//				saveC = contents;
//			} else if(!sb.equals(null) && !contents.equals("ex끝it")){
//				sb.append(saveC).append(contents);
//				saveC = contents;
			}			
		}while(!contents.equals("ex끝it"));
		
		String file = ""; 
		do {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			file = sc.nextLine();
			if(fc.checkName(file)) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				String overWrite = sc.nextLine();
				if(overWrite.equalsIgnoreCase("Y")) {
					break;
				} else if(overWrite.equalsIgnoreCase("N")){
					System.out.println("저장할 파일 명을 입력해주세요 ~ ");
				} else {
					System.out.println("y / n 중에 입력해주세요.");
				}
			} else {
				break;
			}
		} while(true);
		fc.fileSave(file, sb);
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String file = sc.nextLine();
		if(fc.checkName(file)) {
			System.out.println(fc.fileOpen(file));
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String file = sc.nextLine();
		if(fc.checkName(file)) {
			StringBuilder sb = new StringBuilder();
			String contents = "";
			do {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				contents = sc.nextLine();
				if(!contents.equals("ex끝it")) {
					sb.append(contents + "\r\n");
				}
			}while(!contents.equals("ex끝it"));
			fc.fileEdit(file, sb);
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
}

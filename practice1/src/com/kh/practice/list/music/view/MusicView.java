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
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.println();
			System.out.print("메뉴 번호 입력 : ");
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
			case 9: System.out.println("종료!"); return;
			default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); 
			}
		}while(true);
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		Music m = new Music(title, singer);
//		mc.addList(m);
		if(mc.addList(m) == 1) {
			System.out.println("추가 성공!!");
		} else {
			System.out.println("추가 실패..");
		}
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		Music m = new Music(title, singer);
//		mc.addAtZero(m);
		if(mc.addAtZero(m) == 1) {
			System.out.println("추가 성공!!");
		} else {
			System.out.println("추가 실패..");
		}
	}
	
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		if(mc.printAll() == 1) {
			System.out.println("출력 성공!!");
		} else {
			System.out.println("출력 실패..");
		}
	}
	
	// 한번더보기***************
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
//		mc.searchMusic(title);
		if(mc.searchMusic(title).getTitle() == null) {
			System.out.println("검색한 곡이 없습니다.");
		} else {
			System.out.println("검색한 곡은 " + mc.searchMusic(title) + "입니다.");
		}
	}
	// 한번더보기***************
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
//		mc.removeMusic(title);
		if(mc.searchMusic(title).getTitle() == null) {
			System.out.println("삭제할 곡이 없습니다.");
		} else {
			System.out.println(mc.removeMusic(title) + "을(를) 삭제 했습니다.");
		}
	}
	
	public void setMusic() {
		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		String reTitle = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String singer = sc.nextLine();
		
		Music m = new Music(reTitle, singer);
		if(mc.setMusic(title, m).equals(m)) {
			System.out.println("수정할 곡이 없습니다");
		} else {
			System.out.println(mc.setMusic(title, m) + "의 값이 변경 되었습니다.");
		}
	}
	
	public void ascTitle() {
		if(mc.ascTitle() == 1) {
			System.out.println("정렬 성공!!");
		} else {
			System.out.println("정렬 실패..");			
		}
	}
	
	public void descSinger() {
		if(mc.descSinger() == 1) {
			System.out.println("정렬 성공!!");
		} else {
			System.out.println("정렬 실패..");			
		}
	}
}

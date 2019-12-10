package com.kh.practice.generics.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {

	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		
		do {
			System.out.println("===******* 메인 메뉴 *******===");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: adminMenu(); break;
			case 2: customerMenu(); break;
			case 9: System.out.println("프로그램 종료.."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}while(true);
	}
	
	public void adminMenu() {
		do {
			System.out.println("===******* 직원 메뉴 *******===");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: addNewKind(); break;
			case 2: removeKind(); break;
			case 3: changeAmount(); break;
			case 4: printFarm(); break;
			case 9: return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}while(true);
	}
	
	public void customerMenu() {
		System.out.println("~~~~~ 현재 KH마트 농산물 수량 ~~~~~");
		do {
			printFarm();
			System.out.println("===******* 고객 메뉴 *******===");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: buyFarm(); break;
			case 2: removeFarm(); break;
			case 3: printBuyFarm(); break;
			case 9: return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}while(true);
	}
	
	public void addNewKind() {
		System.out.println("1.과일 / 2.채소 / 3.견과");
		System.out.print("추가할 종류 번호 : ");
		int kind = Integer.parseInt(sc.nextLine());
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("수량 : ");
		int amount = Integer.parseInt(sc.nextLine());
		
		boolean check = false;
		
		switch(kind) {
		case 1:	check = fc.addNewKind(new Fruit("과일", name), amount); break;
		case 2: check = fc.addNewKind(new Vegetable("채소", name), amount); break;
		case 3: check = fc.addNewKind(new Nut("견과", name), amount); break;
		default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
		}
		
		if(check) {
			System.out.println("새 농산물이 추가되었습니다.");
		}else {
			System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
		};
	}
	
	public void removeKind() {
		System.out.println("1.과일 / 2.채소 / 3.견과");
		System.out.print("삭제할 종류 번호 : ");
		int kind = Integer.parseInt(sc.nextLine());
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		boolean check = false;
		
		switch(kind) {
		case 1:	check = fc.removeKind(new Fruit("과일", name)); break;
		case 2: check = fc.removeKind(new Vegetable("채소", name)); break;
		case 3: check = fc.removeKind(new Nut("견과", name)); break;
		default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
		}
		
		if(check) {
			System.out.println("농산물 삭제에 성공하였습니다!!");
		}else {
			System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
		};
	}
	
	public void changeAmount() {
		System.out.println("1.과일 / 2.채소 / 3.견과");
		System.out.print("수정할 종류 번호 : ");
		int kind = Integer.parseInt(sc.nextLine());
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("수정할 수량 : ");
		int amount = Integer.parseInt(sc.nextLine());
		
		boolean check = false;
		
		switch(kind) {
		case 1:	check = fc.changeAmount(new Fruit("과일", name), amount); break;
		case 2: check = fc.changeAmount(new Vegetable("채소", name), amount); break;
		case 3: check = fc.changeAmount(new Nut("견과", name), amount); break;
		default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
		}
		
		if(check) {
			System.out.println("농산물 수량이 수정되었습니다.");
		}else {
			System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
		};
	}
	
	public void printFarm() {
		// "종류 : 이름(n개)" 형식으로 나오는지 확인.
		Set<Farm> set = new HashSet<>(fc.printFarm().keySet());
		Iterator<Farm> it = set.iterator();
		while(it.hasNext()) {
			Farm next = it.next(); // 단방향 이므로 변수에 담아 사용.
			System.out.println(next + "(" +fc.printFarm().get(next) +"개)");
		}
	}
	
	public void buyFarm() {
		System.out.println("1.과일 / 2.채소 / 3.견과");
		System.out.print("구매 종류 번호 : ");
		int kind = Integer.parseInt(sc.nextLine());
		System.out.print("구매할 것 : ");
		String name = sc.nextLine();
		
		boolean check = false;
		
		switch(kind) {
		case 1:	check = fc.buyFarm(new Fruit("과일", name)); break;
		case 2: check = fc.buyFarm(new Vegetable("채소", name)); break;
		case 3: check = fc.buyFarm(new Nut("견과", name)); break;
		default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
		}
		
		if(check) {
			System.out.println("구매에 성공하였습니다!!");
		}else {
			System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
		};
	}
	
	public void removeFarm() {
		System.out.println("1.과일 / 2.채소 / 3.견과");
		System.out.print("취소 종류 번호 : ");
		int kind = Integer.parseInt(sc.nextLine());
		System.out.print("구매 취소할 것 : ");
		String name = sc.nextLine();
		
		boolean check = false;
		
		switch(kind) {
		case 1:	check = fc.removeFarm(new Fruit("과일", name)); break;
		case 2: check = fc.removeFarm(new Vegetable("채소", name)); break;
		case 3: check = fc.removeFarm(new Nut("견과", name)); break;
		default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
		}
		
		if(check) {
			System.out.println("구매 취소에 성공하였습니다.");
		}else {
			System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
		};
	}
	
	public void printBuyFarm() {
		Iterator<Farm> it = fc.printBuyFarm().iterator();
		while(it.hasNext()) {
			Farm next = it.next();
			System.out.println(next);
		}
	}
}

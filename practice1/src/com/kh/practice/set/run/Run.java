package com.kh.practice.set.run;

import com.kh.practice.set.view.LotteryMenu;

public class Run {

	public static void main(String[] args) {
		new LotteryMenu().mainMenu();
		
		// 반성정리.
		// LottertController 
		// 1. boolean 값으로 리턴 해주는 메소드 사용시 주의.
		// contain()으로 호출하게 되면 추가와 동시에 true false가 바뀌므로 이렇게 수정.
	
		// 2. 클래스 사용시 그 클래스의 특성 한번 더 생각하기. 
		// HashSet은 중복유지가 안되기 때문에 그냥 바로 넣어준다. 
		// 추첨자수가 당첨자수 보다 커야 되므로 작을경우 null에담아 리턴해주어
		// Menu에서 null일때 추첨자수가 적다고 프린트 해줌.
	}
}

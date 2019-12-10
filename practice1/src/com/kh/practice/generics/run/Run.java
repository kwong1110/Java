package com.kh.practice.generics.run;

import com.kh.practice.generics.view.FarmMenu;

public class Run {

	public static void main(String[] args) {
		new FarmMenu().mainMenu();
	}
}

	// 반성정리
	// model.vo
	// 1. 상속받은 자식 클래스에서 프린트 사항 꼭 넣어 줄것.
	// -> toString() : super.kind 추가.

	// view
	// 2. 변수에 담을 수 있는지 한번더 확인 하기.
	// -> boolean 값을 담아 줌으로 println 써주는 것을 줄일 수 있다.

	// 3. Iterator 사용시 next()는 변수에 담아 사용하자
	// -> 단방향이므로 변수에 담아 사용해야 하나도 빠짐 없이 출력됨.

package com.kh.practice.list.music.run;

import com.kh.practice.list.music.view.MusicView;

public class Run {

	public static void main(String[] args) {
		new MusicView().mainMenu();
	}
	
	// 반성정리.
	// 1. AscTitle - list.sort(new AscTitle());
	//		int형 정렬이 아니라 문자열/문자열 정렬이다 보니 해맴.
	//		결국 compareTo가 int를 반환하기 때문에 새로운 변수안에 담아주어
	//		같을때를 다시 반환해 주면 된다.
	
	// 2. MusicController
	//		값이 있거나, 없거나를 지정 할땐 else에 null을 넣는방식이 아닌.
	//		처음 시작값을 null로 해주고 담아준 객체/변수를 리턴할 것. 
	//		그래야 null 값일때 정상적으로 작동함.
	
	// 3.	각 메소드를 사용 할땐 반환값에 신경쓸 것.
	
	// 4. MusicView 
	//		반환 값이 있는 메소드를 사용할 경우 1번만 작성 할 것.
	
}

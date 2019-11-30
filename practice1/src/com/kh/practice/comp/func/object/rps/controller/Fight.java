package com.kh.practice.comp.func.object.rps.controller;

import com.kh.practice.comp.func.object.rps.rival.Computer;
import com.kh.practice.comp.func.object.rps.rival.User;

public class Fight {
	
	// 컴퓨터의 가위,바위,보를 랜덤메소드를 통해 생성 후 
	// 유저와의 대결.
	
	private User u = new User();
	private Computer c = new Computer();
	
	public void createComRps() {
		c.setComRps();
	}
	
	public String comRps() {
		return c.getComRps();
	}
	
//	public void reComRps() {
//		c.resetComRps();
//	}
	
	public String fightStart(String userRps) {
		if(!userRps.equals("가위") && !userRps.equals("바위") 
				&& !userRps.equals("보")){
			return "잘못 입력하셨습니다.";
		}else {
			if(userRps.equals(c.getComRps())) {
				u.setDraw(u.getDraw() + 1);
				return "비겼습니다.."; 
			} else if (c.getComRps().equals("가위") && userRps.equals("바위") ||
					c.getComRps().equals("바위") && userRps.equals("보") ||
					c.getComRps().equals("보") && userRps.equals("가위")) {
				u.setWin(u.getWin() + 1);
				return "이겼습니다!!";			
			} else {
				u.setLose(u.getLose() + 1);
				return "졌습니다 ㅠㅠ";
			}
		}
	}
	
	public String fightResult(String name) {
		// 조건문을 넣고 유저이름을 유저에 저장해준다면 
		// 컴퓨터와 유저중에 선택하게 해줄 수도 있음.
		return u.toString();
	}
}

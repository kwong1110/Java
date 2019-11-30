package com.kh.practice.comp.func.object.rps.controller;

import com.kh.practice.comp.func.object.rps.rival.Computer;
import com.kh.practice.comp.func.object.rps.rival.User;

public class Fight {
	
	// ��ǻ���� ����,����,���� �����޼ҵ带 ���� ���� �� 
	// �������� ���.
	
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
		if(!userRps.equals("����") && !userRps.equals("����") 
				&& !userRps.equals("��")){
			return "�߸� �Է��ϼ̽��ϴ�.";
		}else {
			if(userRps.equals(c.getComRps())) {
				u.setDraw(u.getDraw() + 1);
				return "�����ϴ�.."; 
			} else if (c.getComRps().equals("����") && userRps.equals("����") ||
					c.getComRps().equals("����") && userRps.equals("��") ||
					c.getComRps().equals("��") && userRps.equals("����")) {
				u.setWin(u.getWin() + 1);
				return "�̰���ϴ�!!";			
			} else {
				u.setLose(u.getLose() + 1);
				return "�����ϴ� �Ф�";
			}
		}
	}
	
	public String fightResult(String name) {
		// ���ǹ��� �ְ� �����̸��� ������ �������شٸ� 
		// ��ǻ�Ϳ� �����߿� �����ϰ� ���� ���� ����.
		return u.toString();
	}
}

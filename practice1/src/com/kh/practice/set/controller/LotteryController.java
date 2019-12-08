package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {

	private HashSet<Lottery> lottery = new HashSet<Lottery>();
	private HashSet<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		if(!lottery.contains(l)) {
			lottery.add(l);
			return false;
		} else {
			return true;
		}
		// contain���� ȣ���ϰ� �Ǹ� �߰��� ���ÿ� true false�� �ٲ�Ƿ� �̷��� ����.
	}
	
	public boolean deleteObject(Lottery l) {
		if(lottery.remove(l) && win != null) {
			return win.remove(l);
		} else {
			return false;
		}
	}
	
	public HashSet<Lottery> winObject() {
		int winner = 4;
		List<Lottery> list = new ArrayList<Lottery>();
		list.addAll(lottery);
		if(list.size() >= winner) {
			for(int i = 0; win.size() < winner; i++) { // ��÷�� �� ��ŭ for���� ������.
//				int random = (int)(Math.random() * list.size());
				win.add(list.get(i));				
			}
		} else {
			win = null; // 4���̻��� �ƴ϶�� null�� �������ֱ�����.
		}
		
		// HashSet�� �ߺ������� �ȵǱ� ������ �׳� �ٷ� �־��ش�. 
		// ��÷�ڼ��� ��÷�ڼ� ���� Ŀ�� �ǹǷ� ������� null����� �������־�
		// Menu���� null�϶� ��÷�ڼ��� ���ٰ� ����Ʈ ����.
		return win;
	}
	
	public TreeSet<Lottery> sortedWinObject() {
		TreeSet<Lottery> sorted = new TreeSet<Lottery>(new SortedLottery());
		if(winObject() != null) {
			sorted.addAll(win);
		} else {
			sorted = null;
		}
		return sorted;
	}
	
	public boolean searchWinner(Lottery l) {
		
		return win.contains(l);
	}
}

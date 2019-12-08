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
		// contain으로 호출하게 되면 추가와 동시에 true false가 바뀌므로 이렇게 수정.
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
			for(int i = 0; win.size() < winner; i++) { // 당첨자 수 만큼 for문을 돌린다.
//				int random = (int)(Math.random() * list.size());
				win.add(list.get(i));				
			}
		} else {
			win = null; // 4명이상이 아니라면 null을 리턴해주기위함.
		}
		
		// HashSet은 중복유지가 안되기 때문에 그냥 바로 넣어준다. 
		// 추첨자수가 당첨자수 보다 커야 되므로 작을경우 null에담아 리턴해주어
		// Menu에서 null일때 추첨자수가 적다고 프린트 해줌.
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

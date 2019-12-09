package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {

	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		} else {
			return false;
		}
	}
	
	public String login(String id, String password) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(password)){
				return map.get(id).getName();
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	
	// key : id / value : M(pw, name)
	// key : name / value : id
	public TreeMap sameName(String name) {
		
		TreeMap<String, String> tMap = new TreeMap<>();
		
		Set<String> set = map.keySet(); 
				
		for(String key : map.keySet()) {
//			System.out.println(map.get(key).getName().equals(name));
			if(map.get(key).getName().equals(name)) {
				tMap.put(key, name);
			}
		}
				
		return tMap;
		
		// iterator 실패.
//		Iterator<String> idIt = set.iterator();
//		if(map.containsValue(name)) {
//			 containsValue : value 부분이 m 객체로 되어있는데 하나도 포함되면 될까?
//			=> 안된다.
	
		// iterator 2개 생성...? 안된다.
		// -> null 담기는건 아니고 아예 값이 안담김.
//		if(map.containsValue(map.get(idIt.next()))) {
//			while(idIt.hasNext()) {
//				Iterator<String> idIt2 = set.iterator();	
//				tMap.put(name, idIt2.next());
//			}
//		} else {
//			tMap = null;
//		}
	}
}

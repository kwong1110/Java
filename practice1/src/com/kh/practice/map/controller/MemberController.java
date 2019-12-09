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
		
		// iterator ����.
//		Iterator<String> idIt = set.iterator();
//		if(map.containsValue(name)) {
//			 containsValue : value �κ��� m ��ü�� �Ǿ��ִµ� �ϳ��� ���ԵǸ� �ɱ�?
//			=> �ȵȴ�.
	
		// iterator 2�� ����...? �ȵȴ�.
		// -> null ���°� �ƴϰ� �ƿ� ���� �ȴ��.
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

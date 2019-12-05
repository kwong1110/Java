package com.kh.practice.list.music.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList<Music>();
	
	public int addList(Music music) {
		// 만약 추가되면 마지막에 추가되는 것이니까, 
		// 랭스-1 index가 music과 일치하다면 1, 그렇지않다면 0으로 해야 더 맞는거같은데... 
		list.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	
	public int printAll() {
		System.out.println(list.subList(0, list.size()));
		return 1;
	}
	
	public Music searchMusic(String title) {
		Music searchMusic = new Music();
		for(int i = 0; i < list.size(); i++) {
//			if(list.contains(new Music(title, list.get(i).getSinger()))) {
			if(list.get(i).getTitle().equals(title)){
				searchMusic = list.get(i);
				break;
			}else {
				searchMusic = null;
			}
		}
		// 만약 동일 곡이 여러개라면...?? 
		// 문제에 안써있으니 우선 이렇게 함.
		return searchMusic;
	}
		
	
	public Music removeMusic(String title) {
		// remove(int index) -> 반환 : E
		// remove(Object o) -> 반환 : boolean
		
		Music removeMusic = new Music();
		for(int i = 0; i < list.size(); i++) {
//			if(list.contains(new Music(title, list.get(i).getSinger()))) {
				
			if(list.get(i).getTitle().equals(title)){
				removeMusic = list.remove(i);
//				removeMusic = list.get(i);
//				list.remove(list.get(i));
				break;
			}else {
				removeMusic = null;
			}
		}
		return removeMusic;
	}
	
	public Music setMusic(String title, Music music) {
		if(list.contains(title)) {
			int index = list.indexOf(music);
			Music m = list.get(index);
			list.set(index, music);
			return m;
		} else {
			return null;
		}
	}
	
	public int ascTitle() {	
		list.sort(new AscTitle());  // 제목 같으면 가수 오름차순 정렬.
		return 1;
	}
	
	public int descSinger() {
		Collections.sort(list); // 가수 내림차순 정렬.
		return 1;
	}
	
}

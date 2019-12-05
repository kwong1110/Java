package com.kh.practice.list.music.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList<Music>();
	
	public int addList(Music music) {
		// ���� �߰��Ǹ� �������� �߰��Ǵ� ���̴ϱ�, 
		// ����-1 index�� music�� ��ġ�ϴٸ� 1, �׷����ʴٸ� 0���� �ؾ� �� �´°Ű�����... 
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
		// ���� ���� ���� ���������...?? 
		// ������ �Ƚ������� �켱 �̷��� ��.
		return searchMusic;
	}
		
	
	public Music removeMusic(String title) {
		// remove(int index) -> ��ȯ : E
		// remove(Object o) -> ��ȯ : boolean
		
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
		list.sort(new AscTitle());  // ���� ������ ���� �������� ����.
		return 1;
	}
	
	public int descSinger() {
		Collections.sort(list); // ���� �������� ����.
		return 1;
	}
	
}

package com.daily_life.dao;

import java.util.ArrayList;

import com.daily_life.model.HBVO;

public interface IHBDAO {
	void HBCreate(HBVO vo); 			// 등록
	void HBUpdate(HBVO vo); 			// 수정
	void HBDelete(int hbNo); 			// 삭제
	ArrayList <HBVO> HBList();			// 목록
	HBVO HBDetail (int hbNo);		// 상세정보
	ArrayList <HBVO> HBOpen(int hbNo);	// 개봉
	
}

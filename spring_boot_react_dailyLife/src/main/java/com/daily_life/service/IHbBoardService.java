package com.daily_life.service;

import java.util.ArrayList;

import com.daily_life.model.HbBoardVO;

public interface IHbBoardService {
	void hbBoardInsert(HbBoardVO vo); // 등록
	void hbBoardDelete(int hb_bNo); // 삭제
	ArrayList<HbBoardVO> hbBoardList(); // 전체 목록 조회
	HbBoardVO hbBoardDetail(int hb_bNo); // 상세 조회
}

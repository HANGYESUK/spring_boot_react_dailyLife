package com.daily_life.dao;

import java.util.ArrayList;

import com.daily_life.model.BoardVO;
import com.daily_life.model.HbBoardVO;

public interface IHbBoardDAO {
	void hbBoardInsert(HbBoardVO vo); // 등록
	ArrayList<HbBoardVO> hbBoardList(); // 전체 목록 조회
	HbBoardVO hbBoardDetail(int hb_bNo); // 상세 조회
}

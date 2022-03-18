package com.daily_life.service;

import java.util.ArrayList;

import com.daily_life.model.BoardVO;

public interface IBoardService {
	void boardInsert(BoardVO vo); // 등록
	void boardUpdate(BoardVO vo); // 수정
	void boardDelete(int bNo); // 삭제
	ArrayList<BoardVO> boardList(); // 전체 목록 조회
	BoardVO boardDetail(int bNo); // 상세 조회
}

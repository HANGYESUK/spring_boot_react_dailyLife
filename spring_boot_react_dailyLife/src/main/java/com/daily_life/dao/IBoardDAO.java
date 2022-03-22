package com.daily_life.dao;

import java.util.ArrayList;

import com.daily_life.model.BoardVO;

public interface IBoardDAO {
	void boardInsert(BoardVO vo); // 등록
	void boardUpdate(BoardVO vo); // 수정
	void boardDelete(int bNo); // 삭제
	ArrayList<BoardVO> boardList(); // 전체 목록 조회
	BoardVO boardDetail(int bNo); // 상세 조회
	
	String boardMemberNick(String memEmail);// 작성자 닉네임 불러오기
	String boardFeelType(int feelNo);// 기분 타입명 불러오기 ( 기쁨, 행복 ... )
	// 기분 이미지 불러오기
}

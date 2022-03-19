package com.daily_life.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.daily_life.dao.IBoardDAO;
import com.daily_life.model.BoardVO;

@Service
public class BoardService implements IBoardService {
	@Autowired
	@Qualifier("IBoardDAO")
	IBoardDAO dao;
	
	@Override
	public void boardInsert(BoardVO vo) {
		dao.boardInsert(vo);
	}

	@Override
	public void boardUpdate(BoardVO vo) {
		dao.boardUpdate(vo);
	}

	@Override
	public void boardDelete(int bNo) {
		dao.boardDelete(bNo);
	}

	@Override
	public ArrayList<BoardVO> boardList() {
		return dao.boardList();
	}

	@Override
	public BoardVO boardDetail(int bNo) {
		return dao.boardDetail(bNo);
	}
	
	@Override
	public String boardMemberNick(String memEmail) {
		return dao.boardMemberNick(memEmail);
	}
	
	@Override
	public String boardFeelType(int feelNo) {
		return dao.boardFeelType(feelNo);
	}

}

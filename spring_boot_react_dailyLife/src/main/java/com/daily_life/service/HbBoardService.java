package com.daily_life.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.daily_life.dao.IHbBoardDAO;
import com.daily_life.model.HbBoardVO;

@Service
public class HbBoardService implements IHbBoardService {
	@Autowired
	@Qualifier("IHbBoardDAO")
	IHbBoardDAO dao;
	
	@Override
	public void hbBoardInsert(HbBoardVO vo) {
		dao.hbBoardInsert(vo);
	}

	@Override
	public void hbBoardDelete(int hb_bNo) {
		dao.hbBoardDelete(hb_bNo);
	}

	@Override
	public ArrayList<HbBoardVO> hbBoardList() {
		return dao.hbBoardList();
	}

	@Override
	public HbBoardVO hbBoardDetail(int hb_bNo) {
		return dao.hbBoardDetail(hb_bNo);
	}

}

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
	public ArrayList<HbBoardVO> hbBoardList(int hbNo) {
		return dao.hbBoardList(hbNo);
	}

	@Override
	public HbBoardVO hbBoardDetail(int hb_bNo) {
		return dao.hbBoardDetail(hb_bNo);
	}
	
	@Override
	public String hbBoardHbName(int hbNo) {
		return dao.hbBoardHbName(hbNo);
	}

}

package com.daily_life.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.daily_life.dao.IHBDAO;
import com.daily_life.model.HBVO;

@Service
public class HBService implements IHBService {

	@Autowired
	@Qualifier("IHBDAO")
	IHBDAO dao;

	@Override
	public void HBCreate(HBVO vo) {
		dao.HBCreate(vo);
	}

	@Override
	public void HBUpdate(HBVO vo) {
		dao.HBUpdate(vo);
	}

	@Override
	public void HBDelete(int hbNo) {
		dao.HBDelete(hbNo);
	}

	@Override
	public ArrayList<HBVO> HBList() {
		return dao.HBList();
	}

	@Override
	public ArrayList<HBVO> HBOpen(int hbNo) {
		return dao.HBOpen(hbNo);
	}

}

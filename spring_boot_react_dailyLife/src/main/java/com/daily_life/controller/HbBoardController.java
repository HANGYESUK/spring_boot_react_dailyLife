package com.daily_life.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daily_life.model.HbBoardVO;
import com.daily_life.service.HbBoardService;


public class HbBoardController {
	@Autowired
	HbBoardService service;
	
	// 등록
	@RequestMapping("/hbBoardInsert")
	public void hbBoardInsert(HbBoardVO vo) { // HttpSession session 
		// String memEmail = (String)session.getAttribute("sid"); // session 받아오기
		service.hbBoardInsert(vo);
	}

	// 삭제
	@RequestMapping(value="/hbBoardDelete/{hb_bNo}")
	public void hbBoardDelete(@PathVariable int hb_bNo) {	
		service.hbBoardDelete(hb_bNo);		
	}
	
	// 전체 목록 조회
	@RequestMapping("/hbBoardList")
	public HashMap<String, Object> hbBoardList() {	
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("hbBoardList",  service.hbBoardList());	
		return map; // hbBoardList
	}
	
	// ArrayList 사용 시
//	@RequestMapping("/hbBoardList")
//	public ArrayList<HbBoardVO> hbBoardList() {	
//		ArrayList<HbBoardVO> hbBoardList = service.hbBoardList();	
//		return hbBoardList; // hbBoardList
//	}
	
	// 상세 조회
	@RequestMapping("/hbBoardDetail/{hb_bNo}")
	public HbBoardVO hbBoardDetail(@PathVariable  int hb_bNo) {		
		return service.hbBoardDetail(hb_bNo); 
	}
}

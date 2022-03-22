package com.daily_life.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daily_life.model.HbBoardVO;
import com.daily_life.service.BoardService;
import com.daily_life.service.HbBoardService;

@CrossOrigin("*")
@RestController
public class HbBoardController {
	@Autowired
	HbBoardService hbBoardService;
	
	@Autowired
	BoardService boardService;
	
	// 등록
	@RequestMapping("/hbBoardInsert")
	public void hbBoardInsert(HbBoardVO vo) { // HttpSession session 
		// String memEmail = (String)session.getAttribute("sid"); // session 받아오기
		hbBoardService.hbBoardInsert(vo);
	}
	
	// 전체 목록 조회
	@RequestMapping("/hbBoardList")
	public HashMap<String, Object> hbBoardList() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("hbBoardList", hbBoardService.hbBoardList());
		
		// System.out.println("map : " + map);
		// System.out.println("타입 : " + map.get("hbBoardList").getClass().getName());
		ArrayList<HbBoardVO> vo = (ArrayList<HbBoardVO>) map.get("hbBoardList");
		// System.out.println(vo.get(0).getHb_bTitle());

		for (int i=0; i<vo.size(); i++) {
			// 작성자 닉네임 불러오기
			String memEmail = vo.get(i).getMemEmail();
			vo.get(i).setMemNick(boardService.boardMemberNick(memEmail));
			// System.out.println(vo.get(i).getMemNick());
			
			// 기분 타입명 불러오기 ( 기쁨, 행복 ... )
			int feelNo = vo.get(i).getFeelNo();
			vo.get(i).setFeelType(boardService.boardFeelType(feelNo));
			// System.out.println(vo.get(i).getFeelType());
			
			// 기분 이미지 불러오기 ( 이미지 파일명 )
			vo.get(i).setFeelIcon(boardService.boardFeelIcon(feelNo));
			// System.out.println(vo.get(i).getFeelIcon());
			
			// 행복저금통 이름 불러오기
			int hbNo = vo.get(i).getHbNo();
			vo.get(i).setHbName(hbBoardService.hbBoardHbName(hbNo));
			// System.out.println(vo.get(i).getHbName());

		}
		
		map.put("hbBoardList", vo);
		return map; // hbBoardList
	}
	
	// ArrayList 사용 시
//	@RequestMapping("/hbBoardList")
//	public ArrayList<HbBoardVO> hbBoardList() {	
//		ArrayList<HbBoardVO> hbBoardList = hbBoardService.hbBoardList();	
//		return hbBoardList; // hbBoardList
//	}
	
	// 상세 조회
	@RequestMapping("/hbBoardDetail/{hb_bNo}")
	public HbBoardVO hbBoardDetail(@PathVariable  int hb_bNo) {
		HbBoardVO vo = hbBoardService.hbBoardDetail(hb_bNo);
		
		// 작성자 닉네임 불러오기
		String memNick = boardService.boardMemberNick(vo.getMemEmail());
		vo.setMemNick(memNick);
		 
		// 기분 타입명 불러오기 ( 기쁨, 행복 ... )
		String feelType = boardService.boardFeelType(vo.getFeelNo());
		vo.setFeelType(feelType);
		
		// 기분 이미지 불러오기 ( 이미지 파일명 )
		String feelIcon = boardService.boardFeelIcon(vo.getFeelNo());
		vo.setFeelIcon(feelIcon);
		
		// 행복저금통 이름 불러오기
		String hbName = hbBoardService.hbBoardHbName(vo.getHbNo());
		vo.setHbName(hbName);
		return vo; 
	}
}

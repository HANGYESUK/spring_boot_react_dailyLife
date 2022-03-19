package com.daily_life.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daily_life.model.BoardVO;
import com.daily_life.service.BoardService;

@CrossOrigin("*")
@RestController
public class BoardController {
	@Autowired
	BoardService service;
	
	// 등록
	@RequestMapping("/boardInsert")
	public void boardInsert(BoardVO vo) { // HttpSession session 
		// String memEmail = (String)session.getAttribute("sid"); // session 받아오기
		service.boardInsert(vo);
	}
	
	// 수정
	@RequestMapping(value="/boardUpdate")
	public void boardUpdate(BoardVO vo) {		
		service.boardUpdate(vo);	 
	}

	// 삭제
	@RequestMapping(value="/boardDelete/{bNo}")
	public void  boardDelete(@PathVariable int bNo) {	
		service.boardDelete(bNo);		
	}
	
	// 전체 목록 조회
	@RequestMapping("/boardList")
	public HashMap<String, Object> boardList() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("boardList", service.boardList());
		
		// System.out.println("map : " + map);
		// System.out.println("타입 : " + map.get("boardList").getClass().getName());
		ArrayList<BoardVO> vo = (ArrayList<BoardVO>) map.get("boardList");
		// System.out.println(vo.get(0).getbTitle());

		for (int i=0; i<vo.size(); i++) {
			// 작성자 닉네임 불러오기
			String memEmail = vo.get(i).getMemEmail();
			vo.get(i).setMemNick(service.boardMemberNick(memEmail));
			// System.out.println(vo.get(i).getMemNick());
			
			// 기분 타입명 불러오기 ( 기쁨, 행복 ... )
			int feelNo = vo.get(i).getFeelNo();
			vo.get(i).setFeelType(service.boardFeelType(feelNo));
			// System.out.println(vo.get(i).getFeelType());
		}
		
		map.put("boardList", vo);
		return map; // boardList
	}
	
	// ArrayList 사용 시 => 리액트도 수정 필요
//	@RequestMapping("/boardList")
//	public ArrayList<BoardVO> boardList() {	
//		ArrayList<BoardVO> boardList = service.boardList();
//		
//		for (int i=0; i<boardList.size(); i++) {
//			// 작성자 닉네임 불러오기
//			String memEmail = boardList.get(i).getMemEmail();
//			boardList.get(i).setMemNick(service.boardMemberNick(memEmail));
//			// System.out.println(boardList.get(i).getMemNick());
//			
//			// 기분 타입명 불러오기 ( 기쁨, 행복 ... )
//			int feelNo = boardList.get(i).getFeelNo();
//			boardList.get(i).setFeelType(service.boardFeelType(feelNo));
//			// System.out.println(boardList.get(i).getFeelType());
//		}
//		return boardList; // boardList
//	}
	
	// 상세 조회
	@RequestMapping("/boardDetail/{bNo}")
	public BoardVO boardDetail(@PathVariable int bNo) {		
		BoardVO vo = service.boardDetail(bNo);
		
		// 작성자 닉네임 불러오기
		String memNick = service.boardMemberNick(vo.getMemEmail());
		vo.setMemNick(memNick);
		 
		// 기분 타입명 불러오기 ( 기쁨, 행복 ... )
		String feelType = service.boardFeelType(vo.getFeelNo());
		vo.setFeelType(feelType);
		return vo;
	}
}

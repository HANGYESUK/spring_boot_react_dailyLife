package com.daily_life.controller;

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
		map.put("boardList",  service.boardList());	
		return map; // boardList
	}
	
	// ArrayList 사용 시
//	@RequestMapping("/boardList")
//	public ArrayList<BoardVO> boardList() {	
//		ArrayList<BoardVO> boardList = service.boardList();	
//		return boardList; // boardList
//	}
	
	// 상세 조회
	@RequestMapping("/boardDetail/{bNo}")
	public BoardVO boardDetail(@PathVariable  int bNo) {		
		return service.boardDetail(bNo);
	}
}

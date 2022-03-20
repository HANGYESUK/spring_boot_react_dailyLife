package com.daily_life.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daily_life.model.HBVO;
import com.daily_life.service.HBService;

@CrossOrigin("*")
@RestController
public class HBController {
	
	@Autowired
	HBService service;	// 서비스 연결
	
	// 저금통 생성
	@RequestMapping("/HBCreate")
	public void HBCreate(HBVO vo) {
		service.HBCreate(vo);
	}
	// 저금통 수정
	@RequestMapping(value="/HBUpdate")
	public void HBUpdate(HBVO vo) {
		service.HBUpdate(vo);
	}
	// 저금통 삭제
	@RequestMapping(value="/HBDelete/{hbNo}")
	public void HBDelete(@PathVariable int hbNo) {
		service.HBDelete(hbNo);
	}
	// 저금통 목록
	@RequestMapping("/HBList")
	public HashMap<String, Object> HBList() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("HBList", service.HBList());
		return map;
	}
	// 저금통 오픈
	@RequestMapping("/HBOpen")
	public void HBOpen(@PathVariable int hbNo) {
		service.HBOpen(hbNo);
	}

	
}

package com.daily_life.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daily_life.model.MemberVO;
import com.daily_life.service.MemberService;


@CrossOrigin("*")
@RestController
public class MemberController {
	@Autowired
	MemberService service;
	
	//로그인 처리
	@RequestMapping("/login")
	public MemberVO loginCheck(@RequestParam HashMap<String, Object> param) {
		MemberVO vo = service.loginCheck(param);
		
		return vo;
	}
	
	//이메일 중복확인
	@RequestMapping("/memEmailCheck")
	public String memEmailCheck(
				@RequestParam("memEmail") String memEmail) {
				
		String result = "use";
		if(memEmail != null)
			result = "no_use";
		
		return result;
	}
	
	// 회원가입
	@RequestMapping("/userJoin")
	public void userJoin(MemberVO vo) {
		service.memberJoin(vo);
	}
	
	
}

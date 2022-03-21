package com.daily_life.dao;

import java.util.HashMap;

import com.daily_life.model.MemberVO;

public interface IMemberDAO {

	MemberVO loginCheck(HashMap<String, Object> map);	//로그인체크
	String memEmailCheck(String email); //가입시 이메일 중복확인
	MemberVO detailMemberView(String memEmail);	//마이페이지 상세정보
	void updateMember(MemberVO vo);	// 회원정보수정
	void deletevMember(String memEmail); //회원정보삭제
	void memberJoin(MemberVO vo); // 회원가입
	
}

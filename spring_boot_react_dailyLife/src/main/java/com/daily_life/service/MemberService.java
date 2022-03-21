package com.daily_life.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.daily_life.dao.IMemberDAO;
import com.daily_life.model.MemberVO;

@Service
public class MemberService implements IMemberService {
	@Autowired
	@Qualifier("IMemberDAO")
	IMemberDAO dao;
	
	@Override
	public MemberVO loginCheck(HashMap<String, Object> map) {
		return dao.loginCheck(map);
	}

	@Override
	public String memEmailCheck(String email) {
		return dao.memEmailCheck(email);
	}

	@Override
	public MemberVO detailMemberView(String memEmail) {
		return dao.detailMemberView(memEmail);
	}

	@Override
	public void updateMember(MemberVO vo) {
		dao.updateMember(vo);
	}

	@Override
	public void deletevMember(String memEmail) {
		dao.deletevMember(memEmail);
	}

	@Override
	public void memberJoin(MemberVO vo) {
		dao.memberJoin(vo);
	}

}

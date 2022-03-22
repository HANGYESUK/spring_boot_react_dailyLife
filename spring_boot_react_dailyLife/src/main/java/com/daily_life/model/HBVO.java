package com.daily_life.model;

public class HBVO {
	private int hbNo;			// 행복저금통 번호
	private String hbName;		// 행복저금통 이름
	private String hbStartDate;	// 행복저금통 시작 날짜
	private	String hbEndDate;	// 행복저금통 종료 날짜
	private String memEmail; 	// 회원 이메일 (외래키)
	
	// 행복저금통 번호
	public int getHbNo() {
		return hbNo;
	}
	public void setHbNo(int hbNo) {
		this.hbNo = hbNo;
	}
	// 행복저금통 이름
	public String getHbName() {
		return hbName;
	}
	public void setHbName(String hbName) {
		this.hbName = hbName;
	}
	// 행복저금통 시작 날짜
	public String getHbStartDate() {
		return hbStartDate;
	}
	public void setHbStartDate(String hbStartDate) {
		this.hbStartDate = hbStartDate;
	}
	// 행복저금통 종료 날짜
	public String getHbEndDate() {
		return hbEndDate;
	}
	public void setHbEndDate(String hbEndDate) {
		this.hbEndDate = hbEndDate;
	}
	// 회원 이메일 (외래키)
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
}

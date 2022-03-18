package com.daily_life.model;

public class BoardVO {
	private int bNo;
	private String memEmail;
	private String bTitle;
	private String bContent;
	private String bWriteDate;
	private int feelNo;
	
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbWriteDate() {
		return bWriteDate;
	}
	public void setbWriteDate(String bWriteDate) {
		this.bWriteDate = bWriteDate;
	}
	public int getFeelNo() {
		return feelNo;
	}
	public void setFeelNo(int feelNo) {
		this.feelNo = feelNo;
	}
}

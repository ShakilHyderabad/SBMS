package com.nt.dto;

public class StateDto {
	private int sid;
	private String sname;
	public StateDto() {
		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "StateDto [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	
	

}

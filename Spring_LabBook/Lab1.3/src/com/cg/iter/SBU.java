package com.cg.iter;

public class SBU {
	 private String sbuCode;
	   private String sbuName ;
	   private String sbuHead ;
	   
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SBU(String sbuCode, String sbuName, String sbuHead) {
		super();
		this.sbuCode = sbuCode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "[sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	   
	   
}

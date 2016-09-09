package com.yc.vote.entity;

import java.util.List;

public class AddSubjectBean {
	private int vsId;
	private String vsTitle;
	private int vsType;
	private List<String> options;
	public int getVsId() {
		return vsId;
	}
	public void setVsId(int vsId) {
		this.vsId = vsId;
	}
	public String getVsTitle() {
		return vsTitle;
	}
	public void setVsTitle(String vsTitle) {
		this.vsTitle = vsTitle;
	}
	public int getVsType() {
		return vsType;
	}
	public void setVsType(int vsType) {
		this.vsType = vsType;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "AddSubjectBean [vsId=" + vsId + ", vsTitle=" + vsTitle
				+ ", vsType=" + vsType + ", options=" + options + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}

package com.yc.vote.entity;

public class VoteSubject {
    private int vsId;

    private String vsTitle;

    private Integer vsType;

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

	public Integer getVsType() {
		return vsType;
	}

	public void setVsType(Integer vsType) {
		this.vsType = vsType;
	}

	@Override
	public String toString() {
		return "VoteSubject [vsId=" + vsId + ", vsTitle=" + vsTitle
				+ ", vsType=" + vsType + "]";
	}

	



    
}
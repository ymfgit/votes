package com.yc.vote.entity;

import java.io.Serializable;
import java.util.List;

public class VoteBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private int vsId;
	private String vsTitle;
	private int vsType;
	private int optionCount;
	private List<VoteOption> options;
	private int voteUserCount;
	
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
	public int getOptionCount() {
		return optionCount;
	}
	public void setOptionCount(int optionCount) {
		this.optionCount = optionCount;
	}
	public List<VoteOption> getOptions() {
		return options;
	}
	public void setOptions(List<VoteOption> options) {
		this.options = options;
	}
	public int getVoteUserCount() {
		return voteUserCount;
	}
	public void setVoteUserCount(int voteUserCount) {
		this.voteUserCount = voteUserCount;
	}
	
	public int getVsType() {
		return vsType;
	}
	public void setVsType(int vsType) {
		this.vsType = vsType;
	}
	@Override
	public String toString() {
		return "VoteBean [vsId=" + vsId + ", vsTitle=" + vsTitle + ", vsType="
				+ vsType + ", optionCount=" + optionCount + ", options="
				+ options + ", voteUserCount=" + voteUserCount + "]";
	}

	
	
	
	
}

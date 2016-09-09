package com.yc.vote.entity;

import java.io.Serializable;
import java.util.List;

public class OptionBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String vsTitle;
	private int optionCount;
	private List<Integer> voteOptionCount;
	private int voteUserCount;
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
	public List<Integer> getVoteOptionCount() {
		return voteOptionCount;
	}
	public void setVoteOptionCount(List<Integer> voteOptionCount) {
		this.voteOptionCount = voteOptionCount;
	}
	public int getVoteUserCount() {
		return voteUserCount;
	}
	public void setVoteUserCount(int voteUserCount) {
		this.voteUserCount = voteUserCount;
	}
	@Override
	public String toString() {
		return "OptionBean [vsTitle=" + vsTitle + ", optionCount="
				+ optionCount + ", voteOptionCount=" + voteOptionCount
				+ ", voteUserCount=" + voteUserCount + "]";
	}

	

}

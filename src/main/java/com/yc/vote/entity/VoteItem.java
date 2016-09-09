package com.yc.vote.entity;

public class VoteItem {
	private int viid;

	private int vopid;

	private int vsId;

	private int vuId;

	public int getViid() {
		return viid;
	}

	public void setViid(int viid) {
		this.viid = viid;
	}

	public int getVopid() {
		return vopid;
	}

	public void setVopid(int vopid) {
		this.vopid = vopid;
	}

	public int getVsId() {
		return vsId;
	}

	public void setVsId(int vsId) {
		this.vsId = vsId;
	}

	public int getVuId() {
		return vuId;
	}

	public void setVuId(int vuId) {
		this.vuId = vuId;
	}

	@Override
	public String toString() {
		return "VoteItem [viid=" + viid + ", vopid=" + vopid + ", vsId=" + vsId
				+ ", vuId=" + vuId + "]";
	}

}
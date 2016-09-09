package com.yc.vote.entity;

public class VoteUser {
	private int vuId;

	private String vuusername;

	private String vupassword;

	private int vustatus;

	private int vuversion;

	public int getVuId() {
		return vuId;
	}

	public void setVuId(int vuId) {
		this.vuId = vuId;
	}

	public String getVuusername() {
		return vuusername;
	}

	public void setVuusername(String vuusername) {
		this.vuusername = vuusername;
	}

	public String getVupassword() {
		return vupassword;
	}

	public void setVupassword(String vupassword) {
		this.vupassword = vupassword;
	}

	public int getVustatus() {
		return vustatus;
	}

	public void setVustatus(int vustatus) {
		this.vustatus = vustatus;
	}

	public int getVuversion() {
		return vuversion;
	}

	public void setVuversion(int vuversion) {
		this.vuversion = vuversion;
	}

	@Override
	public String toString() {
		return "\nVoteUser [vuId=" + vuId + ", vuusername=" + vuusername
				+ ", vupassword=" + vupassword + ", vustatus=" + vustatus
				+ ", vuversion=" + vuversion + "]";
	}

	public VoteUser(int vuId, String vuusername, String vupassword,
			int vustatus, int vuversion) {
		super();
		this.vuId = vuId;
		this.vuusername = vuusername;
		this.vupassword = vupassword;
		this.vustatus = vustatus;
		this.vuversion = vuversion;
	}

	public VoteUser() {
		super();
	}

}
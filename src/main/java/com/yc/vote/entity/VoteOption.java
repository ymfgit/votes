package com.yc.vote.entity;

import java.io.Serializable;

public class VoteOption implements Serializable{
	private static final long serialVersionUID = 1L;

	private int vopid;

    private String vooption;

    private int vsid;

    private int voorder;

	
	public int getVopid() {
        return vopid;
    }

    public void setVopid(int vopid) {
        this.vopid = vopid;
    }

    public String getVooption() {
        return vooption;
    }

    public void setVooption(String vooption) {
        this.vooption = vooption == null ? null : vooption.trim();
    }

    public int getVsid() {
        return vsid;
    }

    public void setVsid(int vsid) {
        this.vsid = vsid;
    }

    public int getVoorder() {
        return voorder;
    }

    public void setVoorder(int voorder) {
        this.voorder = voorder;
    }

	@Override
	public String toString() {
		return "\nVoteOption [vopid=" + vopid + ", vooption=" + vooption
				+ ", vsid=" + vsid + ", voorder=" + voorder + "]";
	}
    
	public VoteOption(String vooption, int vsid, int voorder) {
		super();
		this.vooption = vooption;
		this.vsid = vsid;
		this.voorder = voorder;
	}

	public VoteOption() {
		super();
	}
	
	

    
}
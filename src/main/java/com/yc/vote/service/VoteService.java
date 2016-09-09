package com.yc.vote.service;

import java.util.List;

import com.yc.vote.entity.OptionBean;
import com.yc.vote.entity.SubjectBeans;
import com.yc.vote.entity.VoteBean;
import com.yc.vote.entity.VoteItem;
import com.yc.vote.entity.VoteSubject;

public interface VoteService {
	List<VoteSubject> findAllSubject();
	List<SubjectBeans> findAllSubjectBeans();
	OptionBean findOptionsByVsId(int vsId);
	VoteBean findVoteBeansByVsId(int vsId);
	
	public boolean saveVote(VoteItem voteItem);
	boolean saveVote(VoteItem voteItem, String[] vopid);
}

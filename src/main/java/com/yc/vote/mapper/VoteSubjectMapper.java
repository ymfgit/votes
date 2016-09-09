package com.yc.vote.mapper;

import java.util.List;
import java.util.Map;

import com.yc.vote.entity.AddSubjectBean;
import com.yc.vote.entity.OptionBean;
import com.yc.vote.entity.SubjectBeans;
import com.yc.vote.entity.VoteBean;
import com.yc.vote.entity.VoteItem;
import com.yc.vote.entity.VoteOption;
import com.yc.vote.entity.VoteSubject;

public interface VoteSubjectMapper {
	List<VoteSubject> findAllSubject();
	
	List<SubjectBeans> findAllSubjectBeans();

	OptionBean findOptionsByVsId(int vsId);

	VoteBean findVoteBeansByVsId(int vsId);

	void insertItem(VoteItem voteItem);

	void insertSubject(AddSubjectBean addSubjectBean);

	void insertOption(VoteOption option);
	
	List<VoteSubject> findSubjectByName(Map<String,String> map);

	int updateSubject(Map<String, Object> map);

	int updateOption(Map<String, Object> map1);

	int deleteOptionByVsid(int vsId);
	

}
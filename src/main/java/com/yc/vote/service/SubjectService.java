package com.yc.vote.service;

import java.util.List;
import java.util.Map;

import com.yc.vote.entity.AddSubjectBean;
import com.yc.vote.entity.VoteOption;
import com.yc.vote.entity.VoteSubject;

public interface SubjectService {

	public AddSubjectBean addSubject(AddSubjectBean addSubjectBean);
	void add(AddSubjectBean addSubjectBean);
	void addOption(VoteOption option);
	
	public List<VoteSubject> findSubjectByName(Map<String, String> map);
	public int updateSubject(Map<String, Object> map);
	public int updateOption(Map<String, Object> map1);
	public int deleteOptionByVsid(int vsId);
	
	
	
	
}

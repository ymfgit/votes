package com.yc.vote.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.vote.entity.AddSubjectBean;
import com.yc.vote.entity.VoteOption;
import com.yc.vote.entity.VoteSubject;
import com.yc.vote.mapper.VoteSubjectMapper;
import com.yc.vote.service.SubjectService;

@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	private VoteSubjectMapper voteSubjectMapper;
	
	//是为了获取AddSubjectBean里面的vsid值,使下面的option可以按照id插入值
	@Override
	public AddSubjectBean addSubject(AddSubjectBean addSubjectBean) {
		voteSubjectMapper.insertSubject(addSubjectBean);
		return addSubjectBean;
	}

	@Override
	public void add(AddSubjectBean addSubjectBean) {
		//1.插入subject
		addSubjectBean =addSubject(addSubjectBean);
		
		//2.插入所有的option
		List<String> options=addSubjectBean.getOptions();
		for (int i = 0; i < options.size(); i++) {
			VoteOption option=new VoteOption(options.get(i),addSubjectBean.getVsId(),i+1);
			addOption(option);
		}
	}

	@Override
	public void addOption(VoteOption option) {
		voteSubjectMapper.insertOption(option);
	}

	@Override
	public List<VoteSubject> findSubjectByName(Map<String, String> map) {
		return voteSubjectMapper.findSubjectByName(map);
	}

	@Override
	public int updateSubject(Map<String, Object> map) {
		return voteSubjectMapper.updateSubject(map);
	}

	@Override
	public int updateOption(Map<String, Object> map1) {
		return voteSubjectMapper.updateOption(map1);
	}

	@Override
	public int deleteOptionByVsid(int vsId) {
		return voteSubjectMapper.deleteOptionByVsid(vsId);
	}



	
	

}

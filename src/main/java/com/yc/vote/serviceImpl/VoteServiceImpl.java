package com.yc.vote.serviceImpl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yc.vote.entity.OptionBean;
import com.yc.vote.entity.SubjectBeans;
import com.yc.vote.entity.VoteBean;
import com.yc.vote.entity.VoteItem;
import com.yc.vote.entity.VoteSubject;
import com.yc.vote.mapper.VoteSubjectMapper;
import com.yc.vote.service.VoteService;



@Transactional
@Service("voteService")
public class VoteServiceImpl implements VoteService {
	@Autowired
	private  VoteSubjectMapper voteSubjectMapper;
	@Override
	public List<VoteSubject> findAllSubject() {
		return voteSubjectMapper.findAllSubject();
	}
	@Override
	public List<SubjectBeans> findAllSubjectBeans() {
		return voteSubjectMapper.findAllSubjectBeans();
	}
	@Override
	public OptionBean findOptionsByVsId(int vsId) {
		return voteSubjectMapper.findOptionsByVsId(vsId);
	}
	@Override
	public VoteBean findVoteBeansByVsId(int vsId) {
		return voteSubjectMapper.findVoteBeansByVsId(vsId);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public boolean saveVote(VoteItem voteItem) {
		try {
			voteSubjectMapper.insertItem(voteItem);
			return true;
		} catch (Exception e) {
			throw new RuntimeException("投票失败!!!!",e);
			
		}
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public boolean saveVote(VoteItem voteItem, String[] vopid) {
		boolean flag=true;
		if(vopid.length>1){
			for (String v : vopid) {
				voteItem.setVopid(Integer.parseInt(v));
				if(!saveVote(voteItem)){
					return false;
				}
				return true;
			}
		}
		return saveVote(voteItem);
	}

}

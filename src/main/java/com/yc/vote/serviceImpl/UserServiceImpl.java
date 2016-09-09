package com.yc.vote.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.vote.entity.VoteUser;
import com.yc.vote.mapper.VoteUserMapper;
import com.yc.vote.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private VoteUserMapper voteUserMapper;

	@Override
	public VoteUser login(VoteUser user) {
		return voteUserMapper.getUser(user);
	}

	@Override
	public int register(VoteUser user) {
		
		return voteUserMapper.register(user);
	}

}

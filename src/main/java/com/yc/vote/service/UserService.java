package com.yc.vote.service;

import com.yc.vote.entity.VoteUser;

public interface UserService {

	VoteUser login(VoteUser user);

	int register(VoteUser user);
	
}

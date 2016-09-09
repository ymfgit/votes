package com.yc.vote.mapper;

import com.yc.vote.entity.VoteUser;

public interface VoteUserMapper {
	VoteUser getUser(VoteUser user);

	int register(VoteUser user);
}
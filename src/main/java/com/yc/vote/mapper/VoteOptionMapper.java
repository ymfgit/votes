package com.yc.vote.mapper;

import com.yc.vote.entity.VoteOption;

public interface VoteOptionMapper {
    int deleteByPrimaryKey(Long vopid);

    int insert(VoteOption record);

    int insertSelective(VoteOption record);

    VoteOption selectByPrimaryKey(Long vopid);

    int updateByPrimaryKeySelective(VoteOption record);

    int updateByPrimaryKey(VoteOption record);
}
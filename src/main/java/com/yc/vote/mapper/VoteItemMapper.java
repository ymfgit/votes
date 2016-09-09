package com.yc.vote.mapper;

import com.yc.vote.entity.VoteItem;

public interface VoteItemMapper {
    int deleteByPrimaryKey(Long viid);

    int insert(VoteItem record);

    int insertSelective(VoteItem record);

    VoteItem selectByPrimaryKey(Long viid);

    int updateByPrimaryKeySelective(VoteItem record);

    int updateByPrimaryKey(VoteItem record);
}
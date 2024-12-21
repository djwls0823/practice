package com.green.practice.feed;

import com.green.practice.feed.model.FeedPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeedMapper {
    int insFeed(FeedPostReq p);
}

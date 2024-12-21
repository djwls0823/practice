package com.green.practice.feed.like;

import com.green.practice.feed.like.model.FeedLikeReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FeedLikeService {
    private final FeedLikeMapper feedLikeMapper;

    public int insLike(FeedLikeReq p) {
        int result = feedLikeMapper.insFeedLike(p);
        return result;
    }

    public int delLike(FeedLikeReq p) {
        int result = feedLikeMapper.delFeedLike(p);
        return result;
    }
}

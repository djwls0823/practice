package com.green.practice.feed;

import com.green.practice.feed.model.FeedPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FeedService {
    private final FeedMapper mapper;

    public int feedPost(FeedPostReq p) {
        int result = mapper.insFeed(p);


        return result;
    }
}

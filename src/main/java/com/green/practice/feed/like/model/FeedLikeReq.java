package com.green.practice.feed.like.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FeedLikeReq {
    private long userId;
    private long planMasterId;
}

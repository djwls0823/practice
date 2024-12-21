package com.green.practice.feed.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedPostReq {
    private long userId;
    private String content;
    private String title;
}

package com.green.practice.feed.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedDelReq {
    private long planMasterId;
    private long signedUserId;
}

package com.green.practice.feed.like;

import com.green.practice.common.model.ResultResponse;
import com.green.practice.feed.like.model.FeedLikeReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("feed/like")
public class FeedLikeController {
    private final FeedLikeService feedLikeService;

    @PostMapping
    public ResultResponse<Integer> feedPostLike(@RequestBody FeedLikeReq p) {
        int result = feedLikeService.insLike(p);
        return ResultResponse.<Integer>builder()
                             .resultMessage("좋아요 등록")
                             .resultData(result)
                             .build();
    }


    @DeleteMapping
    public ResultResponse<Integer> feedDeleteLike(@RequestBody FeedLikeReq p) {
        int result = feedLikeService.delLike(p);
        return ResultResponse.<Integer>builder()
                             .resultMessage("좋아요 취소")
                             .resultData(result)
                             .build();
    }
}

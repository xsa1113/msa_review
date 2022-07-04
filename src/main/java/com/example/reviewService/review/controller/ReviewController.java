package com.example.reviewService.review.controller;




import com.example.reviewService.review.model.ReviewDto;
import com.example.reviewService.review.service.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("review")
public class ReviewController {

    // review 는 userId(토큰값에서 가져오기, user테이블에서 id번호임), shopId(세영이 리스트에서 클릭했을때 받아오기)
    @Autowired
    ReviewServiceImpl reviewService;

    @PostMapping("/create")
    public ResponseEntity<?> createReview(@RequestBody ReviewDto reviewDto){
        return null;
    }

}

package com.example.reviewService.review.service;

import com.example.reviewService.review.model.ReviewDto;
import com.example.reviewService.review.repository.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements reviewService {
    @Autowired
    ReviewMapper reviewMapper;

    @Override
    public Boolean createReview(ReviewDto reviewDto) {

        Integer new_review =reviewMapper.createReview(reviewDto);
        if(new_review == 1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Integer countReview(Integer userId) {
        return reviewMapper.countByUserId(userId);
    }
}

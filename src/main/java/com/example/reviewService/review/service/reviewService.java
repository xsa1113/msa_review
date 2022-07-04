package com.example.reviewService.review.service;


import com.example.reviewService.review.model.ReviewDto;

public interface reviewService {
    Boolean createReview(ReviewDto reviewDto);
    Integer countReview(Integer userId);
}

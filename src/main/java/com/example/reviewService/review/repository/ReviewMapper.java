package com.example.reviewService.review.repository;


import com.example.reviewService.review.model.ReviewDto;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ReviewMapper {
    Integer createReview(ReviewDto reviewDto);
    Integer countByUserId(Integer userId);
}

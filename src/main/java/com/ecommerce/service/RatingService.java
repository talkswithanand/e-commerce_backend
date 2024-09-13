package com.ecommerce.service;

import java.util.List;

import com.ecommerce.entity.Rating;
import com.ecommerce.entity.User;
import com.ecommerce.exception.ProductException;
import com.ecommerce.request.RatingRequest;

public interface RatingService {

	public Rating createRating(RatingRequest req, User user) throws ProductException;
	
	public List<Rating> getProductRatings(Long productId);
}

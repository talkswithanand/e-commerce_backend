package com.ecommerce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Product;
import com.ecommerce.entity.Rating;
import com.ecommerce.entity.User;
import com.ecommerce.exception.ProductException;
import com.ecommerce.repository.RatingRepository;
import com.ecommerce.request.RatingRequest;

@Service 
public class RatingServiceImplementation implements RatingService{
	
	@Autowired
	private RatingRepository ratingRepository;
	@Autowired
	private ProductService productService;
	
	@Override
	public Rating createRating(RatingRequest req, User user) throws ProductException {
		
		Product product = productService.findProductById(req.getProductId());
		Rating rating = new Rating();
		rating.setProduct(product);
		rating.setUser(user);
		rating.setRating(req.getRating());
		rating.setCreatedAt(LocalDateTime.now());
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getProductRatings(Long productId) {
		return ratingRepository.getAllProductsRating(productId);
	}

}

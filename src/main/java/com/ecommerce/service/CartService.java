package com.ecommerce.service;

import com.ecommerce.entity.Cart;
import com.ecommerce.entity.User;
import com.ecommerce.exception.ProductException;
import com.ecommerce.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId, AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}

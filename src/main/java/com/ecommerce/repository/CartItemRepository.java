package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerce.entity.Cart;
import com.ecommerce.entity.CartItem;
import com.ecommerce.entity.Product;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

	@Query("SELECT ci FROM CartItem ci where ci.cart=:cart and ci.product=:product and ci.size=:size and ci.userId=:userId")
	public CartItem isCartItemExist(@Param("cart") Cart cart, @Param("product")Product product, @Param("size") String size,
			@Param("userId")Long userId);
	
}

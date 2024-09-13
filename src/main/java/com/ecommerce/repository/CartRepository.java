package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerce.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

	@Query("Select c from Cart c Where c.user.id=:userId")
	public Cart findByUserId(@Param("userId")Long userId);
	
	

}

package com.ecommerce.service;

import com.ecommerce.entity.User;
import com.ecommerce.exception.UserException;

public interface UserService {
	
	public User findUserById(long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
}

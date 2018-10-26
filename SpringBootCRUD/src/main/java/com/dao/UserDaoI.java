package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.User;

public interface UserDaoI extends CrudRepository<User, Integer>
{
	

	

}

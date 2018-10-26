package com.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Login;
import com.model.User;

public interface LoginDaoI extends CrudRepository<Login, Integer>
{

	Login findAllByUnameAndPass(String uname, String pass);

	

}

package com.service;
import java.util.List;

import com.model.Login;
import com.model.Role;
import com.model.User;
public interface ServiceI 
{
	User saveUser(User user);
	void delete(int uid);
	List<User> getAllUser();
	User getSingleUser(int uid);
	void updateUser(User u);
	List getAllRecord();
	Login findLogin(Login login);
	Role findRole(String rolename);
	List getAllByUnameAndPass(String uname, String pass);
	User Checklogin(String uname, String pass);
}

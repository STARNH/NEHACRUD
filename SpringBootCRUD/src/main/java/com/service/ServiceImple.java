package com.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.LoginDaoI;
import com.dao.RoleDaoI;
import com.dao.UserDaoI;
import com.model.Login;
import com.model.Role;
import com.model.User;

@Service
public class ServiceImple implements ServiceI
{
	@Autowired
	LoginDaoI logindao;
	
	@Autowired
	UserDaoI userdao;
	
	@Autowired
	RoleDaoI roleDao;
	
	@Override
	public User saveUser(User user) 
	{
		System.out.println("in save user");
		User u=userdao.save(user);
		return u;
	}
	
	@Override
	public User getSingleUser(int uid)
	{
		System.out.println(uid);
		User u=userdao.findOne(uid);
		return u;
	}
	
	@Override
	public void updateUser(User u)
	{
		System.out.println(u.getName());
		System.out.println(u.getUid());
		userdao.save(u);
	}

	@Override
	public List getAllRecord()
	{
		return (List) userdao.findAll();
	}
	public void delete(int uid)
	{
		System.out.println(uid);
		userdao.delete(uid);
	}
	
	@Override
	public List<User> getAllUser()
	{
		return (List<User>)userdao.findAll();
	}

	@Override
	public Role findRole(String rolename) {
		Role role=roleDao.findAllByRolename(rolename);
		System.out.println(role.getRid());
		return role;
		
	}
	@Override
	public Login findLogin(Login login) 
	{
		return (Login) logindao.findAllByUnameAndPass(login.getUname(), login.getPass());
	}
	@Override
	public List getAllByUnameAndPass(String uname, String pass) 
	{
		
		List list=(List) logindao.findAllByUnameAndPass(uname,pass);
		return list;
	}
	@Override
	public User Checklogin(String uname, String pass) 
	{
		Login l=logindao.findAllByUnameAndPass(uname,pass);
		User u=userdao.findOne(l.getLid());
		return u;
	}
}

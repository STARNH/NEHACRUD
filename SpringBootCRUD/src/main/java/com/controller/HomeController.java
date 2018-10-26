package com.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.model.Login;
import com.model.Role;
import com.model.User;
import com.service.ServiceI;

@Controller
public class HomeController 
{

	@Autowired
	ServiceI service;

	@RequestMapping("/")
	public String loginpage() 
	{
		System.out.println("in loginpage method of controller");
		return "login";
	}
	@RequestMapping("/cls")
	public String close()
	{
		return "login";
		
	}
	
	@RequestMapping("/login")
	public String loginmethod(@RequestParam String uname,@RequestParam String pass,Model m)
	{
		
		User l=service.Checklogin(uname, pass);
		List list=getAllRecord();
		if(list!=null)
		{
			m.addAttribute("data",list);
			return "success";
		}
		else
		{
			
			return "login";
		}
	}
	
	@RequestMapping("/registerpage")
	public String reg() 
	{
		System.out.println("in registerpage method of controller");


		return "Register";
	}

	@RequestMapping("/registers")
	public String saveStudent(@ModelAttribute User user, @ModelAttribute Login login, @RequestParam String rolename) 
	{
		System.out.println(user.getCity());
		System.out.println("hiiiiiiiii");
		System.out.println(rolename);
		Role r=service.findRole(rolename);
		System.out.println(r.getRolename()+"HELLO"+r.getRid());
		login.setRole(r);
		user.setLogin(login);
		System.out.println(user.getLogin().getRole().getRolename());
		User user1=service.saveUser(user);
		System.out.println("99999999999999999999999999");
		if (user1 != null) 
		{
			return "login";
		}
		else
		{
			return "Register";
		}
	}
	@RequestMapping("/del")
	public String delete(@RequestParam int uid,Model model)
	{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@22");
		service.delete(uid);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$44");
		List<User> uList=service.getAllUser();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%55");
		model.addAttribute("data",uList);
		return "success";
	}


	@RequestMapping("/add")
	public String addUser() 
	{
		return "Register";
	}

	@RequestMapping("/edit")
	public String EditPage(@RequestParam int uid, Model m) 
	{
		System.out.println("in edit");
		User u = service.getSingleUser(uid);
		m.addAttribute("data",u);
		return "edit";
	}

	@RequestMapping("/update")
	public String updateUSer(@ModelAttribute User u,@ModelAttribute Login l,Model m)
	{
		System.out.println("in update user");
		u.setLogin(l);
		service.updateUser(u);
		m.addAttribute("data",getAllRecord());
		return "success";
	}

	private List<User> getAllRecord() 
	{
		System.out.println("lllllllllllllllllllllllllllllllllllll");
		List<User> l=service.getAllRecord();
		return l;
	}
	

}

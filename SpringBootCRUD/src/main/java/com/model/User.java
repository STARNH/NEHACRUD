package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uid;
	private String name;
	private String city;
	
	//@OneToOne(cascade=CascadeType.ALL)
	@OneToOne
	private Login login;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login)
	{
		System.out.println("in setlogin...............");
		this.login = login;
	}
	
	
	
	
	
	
	
	
	
}

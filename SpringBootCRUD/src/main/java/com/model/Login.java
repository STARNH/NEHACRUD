package com.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Login 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int lid;
	private String uname;
	private String pass;
	

	@ManyToOne(cascade=CascadeType.ALL)
	private Role role;

	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) 
	{
		System.out.println("in set role implementation");
		this.role = role;
	}
	

}

package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.Role;

public interface RoleDaoI extends CrudRepository<Role, Integer>
{

	Role findAllByRolename(String rolename);

}

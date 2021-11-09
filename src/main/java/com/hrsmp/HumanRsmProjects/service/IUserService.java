package com.hrsmp.HumanRsmProjects.service;

import java.util.Optional;

import com.hrsmp.HumanRsmProjects.model.User;

public interface IUserService {
	
	Optional<User> findByUsername(String username);

	void makeAdmin(String username);

}

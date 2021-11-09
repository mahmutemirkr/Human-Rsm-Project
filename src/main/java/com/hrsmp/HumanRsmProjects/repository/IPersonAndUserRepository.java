package com.hrsmp.HumanRsmProjects.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrsmp.HumanRsmProjects.model.PersonAndUser;

public interface IPersonAndUserRepository extends JpaRepository<PersonAndUser,Long> {
	

}

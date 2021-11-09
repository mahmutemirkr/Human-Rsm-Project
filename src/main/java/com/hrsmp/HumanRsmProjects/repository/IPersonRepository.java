package com.hrsmp.HumanRsmProjects.repository;

import com.hrsmp.HumanRsmProjects.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<Person, Long> {

}

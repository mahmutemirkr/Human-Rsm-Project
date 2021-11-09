package com.hrsmp.HumanRsmProjects.service;

import java.util.List;

import com.hrsmp.HumanRsmProjects.model.Person;

public interface IPersonService {

	Person savePerson(Person person);

	void deletePerson(Long id);

	List<Person> findAllPersons();

}

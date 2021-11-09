package com.hrsmp.HumanRsmProjects.service;

import com.hrsmp.HumanRsmProjects.model.Person;
import com.hrsmp.HumanRsmProjects.repository.IPersonRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
@Service
public class PersonService implements IPersonService {
	
	private final IPersonRepository personRepository;
	
	public PersonService(IPersonRepository personRepository) {
		
		this.personRepository = personRepository;
		
	}
	
	@Override
	public Person savePerson(Person person) {
		
		person.setCreateTime(LocalDateTime.now());
		return personRepository.save(person);
	}
	
	
	@Override
	public void deletePerson(Long id) {
		
		personRepository.deleteById(id);
		
	}

	@Override
	public List<Person> findAllPersons() {
		return personRepository.findAll();
	}

}

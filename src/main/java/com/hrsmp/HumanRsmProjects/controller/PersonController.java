package com.hrsmp.HumanRsmProjects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrsmp.HumanRsmProjects.model.Person;
import com.hrsmp.HumanRsmProjects.service.IPersonService;

@RestController
@RequestMapping("api/person")//pre-path
public class PersonController {
	
	@Autowired
    private IPersonService personService;

    @PostMapping
    public ResponseEntity<?> savePerson(@RequestBody Person person)
    {
        return new ResponseEntity<>(personService.savePerson(person), HttpStatus.CREATED);
    }

    @DeleteMapping("{personId}") 
    public ResponseEntity<?> deletePerson(@PathVariable Long personId)
    {
        personService.deletePerson(personId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllPersons()
    {
        return new ResponseEntity<>(personService.findAllPersons(), HttpStatus.OK);
    }
	    
}

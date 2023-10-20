package com.example.demo.controllers;

import com.example.demo.models.Person;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/{yearOfBirth}")
    public List<Person> findPeopleByYearOfBirth (@PathVariable Integer yearOfBirth){
        return  personService.filterPeopleByYearOfBirth(yearOfBirth);
    }
}
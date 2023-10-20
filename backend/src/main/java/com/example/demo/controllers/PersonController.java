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
    // filter people by year of birth.
    @GetMapping("/people-by-year-of-birth/{yearOfBirth}")
    public List<Person> findPeopleByYearOfBirth (@PathVariable Integer yearOfBirth){
        return  personService.filterPeopleByYearOfBirth(yearOfBirth);
    }

    // search for people by city
    @GetMapping("/people-by-city/{city}")
    public List<Person> findPeopleByYearOfBirth (@PathVariable String city){
        return  personService.findPeopleByCity(city);
    }
}

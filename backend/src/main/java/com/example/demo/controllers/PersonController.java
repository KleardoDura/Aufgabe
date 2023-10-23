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
    @GetMapping("average/{yearOfBirth}")
    public  Integer calculateAverageAgeOfThePeopleFound(@PathVariable Integer yearOfBirth){
        //If this method returns 0 it means that there is no people with year of birth greater then the year given.
        return personService.calculateAverageAgeOfThePeopleFound(yearOfBirth);
    }
}

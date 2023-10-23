package com.example.demo.services;

import com.example.demo.controllers.PersonController;
import com.example.demo.models.Person;
import com.example.demo.repos.AddressRepo;
import com.example.demo.repos.PersonRepo;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class PersonService {
    //You should have the option to filter people by year of birth.
    @Autowired
    private PersonRepo personRepo;
    @Autowired
    private AddressRepo addressRepo;
    public List<Person> filterPeopleByYearOfBirth(Integer yearOfBirth){
        return personRepo.findPeopleByYearOfBirth(yearOfBirth);
    }

    //You should be able to search for people by city
    public List<Person> findPeopleByCity(String city){
        Integer addressId= addressRepo.findAddressIdByCity(city);
        return personRepo.findPeopleByAddressId(addressId);
    }

    //The average age of the people found should be calculated based on the previously
    //implemented birth year filter method.
    public Integer calculateAverageAgeOfThePeopleFound(Integer yearOfBirth){
        List<Person> people=filterPeopleByYearOfBirth(yearOfBirth);
        Integer sum=0;
        if(people.size()==0) return 0;
        //else
        for(Person person: people){
            sum+= ( LocalDate.now().getYear()-person.getYearOfBirth());
        }
        return  sum/people.size();
    }
}

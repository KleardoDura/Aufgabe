package com.example.demo.repos;

import com.example.demo.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PersonRepo  extends JpaRepository<Person,Integer> {
    @Query(value="SELECT * FROM person w WHERE w.year_of_birth=: yearOfBirth", nativeQuery = true)
    List<Person> findPeopleByYearOfBirth(@Param("yearOfBirth") Date yearOfBirth);
}

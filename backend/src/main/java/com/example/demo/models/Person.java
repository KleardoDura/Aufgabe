package com.example.demo.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstname;
    private String lastname;

    @Column(name = "year_of_birth")
    private Date yearOfBirth;
    @Column(name = "address_id")
    private Integer addressId;

    public Person() {
    }

    public Person(Integer id, String firstname, String lastname, Date yearOfBirth, Integer addressId) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
        this.addressId = addressId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Date yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}

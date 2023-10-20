package com.example.demo.services;

import com.example.demo.repos.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;
    public Integer findAddressIdByCity(String city){
        return addressRepo.findAddressIdByCity(city);
    }
}

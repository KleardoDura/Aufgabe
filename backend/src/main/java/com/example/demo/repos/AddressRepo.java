package com.example.demo.repos;

import com.example.demo.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepo extends JpaRepository<Address,Integer> {
    @Query(value="SELECT * FROM address w WHERE w.city=:city", nativeQuery = true)
    Integer findAddressIdByCity(@Param("city") String city);
}

package com.example.EnocaBackendChallenge.repository;

import com.example.EnocaBackendChallenge.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}

package com.example.EnocaBackendChallenge.service;

import com.example.EnocaBackendChallenge.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> findAll();
    Address find(int id );
    Address save(Address address);
    void  delete(Address address);
}

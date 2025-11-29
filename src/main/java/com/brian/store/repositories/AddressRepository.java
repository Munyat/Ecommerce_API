package com.brian.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.brian.store.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
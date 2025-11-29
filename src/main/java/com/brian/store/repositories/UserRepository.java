package com.brian.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.brian.store.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
}

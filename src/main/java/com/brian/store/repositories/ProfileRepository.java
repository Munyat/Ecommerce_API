package com.brian.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.brian.store.entities.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
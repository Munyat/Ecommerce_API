package com.brian.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.brian.store.entities.Category;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}
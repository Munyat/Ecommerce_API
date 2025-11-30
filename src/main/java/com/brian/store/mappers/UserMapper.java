package com.brian.store.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brian.store.dtos.UserDto;
import com.brian.store.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    // @Mapping(target = "createdAt", expression =
    // "java(java.time.LocalDateTime.now())")
    UserDto tDto(User user);
}

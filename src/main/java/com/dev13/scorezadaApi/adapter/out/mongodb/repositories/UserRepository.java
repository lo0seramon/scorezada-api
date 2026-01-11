package com.dev13.scorezadaApi.adapter.out.mongodb.repositories;

import com.dev13.scorezadaApi.adapter.out.mongodb.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {
}

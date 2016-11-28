package com.naironics.forageapp.repository;

import com.naironics.forageapp.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findById(String id);
}
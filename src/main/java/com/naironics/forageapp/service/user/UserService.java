package com.naironics.forageapp.service.user;

import com.naironics.forageapp.domain.User;
import com.naironics.forageapp.domain.UserCreateForm;

import java.util.Collection;
import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(String id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
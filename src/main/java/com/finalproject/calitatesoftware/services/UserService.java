package com.finalproject.calitatesoftware.services;

import com.finalproject.calitatesoftware.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User updateUser(Long id, String username, String password, String email, String phone, String address);

    void deleteUserById(Optional<User> id);
}

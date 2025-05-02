package com.finalproject.calitatesoftware.services;

import com.finalproject.calitatesoftware.domain.User;
import com.finalproject.calitatesoftware.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User newUser) {
        return userRepository.save(newUser);
    }

    public List<User> getAllUsers() {
        userRepository.findAll();
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    public User updateUser(Long id, String username, String password, String email, String phone, String address) {
        User updatedUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found."));

        updatedUser.setUsername(username);
        updatedUser.setPassword(password);
        updatedUser.setEmail(email);
        updatedUser.setPhone(phone);
        updatedUser.setAddress(address);

        return userRepository.save(updatedUser);
    }

    public void deleteUserById(Optional<User> userId){
        User user = userId.orElseThrow(() -> new RuntimeException("User not found."));
        userRepository.delete(user);
    }


}


package com.tnsif.userservices.service;

import org.springframework.stereotype.Service;
import java.util.*;

import com.tnsif.userservices.UserservicesApplication;
import com.tnsif.userservices.entity.User;
import com.tnsif.userservices.repository.UserRepository;

@Service
public class UserService {

    private final UserservicesApplication userserviceApplication;

    private final UserRepository userRepository;

    // Constructor injection
    public UserService(UserRepository userRepository, UserservicesApplication userserviceApplication) {
        this.userRepository = userRepository;
        this.userserviceApplication = userserviceApplication;
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Save new user
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Update user
    public User updateUser(Long id, User updatedUser) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(updatedUser.getName());
                    user.setEmail(updatedUser.getEmail());
                    user.setPhone(updatedUser.getPhone()); // Changed from department & cgpa
                    return userRepository.save(user);
                })
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    // Delete user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
package com.tnsif.userservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.userservices.entity.User;

public interface  UserRepository extends JpaRepository<User, Long> {

}
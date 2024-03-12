package com.tobeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

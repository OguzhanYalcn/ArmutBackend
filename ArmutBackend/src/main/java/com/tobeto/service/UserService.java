package com.tobeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

}

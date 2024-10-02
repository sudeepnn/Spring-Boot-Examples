package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserCredentialEntity;
import com.example.demo.repo.UserCredentialRepo;

@Service
public class UserCredentialService {
	@Autowired
	UserCredentialRepo credentialRepo;
	
	@Autowired 
	JwtService jwtService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public UserCredentialEntity register(UserCredentialEntity user) {
	user.setPassword(passwordEncoder.encode(user.getPassword()));
	return credentialRepo.saveAndFlush(user);
	}
	public String generateToken(String name) {
	return jwtService.generateToken(name);
	}
	public boolean verifyToken(String token) {
	jwtService.validateToken(token);
	return true;
	}


}

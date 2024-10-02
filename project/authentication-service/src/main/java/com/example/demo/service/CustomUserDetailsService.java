package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserCredentialEntity;
import com.example.demo.repo.UserCredentialRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	UserCredentialRepo credentialRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserCredentialEntity> user=credentialRepo.findByName(username);
		return user.map(CustomUserDetails::new).orElseThrow(()->new UsernameNotFoundException("Username/password not valid!"));

	}

}

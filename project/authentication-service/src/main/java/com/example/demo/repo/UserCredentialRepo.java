package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserCredentialEntity;

@Repository
public interface UserCredentialRepo extends JpaRepository<UserCredentialEntity, Integer>{
	public Optional<UserCredentialEntity> findByName(String name);

	

}

package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AuthorEntity;

@Repository
public interface AuthorRepo extends JpaRepository<AuthorEntity, Integer> {

}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AuthorEntity;
import com.example.demo.repo.AuthorRepo;

@Service
public class AuthorService {
	@Autowired
	AuthorRepo authorRepo;
	
	public List<AuthorEntity> getallAuthor() {
		return authorRepo.findAll();
		
	}
	
	public AuthorEntity addauthor(AuthorEntity authorEntity) {
		return authorRepo.save(authorEntity);
	}
	
	public AuthorEntity getauthorbyid(int id) {
		return authorRepo.findById(id).get();
	}
	
	
}

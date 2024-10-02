package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BookEntity;
import com.example.demo.repo.bookrepo;

@Service
public class BookService {
	
	@Autowired 
	bookrepo repo ;
	
	public List<BookEntity> getallbooks(){
		
		return repo.findAll();
	}
	
	public BookEntity addbook(BookEntity bookEntity) {
		return repo.save(bookEntity);
	}
	
public List<BookEntity> getbooksbyauthorid(int id){
		
		return repo.findByAuthorid(id);
	}
	
	
	
}

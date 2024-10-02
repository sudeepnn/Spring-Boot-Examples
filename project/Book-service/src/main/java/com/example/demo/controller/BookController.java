package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BookEntity;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping
	List<BookEntity> getallBookEntities(){
		return service.getallbooks();
	}
	
	@GetMapping("{id}")
	List<BookEntity> getallBookEntities(@PathVariable int id){
		return service.getbooksbyauthorid(id);
	}
	
	@PostMapping
	BookEntity addbook(@RequestBody BookEntity bookEntity) {
		return service.addbook(bookEntity);
	}
	
}

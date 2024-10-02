package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import com.example.demo.entity.AuthorEntity;
import com.example.demo.entity.BookEntity;
import com.example.demo.service.AuthorService;

@RestController
@RequestMapping("api/author")
public class AuthorController  {

	@Autowired
	AuthorService authorService;
	
	@GetMapping
	public List<AuthorEntity> getallAuthor() {
		return authorService.getallAuthor();
		
	}
	
	@GetMapping("{id}")
	public AuthorEntity getAuthorBooks(@PathVariable int id) {
		RestClient client=RestClient.create();
		AuthorEntity resAuthorEntity=authorService.getauthorbyid(id);
		List<BookEntity> allbooks=client.get().uri("http://localhost:8081/api/books/"+id).retrieve().body(List.class);
		resAuthorEntity.setAllbooks(allbooks);
		return resAuthorEntity;
	}
	
	@PostMapping
	public AuthorEntity addauthor(@RequestBody AuthorEntity authorEntity) {
		return authorService.addauthor(authorEntity);
	}
	
	
}

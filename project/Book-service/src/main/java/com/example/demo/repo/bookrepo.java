package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BookEntity;

@Repository
public interface bookrepo extends JpaRepository<BookEntity, Integer> {
	List<BookEntity> findByAuthorid(int id);

}

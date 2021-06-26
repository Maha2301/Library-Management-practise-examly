package com.spring.mysql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mysql.model.BookModel;

public interface BookRepo extends JpaRepository<BookModel, Integer>{

	List<BookModel> findAllByGenre(String genre);

}

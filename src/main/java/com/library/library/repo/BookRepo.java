package com.library.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.library.entity.Book;

public interface BookRepo extends JpaRepository<Book,Integer >  {

}

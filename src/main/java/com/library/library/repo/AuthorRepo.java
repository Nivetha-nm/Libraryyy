package com.library.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.library.entity.Author;


public interface AuthorRepo extends JpaRepository<Author,Integer > {
 
}


package com.library.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.library.entity.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer >  {
}


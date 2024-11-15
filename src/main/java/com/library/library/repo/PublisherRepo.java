package com.library.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.library.entity.Publisher;

public interface PublisherRepo extends JpaRepository<Publisher,Integer >  {
}

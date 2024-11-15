package com.library.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.library.entity.Publisher;
import com.library.library.repo.PublisherRepo;

@Service
public class PublisherService {
  
	@Autowired
	private PublisherRepo publisherRepo;
	  
	  public List<Publisher> getAllPublishers(){
		  return publisherRepo.findAll();
	  }
	  public Publisher getPublisherById(int id) {
		  return publisherRepo.findById(id).orElse(null);
	  }
	  public Publisher saveOrUpdatePublisher(Publisher publisher) {
		 return publisherRepo.save(publisher); 
	  }
	  public void deletePublisherById(int id) {
		  publisherRepo.findById(id).orElse(null); 
		  publisherRepo.deleteById(id);
	  }  
}


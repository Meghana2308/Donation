package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
@Component
public class DonationService {
	@PersistenceContext
  	private EntityManager entityManager;
	
	@Autowired
	public DonationRepository donationRepository;
	

	  public Donation saveproduct(Donation product) {
		  Donation savedUser=  donationRepository.save(product);
	      return savedUser;
	  } 
	  
}

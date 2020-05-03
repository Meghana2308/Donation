package com.cts.donation;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApprovalService {
	@Autowired
	DonationRepository repo;

//	public List<Donation> getAllDonations() {
//		return (List<Donation>)repo.getAll;
//	
//	}

	public Donation searchByName(String productName) {
		return (Donation) repo.findByProductName(productName);
	}
	public Donation searchByQuantity(int quantity) {
		return (Donation) repo.findByQuantity(quantity);
	}
	public List<Donation> getAllDonations() {
		// TODO Auto-generated method stub
		return null ;
	}
}


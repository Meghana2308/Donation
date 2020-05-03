package com.cts.donation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository  extends JpaRepository<Donation , Long> {
	Donation findByProductName(String productName);

	//@Query(value = "SELECT productName FROM Donations d WHERE d.productName=:productName", nativeQuery = true)
	List<Donation> findAllByproductName(String productName);
	Donation findByQuantity(int quantity);
	
	//@Query(value = "SELECT quantity FROM Donations d WHERE d.quantity=:quantity", nativeQuery = true)
	List<Donation> findAllByQuantity(int quantity);
}

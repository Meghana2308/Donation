package com.cts.donation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping("/approval")
@Api(value="The ApprovalController", description="Rest controller for order")
public class ApprovalController {
	@Autowired
	ApprovalService service;
	  @ApiOperation(value="Get all donations",
			  produces="A list of donations",
			  notes="Hit this URL to get all donation details"
			  )
	@RequestMapping("/donations")
	List<Donation> getAllDonations(){
		return service.getAllDonations();
	}
	@RequestMapping("/Donations/{productName}")
	Donation searchByName(@PathVariable String productName){
		return service.searchByName(productName);
	}
	@RequestMapping("/Donation/{quantity}")
	Donation searchByQuantity(@PathVariable int quantity){
		return service.searchByQuantity(quantity);
	}
	
	
	

}

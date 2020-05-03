package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@Api(value="The DonationController", description="Rest controller for order")
public class DonationController {
	@Autowired
	public DonationService donationService;
	  @ApiOperation(value="Post all donations",
			  produces="A list of donations",
			  notes="Hit this URL to get all donation details"
			  )
	  @PostMapping("/donations")
	    public void addProduct(@RequestBody Donation product) {
	        donationService.saveproduct(product);    
	     
}
}

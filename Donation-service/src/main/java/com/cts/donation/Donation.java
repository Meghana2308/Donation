package com.cts.donation;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description="This is the Donation Model")
@Entity
@Table(name="Donations")
public class Donation {
	@ApiModelProperty(value="A unique key for each Donation")
	@Id
	@GeneratedValue
	@Column(name="Donation_id")
	private Long donationId;
	@ApiModelProperty(value="Product name for Donation")
	@Column(name="Proudcu_name")
	private String productName;

	@ApiModelProperty(value="Quantity  for  each Donation")
	@Column(name="Quantity")
	private int quantity;
	@ApiModelProperty(value="Date of Donation")
	@JsonFormat(pattern="yyyy-MM-dd",shape=Shape.STRING)
	@Column(name="Date")
	private String date;
	public Donation() {
		
	}
	public Donation(Long donationId, String productName, int quantity, String date) {
		super();
		this.donationId = donationId;
		this.productName = productName;
		this.quantity = quantity;
		this.date = date;
	}
	public Long getDonationId() {
		return donationId;
	}
	public void setDonationId(Long donationId) {
		this.donationId = donationId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Donation [donationId=" + donationId + ", productName=" + productName + ", quantity=" + quantity
				+ ", date=" + date + "]";
	}
	
	
	
	
	

}

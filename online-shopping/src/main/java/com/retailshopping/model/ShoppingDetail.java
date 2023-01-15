package com.retailshopping.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "shopping_detail")
public class ShoppingDetail implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "contact_number", unique = true)
    @NotBlank(message = "Please Enter Contact number!")
    private String contactNumber;
    
    @DateTimeFormat
    @Column(name = "shoppingDate")
    private Date shoppingDate;
    
    @Column(name = "billingAmount")
    private double billingAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public Date getShoppingDate() {
		return shoppingDate;
	}

	public void setShoppingDate(Date shoppingDate) {
		this.shoppingDate = shoppingDate;
	}

	public double getBillingAmount() {
		return billingAmount;
	}

	public void setBillingAmount(double billingAmount) {
		this.billingAmount = billingAmount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    

    
    


}

package com.retailshopping.model;

import org.hibernate.validator.constraints.NotBlank;

import net.bytebuddy.implementation.bind.annotation.Default;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "customer_detail")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "customer_name")
    private String name;


    @Column(name = "contact_number", unique = true)
    @NotBlank(message = "Please Enter Contact number!")
    private String contactNumber;

    @Column(name = "isEmployee")
    private String isEmployee;
    
    @Column(name = "isAffiliated")
    private String isAffiliated;
    
    @Column(name = "resigteredDate")
    private Date resigteredDate;
    
    
    @Column(name = "totalAmount")
    private double totalAmount;


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
	
	

	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(String isEmployee) {
		this.isEmployee = isEmployee;
	}

	public Date getResigteredDate() {
		return resigteredDate;
	}

	public void setResigteredDate(Date resigteredDate) {
		this.resigteredDate = resigteredDate;
	}




	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getIsAffiliated() {
		return isAffiliated;
	}

	public void setIsAffiliated(String isAffiliated) {
		this.isAffiliated = isAffiliated;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", isEmployee="
				+ isEmployee + ", isAffiliated=" + isAffiliated + ", resigteredDate=" + resigteredDate
				+ ", totalAmount=" + totalAmount + "]";
	}

	


	
    
    


}

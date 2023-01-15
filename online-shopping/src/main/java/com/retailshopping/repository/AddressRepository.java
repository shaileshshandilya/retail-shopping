package com.retailshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailshopping.model.Address;

@Repository("addressRepository")
public interface AddressRepository extends JpaRepository<Address, Integer> {

    Address findAddressByBilling(boolean billing);

}

package com.retailshopping.service;

import com.retailshopping.model.Address;

public interface AddressService {

    boolean saveAddress(Address address);

    Address findAddressByBilling(boolean billing);

}

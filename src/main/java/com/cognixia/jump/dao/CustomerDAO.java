package com.cognixia.jump.dao;

import com.cognixia.jump.model.Customer;

public interface CustomerDAO {
	

	boolean updateName(String firstName, String lastName, String username);
	boolean updateUsername(String username, int id);
	boolean updatePassword(String username, int id);
	boolean addCustomer(Customer c);
	
	Customer getCustomerById(int id);


}

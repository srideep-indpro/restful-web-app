package com.riam.rest.daos;

import java.util.List;

import com.riam.rest.entities.Customers;

public interface CustomerDao {
	// String getUserDetail();
	

	Customers getCustomerDetail(int id);

	List<Customers> getAllCustomerDetails();

	Customers createNewCustomer(Customers createdCustomerEntity);

	Customers updateCustomer(Customers createCustomerEntity);

	Customers deleteCustomer(String id);

	
}

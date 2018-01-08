package com.riam.rest.services;
import com.riam.rest.jaxb.Customer;
import com.riam.rest.jaxb.Customers;

public interface CustomerService {
//	String getCustomerDetails();
	Customer getCustomerDetails(int id);

	Customers getAllCustomerDetails();

	Customer createNewCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	Customer deleteCustomer(String id);
}

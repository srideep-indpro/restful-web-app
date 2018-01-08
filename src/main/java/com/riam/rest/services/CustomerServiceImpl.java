package com.riam.rest.services;

import java.util.List;

import com.riam.rest.daos.CustomerDao;
import com.riam.rest.daos.CustomerDaoImpl;
import com.riam.rest.entities.Customers;
import com.riam.rest.jaxb.Customer;


public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer getCustomerDetails(int id) {
		CustomerDao customerDao = new CustomerDaoImpl();
		Customers customerDetail = customerDao.getCustomerDetail(id);
		return mapCustomer(customerDetail);
	}

	@Override
	public com.riam.rest.jaxb.Customers getAllCustomerDetails() {
		CustomerDao customerDao = new CustomerDaoImpl();
		List<Customers> allCustomerDetail = customerDao.getAllCustomerDetails();
		com.riam.rest.jaxb.Customers customersJaxb = new com.riam.rest.jaxb.Customers();
		for (Customers customer : allCustomerDetail) {
			com.riam.rest.jaxb.Customer customerJaxb = mapCustomer(customer);
            customersJaxb.getCustomer().add(customerJaxb);
		}
		return customersJaxb;
	}
	
	@Override
	public Customer createNewCustomer(Customer customer) {
		CustomerDao customerDao = new CustomerDaoImpl();
		int id = new Customer().getCustomerId();
	    return mapCustomer(customerDao.createNewCustomer(createCustomerEntity(customer,id)));
	}
	
	@Override
	public Customer updateCustomer(Customer customer) {
		CustomerDao customerDao = new CustomerDaoImpl();
		return mapCustomer(customerDao.updateCustomer(createCustomerEntity(customer,customer.getCustomerId())));
	}
	
	@Override
	public Customer deleteCustomer(String id) {
		CustomerDao customerDao = new CustomerDaoImpl();
		return mapCustomer(customerDao.deleteCustomer(id));
	}

	private Customers createCustomerEntity(Customer customer, int customerId) {
      Customers customerEntity = new Customers(customerId);
      customerEntity.setCustomerId(customer.getCustomerId());
      customerEntity.setAge(customer.getAge());
      customerEntity.setName(customer.getName());
      customerEntity.setAddress(customer.getAddress());
      return customerEntity;
	}

	private Customer mapCustomer(Customers customerDetail) {
		Customer customer = new Customer();
		customer.setCustomerId(customerDetail.getCustomerId());
		customer.setAge(customerDetail.getAge());
		customer.setName(customerDetail.getName());
		customer.setAddress(customerDetail.getAddress());
		return customer;
	}




}
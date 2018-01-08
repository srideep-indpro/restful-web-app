package com.riam.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.riam.rest.jaxb.Customer;
import com.riam.rest.jaxb.Customers;
import com.riam.rest.services.CustomerService;
import com.riam.rest.services.CustomerServiceImpl;

@Path("/customer")
public class CustomerResources {

	@Path("/{id}")
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Customer getCustomer(@PathParam("id") int id) {
		CustomerService cs = new CustomerServiceImpl();
		return cs.getCustomerDetails(id);
	}
	
	@Path("/getAll")
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Customers getAllCustomer() {
		CustomerService cs = new CustomerServiceImpl();
		return cs.getAllCustomerDetails();
	}
	
	@Path("/create")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Customer createCustomer(Customer customer) {
		CustomerService cs = new CustomerServiceImpl();
		return cs.createNewCustomer(customer);
	}
	
	@Path("/update")
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Customer updateCustomer(Customer customer) {
		CustomerService cs = new CustomerServiceImpl();
		return cs.updateCustomer(customer);
	}
	@Path("/delete/{id}")
	@DELETE
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Customer deleteCustomer(@PathParam("id") String id) {
		CustomerService cs = new CustomerServiceImpl();
		return cs.deleteCustomer(id);
	}
}

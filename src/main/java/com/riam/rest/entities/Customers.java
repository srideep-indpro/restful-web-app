package com.riam.rest.entities;

public class Customers implements java.io.Serializable {

	private static final long serialVersionUID = -3024788052031600324L;
	private int customerId;
	private String name;
	private Integer age;
	private String address;

	public Customers() {
	}

	public Customers(int customerId) {
		this.customerId = customerId;
	}

	public Customers(int customerId, String name, Integer age, String address) {
		this.customerId = customerId;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

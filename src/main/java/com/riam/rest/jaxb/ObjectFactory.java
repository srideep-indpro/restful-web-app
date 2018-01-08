package com.riam.rest.jaxb;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public Customers createCustomers() {
        return new Customers();
    }

    public Customer createCustomer() {
        return new Customer();
    }

}

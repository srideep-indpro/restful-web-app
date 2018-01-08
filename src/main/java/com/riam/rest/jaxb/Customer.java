package com.riam.rest.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerId",
    "name",
    "age",
    "address"
})
@XmlRootElement(name = "Customer")
public class Customer {

    @XmlElement(name = "CustomerId", required = true)
    protected int customerId;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Age", required = true)
    protected int age;
    @XmlElement(name = "Address", required = true)
    protected String address;

    public int getCustomerId() {
        return customerId;
    }


    public void setCustomerId(int id) {
        this.customerId = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String value) {
        this.name = value;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int value) {
        this.age = value;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String value) {
        this.address = value;
    }

}

package com.ttn.entity;

public class AddressCRUD {
    public Address createAddress(){
        Address address = new Address();
        address.setStreetNumber("121");
        address.setLocation("Crossing");
        address.setState("Uttar Pradesh");
        return address;
    }
    public Address createAddress1(){
        Address address1 = new Address();
        address1.setStreetNumber("221");
        address1.setLocation("Saket");
        address1.setState("Uttar Pradesh");
        return address1;
    }
}

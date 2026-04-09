package com.example.addressbook.model;

import com.example.addressbook.dto.AddressBookDTO;

public class AddressBookData {
    private int id;
    private String fullName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;

    public AddressBookData() {}
    public AddressBookData(int id, AddressBookDTO dto) {
        this.id = id;
        this.updateData(dto);
    }
    
    public void updateData(AddressBookDTO dto) {
        this.fullName = dto.fullName;
        this.address = dto.address;
        this.city = dto.city;
        this.state = dto.state;
        this.zip = dto.zip;
        this.phoneNumber = dto.phoneNumber;
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}

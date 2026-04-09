package com.example.addressbook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookDTO {
    public String fullName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phoneNumber;
}

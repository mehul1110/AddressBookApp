package com.example.addressbook.model;

import com.example.addressbook.dto.AddressBookDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressBookData {
    private int id;
    private String fullName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;

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
}

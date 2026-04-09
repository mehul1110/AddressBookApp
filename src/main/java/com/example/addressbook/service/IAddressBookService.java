package com.example.addressbook.service;
import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBookData;
import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();
    AddressBookData getAddressBookDataById(int id);
    AddressBookData createAddressBookData(AddressBookDTO dto);
    AddressBookData updateAddressBookData(int id, AddressBookDTO dto);
    void deleteAddressBookData(int id);
}

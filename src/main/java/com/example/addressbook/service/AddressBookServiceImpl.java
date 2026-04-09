package com.example.addressbook.service;
import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBookData;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookServiceImpl implements IAddressBookService {
    public List<AddressBookData> getAddressBookData() { return new ArrayList<>(); }
    public AddressBookData getAddressBookDataById(int id) { return new AddressBookData(id, new AddressBookDTO()); }
    public AddressBookData createAddressBookData(AddressBookDTO dto) { return new AddressBookData(1, dto); }
    public AddressBookData updateAddressBookData(int id, AddressBookDTO dto) { return new AddressBookData(id, dto); }
    public void deleteAddressBookData(int id) {}
}

package com.example.addressbook.service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.exception.AddressBookNotFoundException;
import com.example.addressbook.model.AddressBookData;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookServiceImpl implements IAddressBookService {
    private List<AddressBookData> addressBookList = new ArrayList<>();

    public List<AddressBookData> getAddressBookData() { 
        return addressBookList; 
    }
    
    public AddressBookData getAddressBookDataById(int id) { 
        return addressBookList.stream()
            .filter(data -> data.getId() == id)
            .findFirst()
            .orElseThrow(() -> new AddressBookNotFoundException("Address Book entry with id " + id + " not found!"));
    }
    
    public AddressBookData createAddressBookData(AddressBookDTO dto) { 
        AddressBookData data = new AddressBookData(addressBookList.size() + 1, dto);
        addressBookList.add(data);
        return data;
    }
    
    public AddressBookData updateAddressBookData(int id, AddressBookDTO dto) { 
        AddressBookData data = getAddressBookDataById(id);
        data.updateData(dto);
        return data; 
    }
    
    public void deleteAddressBookData(int id) {
        AddressBookData data = getAddressBookDataById(id);
        addressBookList.remove(data);
    }
}

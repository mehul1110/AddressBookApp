package com.example.addressbook.controller;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.dto.ResponseDTO;
import com.example.addressbook.model.AddressBookData;
import com.example.addressbook.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @GetMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> data = addressBookService.getAddressBookData();
        ResponseDTO dto = new ResponseDTO("Get Call Success", data);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("id") int id) {
        AddressBookData data = addressBookService.getAddressBookDataById(id);
        ResponseDTO dto = new ResponseDTO("Get Call Success for id", data);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData data = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO dto = new ResponseDTO("Created Address Book Data", data);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("id") int id, @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData data = addressBookService.updateAddressBookData(id, addressBookDTO);
        ResponseDTO dto = new ResponseDTO("Updated Address Book Data for id", data);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("id") int id) {
        addressBookService.deleteAddressBookData(id);
        ResponseDTO dto = new ResponseDTO("Deleted Address Book Data for id: " + id, null);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}

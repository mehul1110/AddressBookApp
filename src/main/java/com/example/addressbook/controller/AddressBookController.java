package com.example.addressbook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @GetMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getAddressBookData() {
        return new ResponseEntity<>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getAddressBookDataById(@PathVariable("id") int id) {
        return new ResponseEntity<>("Get Call Success for id: " + id, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addAddressBookData() {
        return new ResponseEntity<>("Created Address Book Data", HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateAddressBookData(@PathVariable("id") int id) {
        return new ResponseEntity<>("Updated Address Book Data for id: " + id, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("id") int id) {
        return new ResponseEntity<>("Deleted Address Book Data for id: " + id, HttpStatus.OK);
    }
}

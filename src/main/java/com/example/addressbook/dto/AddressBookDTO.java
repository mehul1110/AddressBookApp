package com.example.addressbook.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookDTO {
    
    @NotEmpty(message = "Full name cannot be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Name must start with Capital and have minimum 3 characters")
    public String fullName;
    
    @NotEmpty(message = "Address cannot be empty")
    public String address;
    
    @NotEmpty(message = "City cannot be empty")
    public String city;
    
    @NotEmpty(message = "State cannot be empty")
    public String state;
    
    @NotEmpty(message = "Zip cannot be empty")
    public String zip;
    
    @NotEmpty(message = "Phone number cannot be empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
    public String phoneNumber;
}

package com.amitkurud.customer.controller;

import com.amitkurud.customer.model.Customer;
import com.amitkurud.customer.service.CustomerService;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService= customerService;
    }

    @PostMapping(value = "/customer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
    {
        return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.OK);
    }
    @GetMapping(value = "/customer")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        return new ResponseEntity<>(customerService.getAllCustomer(),HttpStatus.OK);
    }
}

package com.amitkurud.customer.service;
import com.amitkurud.customer.model.Customer;
import com.amitkurud.customer.repository.CustomerRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    public Customer addCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

}

package com.projectorchid.project_orchid.service;

import com.projectorchid.project_orchid.entity.Availability;
import com.projectorchid.project_orchid.entity.Customer;
import com.projectorchid.project_orchid.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl  implements CustomerService{

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int theId) {
        Optional<Customer> result = customerRepository.findById(theId);

        Customer theCustomer = null;

        if(result.isPresent()){
            theCustomer= result.get();
        }else{
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        return theCustomer;
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public void deleteById(int theId) {
        customerRepository.deleteById(theId);
    }
}

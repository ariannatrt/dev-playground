package com.projectorchid.project_orchid.service;

import com.projectorchid.project_orchid.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer findById(int theId);

    void save(Customer customer);

    void deleteById(int theId);
}

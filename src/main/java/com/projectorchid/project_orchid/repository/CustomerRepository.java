package com.projectorchid.project_orchid.repository;

import com.projectorchid.project_orchid.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}

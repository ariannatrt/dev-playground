package it.casa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.casa.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}

package it.casa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.casa.entities.Property;

public interface PropertyRepository extends JpaRepository<Property, Integer> {

	
}

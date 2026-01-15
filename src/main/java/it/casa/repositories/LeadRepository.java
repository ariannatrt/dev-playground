package it.casa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.casa.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Integer>{

}

package it.casa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.casa.entities.Availability;

public interface AvailabilityRepository extends JpaRepository<Availability, Integer> {

}

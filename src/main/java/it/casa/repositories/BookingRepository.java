package it.casa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.casa.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}

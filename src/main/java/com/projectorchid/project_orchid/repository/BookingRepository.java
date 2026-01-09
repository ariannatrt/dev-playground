package com.projectorchid.project_orchid.repository;

import com.projectorchid.project_orchid.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
}

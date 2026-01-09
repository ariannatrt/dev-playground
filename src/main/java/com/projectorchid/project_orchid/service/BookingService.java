package com.projectorchid.project_orchid.service;

import com.projectorchid.project_orchid.entity.Booking;

import java.util.List;

public interface BookingService {

    List<Booking> findAll();

    Booking findById(int theId);

    void save(Booking booking);

    void deleteById(int theId);
}

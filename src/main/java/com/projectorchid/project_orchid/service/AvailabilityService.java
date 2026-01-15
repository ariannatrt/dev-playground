package com.projectorchid.project_orchid.service;

import com.projectorchid.project_orchid.entity.Availability;

import java.util.List;

public interface AvailabilityService {

    List<Availability> findAll();

    Availability findById(int theId);

    void save(Availability availability);

    void deleteById(int theId);




}

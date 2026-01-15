package com.projectorchid.project_orchid.service;

import com.projectorchid.project_orchid.entity.Availability;
import com.projectorchid.project_orchid.repository.AvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AvailabilityServiceImpl implements AvailabilityService{

    private AvailabilityRepository availabilityRepository;

    @Autowired
    public AvailabilityServiceImpl(AvailabilityRepository availabilityRepository){
        this.availabilityRepository=availabilityRepository;
    }

    @Override
    public List<Availability> findAll() {
        return availabilityRepository.findAll();
    }

    @Override
    public Availability findById(int theId) {
        Optional<Availability> result = availabilityRepository.findById(theId);

        Availability theAvailability = null;

        if(result.isPresent()){
            theAvailability= result.get();
        }else{
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        return theAvailability;
    }

    @Override
    public void save(Availability availability) {
        availabilityRepository.save(availability);
    }

    @Override
    public void deleteById(int theId) {
        availabilityRepository.deleteById(theId);
    }
}

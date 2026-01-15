package com.projectorchid.project_orchid.service;

import com.projectorchid.project_orchid.entity.Availability;
import com.projectorchid.project_orchid.entity.Lead;
import com.projectorchid.project_orchid.repository.LeadRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeadServiceImpl implements LeadService{

    private LeadRepository leadRepository;

    public LeadServiceImpl(LeadRepository leadRepository){
        this.leadRepository=leadRepository;
    }

    @Override
    public List<Lead> findAll() {
        return leadRepository.findAll();
    }

    @Override
    public Lead findById(int theId) {
        Optional<Lead> result = leadRepository.findById(theId);

        Lead theLead = null;

        if(result.isPresent()){
            theLead= result.get();
        }else{
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        return theLead;
    }

    @Override
    public void save(Lead lead) {
        leadRepository.save(lead);

    }

    @Override
    public void deleteById(int theId) {
        leadRepository.deleteById(theId);

    }
}

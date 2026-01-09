package com.projectorchid.project_orchid.service;


import com.projectorchid.project_orchid.entity.Lead;

import java.util.List;

public interface LeadService {

    List<Lead> findAll();

    Lead findById(int theId);

    void save(Lead lead);

    void deleteById(int theId);
}

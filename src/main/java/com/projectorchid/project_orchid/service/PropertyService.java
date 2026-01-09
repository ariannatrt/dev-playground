package com.projectorchid.project_orchid.service;


import com.projectorchid.project_orchid.entity.Property;

import java.util.List;

public interface PropertyService {

    List<Property> findAll();

    Property findById(int theId);

    void save(Property property);

    void deleteById(int theId);

}

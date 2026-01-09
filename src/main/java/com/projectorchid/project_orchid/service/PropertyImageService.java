package com.projectorchid.project_orchid.service;

import com.projectorchid.project_orchid.entity.Availability;
import com.projectorchid.project_orchid.entity.PropertyImage;

import java.util.List;

public interface PropertyImageService {

    List<PropertyImage> findAll();

    PropertyImage findById(int theId);

    void save(PropertyImage propertyImage);

    void deleteById(int theId);
}

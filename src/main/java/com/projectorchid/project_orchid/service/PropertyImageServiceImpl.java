package com.projectorchid.project_orchid.service;

import com.projectorchid.project_orchid.entity.Availability;
import com.projectorchid.project_orchid.entity.PropertyImage;
import com.projectorchid.project_orchid.repository.PropertyImageRepository;
import com.projectorchid.project_orchid.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyImageServiceImpl implements  PropertyImageService{

    private PropertyImageRepository propertyImageRepository;

    @Autowired
    public PropertyImageServiceImpl(PropertyImageRepository propertyImageRepository){
        this.propertyImageRepository=propertyImageRepository;
    }

    @Override
    public List<PropertyImage> findAll() {
        return propertyImageRepository.findAll();
    }

    @Override
    public PropertyImage findById(int theId) {
        Optional<PropertyImage> result = propertyImageRepository.findById(theId);

        PropertyImage thePropertyImage = null;

        if(result.isPresent()){
            thePropertyImage= result.get();
        }else{
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        return thePropertyImage;
    }

    @Override
    public void save(PropertyImage propertyImage) {
        propertyImageRepository.save(propertyImage);
    }

    @Override
    public void deleteById(int theId) {
        propertyImageRepository.deleteById(theId);

    }
}

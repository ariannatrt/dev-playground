package com.projectorchid.project_orchid.service;

import com.projectorchid.project_orchid.entity.Availability;
import com.projectorchid.project_orchid.entity.Property;
import com.projectorchid.project_orchid.repository.PropertyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements  PropertyService{

    private PropertyRepository propertyRepository;

    public PropertyServiceImpl(PropertyRepository propertyRepository){
        this.propertyRepository=propertyRepository;
    }


    @Override
    public List<Property> findAll() {
        return propertyRepository.findAll();
    }

    @Override
    public Property findById(int theId) {
        Optional<Property> result = propertyRepository.findById(theId);

        Property theProperty = null;

        if(result.isPresent()){
            theProperty= result.get();
        }else{
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        return theProperty;
    }

    @Override
    public void save(Property property) {
        propertyRepository.save(property);
    }

    @Override
    public void deleteById(int theId) {
        propertyRepository.deleteById(theId);
    }
}

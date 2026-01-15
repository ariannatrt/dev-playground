package com.projectorchid.project_orchid.repository;

import com.projectorchid.project_orchid.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository  extends JpaRepository<Property,Integer> {
}

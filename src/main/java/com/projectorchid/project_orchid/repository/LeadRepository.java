package com.projectorchid.project_orchid.repository;

import com.projectorchid.project_orchid.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead,Integer> {
}

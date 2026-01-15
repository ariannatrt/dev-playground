package it.casa.entities;

import java.time.LocalDate;

import it.casa.enums.AvailabilityType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "availability")
public class Availability {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column(name = "startDate", nullable = false)
private LocalDate startDate;

@Column(name = "endDate", nullable = false)
private LocalDate endDate;

@Column(name = "stato", nullable = false)
private AvailabilityType stato;

@ManyToOne
@JoinColumn(name = "idProperty")
private Property property;
	
	
}

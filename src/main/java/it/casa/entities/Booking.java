package it.casa.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "Booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="checkIn", nullable = false)
	private LocalDate checkIn;
	
	@Column(name = "checkOut", nullable = false)
	private LocalDate checkOut;
	
	@Column(name = "guests", nullable = false)
	private int guests;
	
	@Column(name = "totalPrice", nullable = false)
	private double totalPrice;
	
	
	@ManyToOne
	@JoinColumn(name = "propertyId")
	private Property property;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;

}

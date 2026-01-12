package it.casa.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "property")
public class Property {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="nome", nullable = false, length = 30)
	private String name;
	
	@Column(name ="descrizione", nullable = false, length = 80)
	private String description;
	
	@Column(name ="luogo", nullable = false, length = 50)
	private String location;
	
	@Column(name ="prezzo", nullable = false, precision = 10)
	private double pricePerNight;
	
	@Column(name ="ospitiMassimi", nullable = false)
	private int maxGuests;
	
	@OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
	private List<PropertyImage> images = new ArrayList<>();
	
	@OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
	private List<Booking> bookings = new ArrayList<>();
	
	@OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
	private List<Availability> availabilities = new ArrayList<>();
	
	

}

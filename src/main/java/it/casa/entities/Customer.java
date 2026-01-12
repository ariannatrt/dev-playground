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

@Entity
@Table(name = "Customer")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "firstName", nullable = false, length = 30)
	private String firstName;
	
	@Column(name = "lastName", nullable = false, length = 30)
	private String lastName;
	
	@Column(name ="email", nullable = false, length = 255)
	private String email;
	
	@Column(name ="phone", nullable = false, length = 20)
	private long phone;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Booking> bookings = new ArrayList<>();
	

}

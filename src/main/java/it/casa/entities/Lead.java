package it.casa.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Leads")
public class Lead {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nome", nullable = false, length = 30)
	private String nome;

	@Column(name = "email", nullable = false, length = 255)
	private String email;

	@Column(name = "phone", nullable = false, length = 20)
	private long phone;

	@Column(name = "sourceContact", nullable = false, length = 30)
	private String sourceContact;

	@Column(name = "createdAt")
	private LocalDate createdAt;

}

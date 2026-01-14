package it.test.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "property")
@Data
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false, length = 255)
    private String nome;

    @Column(name = "descrizione", nullable = false, length = 255)
    private String descrizione;

    @Column(name = "localita", nullable = false, length = 255)
    private String localita;

    @Column(name = "prezzoPerNotte", nullable = false)
    private double prezzoPerNotte;

    @Column(name = "maxOspiti", nullable = false)
    private int maxOspiti;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    private List<PropertyImage> immagini = new ArrayList<>();

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    private List<Booking> bookings = new ArrayList<>();

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    private List<Availability> availabilities = new ArrayList<>();

}

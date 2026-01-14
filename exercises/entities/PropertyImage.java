package it.test.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "property_image")
@Data
public class PropertyImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "property_image", length = 1024, nullable = false)
    private String urlImmagine;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prenotazione_id")
    private Property property;
}

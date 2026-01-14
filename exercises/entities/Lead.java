package it.test.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "potenziali_clienti")
@Data
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "fonte", nullable = false)
    private String fonte;

    @Column(name = "createAt", nullable = false, updatable = false)
    private LocalDateTime createAt;
}

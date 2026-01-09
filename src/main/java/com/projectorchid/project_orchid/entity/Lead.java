package com.projectorchid.project_orchid.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "`lead`")  // Backtick per keyword
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(length = 255)
    private String email;

    @Column(length = 20)
    private String phone;

    @Column(length = 100)
    private String source;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;


}

package org.mycola.hebrewcards.model;

import jakarta.persistence.*;

@Entity
@Table(name = "form")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private FormEnum form;

    // Геттеры и сеттеры...
}

package org.mycola.hebrewcards.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Геттеры и сеттеры...
}


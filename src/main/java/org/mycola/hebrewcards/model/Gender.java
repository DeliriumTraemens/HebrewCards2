package org.mycola.hebrewcards.model;

import jakarta.persistence.*;

@Entity
@Table(name = "gender")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    // Геттеры и сеттеры...
}

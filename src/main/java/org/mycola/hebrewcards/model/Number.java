package org.mycola.hebrewcards.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "number")
public class Number {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private NumberEnum number;

    // Геттеры и сеттеры...
}

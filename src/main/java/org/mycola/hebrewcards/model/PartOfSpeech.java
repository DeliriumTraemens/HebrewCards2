package org.mycola.hebrewcards.model;

import jakarta.persistence.*;

@Entity
@Table(name = "part_of_speech")
public class PartOfSpeech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PartOfSpeechEnum partOfSpeech;

    // Геттеры и сеттеры...
}

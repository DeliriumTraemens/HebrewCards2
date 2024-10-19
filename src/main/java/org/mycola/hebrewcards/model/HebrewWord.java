package org.mycola.hebrewcards.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hebrew_word")
public class HebrewWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String word;
    private String translation;

    @Column(name = "niqqud")
    private String niqqud;

    @Column(name = "transliteration")
    private String transliteration;

    @Column(name = "new_translit")
    private String newTranslit;

    @Column(name = "has_shva")
    private boolean hasShva;

    @Column(name = "process_status")
    private String process;

    @Column(name = "notes")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "form_id")
    private Form form;

    @ManyToOne
    @JoinColumn(name = "number_id")
    private Number number;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PartOfSpeech type;

    // Новые поля для мишкаля, корня и биньяна
    private String root;
    private String mishkal;
    private String binyan;

    // Геттеры и сеттеры...
}


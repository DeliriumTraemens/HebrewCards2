package org.mycola.hebrewcards.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Long id;
    @Column(name = "skill_name")
    private String name;


}

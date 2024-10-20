package org.mycola.hebrewcards.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int skillID;

    private String name;

    public Skill() {
    }

    public Skill(int skillID, String name) {
        this.skillID = skillID;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Skill skill)) {
            return false;
        }
        return getSkillID() == skill.getSkillID() && Objects.equals(getName(), skill.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSkillID(), getName());
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillID=" + skillID +
                ", name='" + name + '\'' +
                '}';
    }

    // Геттеры и сеттеры...
}


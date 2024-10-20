package org.mycola.hebrewcards.model.transDto;

import jakarta.persistence.*;
import lombok.Data;
import org.mycola.hebrewcards.model.NumberEnum;
import org.mycola.hebrewcards.model.TypeEnum;

@Data
@Entity
@Table(name="type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TypeEnum type;
}

package com.psps.recipe.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(exclude = { "recipe" })
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ToString.Exclude
    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
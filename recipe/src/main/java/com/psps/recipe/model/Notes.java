package com.psps.recipe.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
public class Notes {

    @Id
    private String id;
    private String recipeNotes;
}
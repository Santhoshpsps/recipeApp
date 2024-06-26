package com.psps.recipe.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Getter
@Setter
@Document
public class Category {
    @Id
    private String id;
    private String description;

    @DBRef
    private Set<Recipe> recipes;
}
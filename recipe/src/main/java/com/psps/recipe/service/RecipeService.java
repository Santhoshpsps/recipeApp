package com.psps.recipe.service;

import com.psps.recipe.model.Recipe;

import java.util.List;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> fetchRecipes();
    Recipe findById(Long l);
}

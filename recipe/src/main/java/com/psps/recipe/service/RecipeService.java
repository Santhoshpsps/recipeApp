package com.psps.recipe.service;

import com.psps.recipe.commands.RecipeCommand;
import com.psps.recipe.model.Recipe;

import java.util.List;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}

package com.psps.recipe.service.impl;

import com.psps.recipe.model.Recipe;
import com.psps.recipe.repository.RecipeRepository;
import com.psps.recipe.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> fetchRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        System.out.println(recipeSet);
        return recipeSet;
    }
}

package com.psps.recipe.service.impl;

import com.psps.recipe.model.Recipe;
import com.psps.recipe.repository.RecipeRepository;
import com.psps.recipe.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> fetchRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        log.info("Fetching Recipes for you ;)");
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        System.out.println(recipeSet);
        return recipeSet;
    }

    @Override
    public Recipe findById(Long id) {
        Set<Recipe> recipes = fetchRecipes();
        return  recipes.stream().filter(o-> o.getId().equals(id)).findFirst().orElse(null);
    }

}

package com.psps.recipe.service.impl;

import com.psps.recipe.model.Recipe;
import com.psps.recipe.repository.RecipeRepository;
import com.psps.recipe.service.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class RecipeServiceImplTest {

    RecipeService recipeService;

    @Mock
    RecipeRepository recipeRepository;

    Set<Recipe> recipeSet;
    Recipe recipe;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
        recipeSet = new HashSet<>();
         recipe = new Recipe();
        recipeSet.add(recipe);
    }

    @Test
    void fetchRecipes() {
        Mockito.when(recipeService.fetchRecipes()).thenReturn(recipeSet);

        Set<Recipe> recipes =  recipeService.fetchRecipes();
        assertEquals(recipes.size(),1);

        verify(recipeRepository ,times(1)).findAll();

    }
}
//package com.psps.recipe.service.impl;
//
//import com.psps.recipe.converters.RecipeCommandToRecipe;
//import com.psps.recipe.converters.RecipeToRecipeCommand;
//import com.psps.recipe.model.Recipe;
//import com.psps.recipe.repository.RecipeRepository;
//import com.psps.recipe.service.RecipeService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//
//import java.util.HashSet;
//import java.util.Optional;
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//class RecipeServiceImplTest {
//    RecipeServiceImpl recipeService;
//
//    @Mock
//    RecipeRepository recipeRepository;
//
//    @Mock
//    RecipeToRecipeCommand recipeToRecipeCommand;
//
//    @Mock
//    RecipeCommandToRecipe recipeCommandToRecipe;
//
//    @BeforeEach
//    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//
//        recipeService = new RecipeServiceImpl(recipeRepository, recipeCommandToRecipe, recipeToRecipeCommand);
//    }
//
//    @Test
//    public void getRecipeByIdTest() throws Exception {
//        Recipe recipe = new Recipe();
//        recipe.setId("1");
//        Optional<Recipe> recipeOptional = Optional.of(recipe);
//
//        when(recipeRepository.findById(anyString())).thenReturn(recipeOptional);
//
//        Recipe recipeReturned = recipeService.findById("1");
//
//        assertNotNull("Null recipe returned", String.valueOf(recipeReturned));
//        // verify(recipeRepository, times(1)).findById(anyLong());
//        // verify(recipeRepository, never()).findAll();
//    }
//
//    @Test
//    public void getRecipesTest() throws Exception {
//
//        Recipe recipe = new Recipe();
//        HashSet receipesData = new HashSet();
//        receipesData.add(recipe);
//
//        when(recipeService.getRecipes()).thenReturn(receipesData);
//
//        Set<Recipe> recipes = recipeService.getRecipes();
//
//        assertEquals(recipes.size(), 1);
//        verify(recipeRepository, times(1)).findAll();
//        verify(recipeRepository, never()).findById(anyString());
//    }
//}
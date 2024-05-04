package com.psps.recipe.controller;

import com.psps.recipe.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/","/index.html","/home/index","/home"})
    public String index(Model model)
    {
        model.addAttribute("recipes", recipeService.fetchRecipes() );
        return "index";
    }
}

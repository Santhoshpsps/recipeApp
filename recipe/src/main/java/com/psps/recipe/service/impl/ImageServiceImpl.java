package com.psps.recipe.service.impl;

import com.psps.recipe.model.Recipe;
import com.psps.recipe.repository.RecipeRepository;
import com.psps.recipe.repository.reactive.RecipeReactiveRepository;
import com.psps.recipe.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;

import java.io.IOException;

@Slf4j
@Service
public class ImageServiceImpl implements ImageService {

    private final RecipeReactiveRepository recipeReactiveRepository;

    public ImageServiceImpl(RecipeReactiveRepository recipeService) {
        this.recipeReactiveRepository = recipeService;
    }

    @Override
    public Mono<Void> saveImageFile(String recipeId, MultipartFile file) {

        Mono<Recipe> recipeMono = recipeReactiveRepository.findById(recipeId).map(recipe -> {
            Byte[] byteObjects = new Byte[0];
            try {
                byteObjects = new Byte[file.getBytes().length];

                int i = 0;

                for (byte b : file.getBytes()) {
                    byteObjects[i++] = b;
                }

                recipe.setImage(byteObjects);

                return recipe;

            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        });

        recipeReactiveRepository.save(recipeMono.block()).block();

        return Mono.empty();

    }
}
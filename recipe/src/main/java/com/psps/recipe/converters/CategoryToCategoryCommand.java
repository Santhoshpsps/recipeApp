package com.psps.recipe.converters;

import com.psps.recipe.commands.CategoryCommand;
import com.psps.recipe.model.Category;
import jakarta.annotation.Nullable;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {

    @Synchronized
    @Nullable
    @Override
    public CategoryCommand convert(Category source) {
        if(source == null){
            return null;
        }
        final CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setDescription(source.getDescription());
        categoryCommand.setId(source.getId());
        return categoryCommand;
    }
}

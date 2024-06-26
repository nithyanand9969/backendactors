package com.actorsdekho.Service;

import com.actorsdekho.Model.Recipe;
import com.actorsdekho.Model.User;
import com.actorsdekho.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RecipeServiceImplementation implements RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;


    @Override
    public Recipe createRecipe(Recipe recipe, User user) {
        Recipe createdRecipe = new Recipe();
        createdRecipe.setTitle(recipe.getTitle());
        createdRecipe.setImage(recipe.getImage());
        createdRecipe.setDescription(recipe.getDescription());
        createdRecipe.setUser(recipe.getUser());
        createdRecipe.setCreatedAd(LocalDateTime.now());
        return recipeRepository.save(createdRecipe);
    }

    @Override
    public Recipe findRecipeById(Long id) throws Exception {

        return null;
    }

    @Override
    public void deleteRecipe(Long id) throws Exception {

    }

    @Override
    public Recipe updateRecipe(Recipe recipe, Long Id) throws Exception {
        return null;
    }

    @Override
    public List<Recipe> findAllRecipe() {
        return null;
    }

    @Override
    public Recipe likeRecipe(Long recipeId, User user) throws Exception {
        return null;
    }
}

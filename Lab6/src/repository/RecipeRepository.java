package repository;

import java.util.HashMap;
import java.util.Map.Entry;

import model.Recipe;

public class RecipeRepository {
	
	HashMap<String,Recipe> recipeRepository=new HashMap<>();
	
	public Recipe getRecipeByName(String name){
		Recipe recipe = new Recipe();
		
		for (Entry<String, Recipe> entry : recipeRepository.entrySet())
		{
	        recipe = (Recipe) entry.getValue();
	        if(recipe.getName().equals(name))
	        	return recipe;
		}
		return null;

	}
	
	public void addRecipe(Recipe recipe)
	{
		recipeRepository.put(recipe.getName(), recipe);
	}

	public Boolean checkForRecipe(String name)
	{
		Recipe value = recipeRepository.get(name);
		if (value != null) {
		    return true;
		} else {
			return false;
		}
	}
}

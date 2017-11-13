package main;

import model.Recipe;
import repository.RecipeRepository;

public class MainClass {

	public static void main(String[] args) {
		RecipeRepository repository= new RecipeRepository();
		Recipe recipe = new Recipe();
        recipe.setName("Cozonac");
        repository.addRecipe(recipe);
        System.out.println("Done");
        System.out.println(repository.checkForRecipe("Cozonac"));
	}

}

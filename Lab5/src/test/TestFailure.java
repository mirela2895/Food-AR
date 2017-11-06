package test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

import main.Recipe;
import main.RecipeRepository;

public class TestFailure {

    @Test
    public void testSetter_setsProperly() throws NoSuchFieldException, IllegalAccessException {
        //given
        final Recipe recipe = new Recipe();

        //when
        recipe.setName("Cozonac");

        //then
        final Field field = recipe.getClass().getDeclaredField("name");
        field.setAccessible(true);
        assertEquals("Fields didn't match", field.get(recipe), "Cozonac");
    }

    @Test
    public void testGetter_getsName() throws NoSuchFieldException, IllegalAccessException {
        //given
        final Recipe recipe = new Recipe();
        final Field field = recipe.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(recipe, "magic_values");

        //when
        final String result = recipe.getName();

        //then
        assertEquals("field wasn't retrieved properly", result, "magic_values");
    }

    @Test
    public void testGetRecipeByName() throws NoSuchFieldException, IllegalAccessException {
    	final RecipeRepository repository= new RecipeRepository();
        Recipe recipe = new Recipe();
        recipe.setName("Cozonac");
        repository.addRecipe(recipe);
        
        Recipe result = (Recipe)repository.getRecipeByName("Cozonac");

        assertEquals("field wasn't retrieved properly", result, recipe);
    }
    
    @Test
    public void testcheckForRecipe() throws NoSuchFieldException, IllegalAccessException {
    	final RecipeRepository repository= new RecipeRepository();
        Recipe recipe = new Recipe();
        recipe.setName("Cozonac");
        repository.addRecipe(recipe);
        
        Boolean result = (Boolean)repository.checkForRecipe("Cozonac");

        assertEquals("This is not true.",result, true);
    }
}
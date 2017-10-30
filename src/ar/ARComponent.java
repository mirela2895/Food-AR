package ar;

import model.Recipe;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Ingredient;

public class ARComponent {
	Recipe recipe = new Recipe();
	List<Ingredient> ingredientList = new ArrayList<>();
	
	 Subject sub = new Subject();
     // Client configures the number and type of Observers
     new ListObserver(sub);

     for (int i = 0; i < 5; i++) {
         System.out.print("\nEnter a number: ");
         sub.setState(scan.nextInt());
     }
}

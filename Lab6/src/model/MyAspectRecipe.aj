import model.Recipe;
public aspect MyAspectRecipe {
	pointcut setRecipe(Recipe r): call(public void setName(*)) && target(r);
	pointcut addRecipe() : call(public void addRecipe(*));
	pointcut checkRecipe(String name): call(public Boolean checkForRecipe(*)) && args(name);
	 
    before (Recipe r) : setRecipe(r) {
        System.out.println("Before we set a new recipe.");
    }	
    
    after (Recipe r) : setRecipe(r){
        System.out.println("After.The recipe has the name:" + r.getName());
    }
    
    before () : addRecipe() {
        System.out.println("Before we will add a new recipe to the collection.");
    }	
    
    after () : addRecipe(){
        System.out.println("After.The recipe was added with success.Check for it in the collection.");
    }
    
    after (String name) : checkRecipe(name){
        System.out.println("After.Someone ask for this recipe:"+name );
    }
}

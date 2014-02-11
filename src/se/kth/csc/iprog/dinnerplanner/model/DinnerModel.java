package se.kth.csc.iprog.dinnerplanner.model;

import java.util.HashSet;
import java.util.Set;

public class DinnerModel implements IDinnerModel { /****/
    private int numberOfGuests=1;
    private Set<Dish> selectedDishes = new HashSet<Dish>();
    private Set<Ingredient> ingredients;
    private float totalPrice;


    Set<Dish> dishes = new HashSet<Dish>();
	
	/**
	 * TODO: For Lab2 you need to implement the IDinnerModel interface.
	 * When you do this you will have all the needed fields and methods
	 * for the dinner planner (number of guests, selected dishes, etc.). 
	 */

	/**
	 * The constructor of the overall model. Set the default values here
	 */
	public DinnerModel(){
		
		//Adding some example data, you can add more
		Dish dish1 = new Dish("French toast",Dish.STARTER,"toast.jpg","In a large mixing bowl, beat the eggs. Add the milk, brown sugar and nutmeg; stir well to combine. Soak bread slices in the egg mixture until saturated. Heat a lightly oiled griddle or frying pan over medium high heat. Brown slices on both sides, sprinkle with cinnamon and serve hot.");
		Ingredient dish1ing1 = new Ingredient("eggs",0.5,"",1);
		Ingredient dish1ing2 = new Ingredient("milk",30,"ml",6);
		Ingredient dish1ing3 = new Ingredient("brown sugar",7,"g",1);
		Ingredient dish1ing4 = new Ingredient("ground nutmeg",0.5,"g",12);
		Ingredient dish1ing5 = new Ingredient("white bread",2,"slices",2);
		dish1.addIngredient(dish1ing1);
		dish1.addIngredient(dish1ing2);
		dish1.addIngredient(dish1ing3);
		dish1.addIngredient(dish1ing4);
		dish1.addIngredient(dish1ing5);
		dishes.add(dish1);

        Dish dish4 = new Dish("Sour dough",Dish.STARTER,"sourdough.jpg","In a large mixing bowl, beat the eggs. Add the milk, brown sugar and nutmeg; stir well to combine. Soak bread slices in the egg mixture until saturated. Heat a lightly oiled griddle or frying pan over medium high heat. Brown slices on both sides, sprinkle with cinnamon and serve hot.");
        Ingredient dish4ing1 = new Ingredient("eggs",0.5,"",1);
        Ingredient dish4ing2 = new Ingredient("milk",30,"ml",6);
        Ingredient dish4ing3 = new Ingredient("brown sugar",7,"g",1);
        Ingredient dish4ing4 = new Ingredient("ground nutmeg",0.5,"g",12);
        Ingredient dish4ing5 = new Ingredient("white bread",2,"slices",2);
        dish4.addIngredient(dish4ing1);
        dish4.addIngredient(dish4ing2);
        dish4.addIngredient(dish4ing3);
        dish4.addIngredient(dish4ing4);
        dish4.addIngredient(dish4ing5);
        dishes.add(dish4);
		
		Dish dish2 = new Dish("Meat balls",Dish.MAIN,"meatballs.jpg","Preheat an oven to 400 degrees F (200 degrees C). Place the beef into a mixing bowl, and season with salt, onion, garlic salt, Italian seasoning, oregano, red pepper flakes, hot pepper sauce, and Worcestershire sauce; mix well. Add the milk, Parmesan cheese, and bread crumbs. Mix until evenly blended, then form into 1 1/2-inch meatballs, and place onto a baking sheet. Bake in the preheated oven until no longer pink in the center, 20 to 25 minutes.");
		Ingredient dish2ing1 = new Ingredient("extra lean ground beef",115,"g",20);
		Ingredient dish2ing2 = new Ingredient("sea salt",0.7,"g",3);
		Ingredient dish2ing3 = new Ingredient("small onion, diced",0.25,"",2);
		Ingredient dish2ing4 = new Ingredient("garlic salt",0.6,"g",3);
		Ingredient dish2ing5 = new Ingredient("Italian seasoning",0.3,"g",3);
		Ingredient dish2ing6 = new Ingredient("dried oregano",0.3,"g",3);
		Ingredient dish2ing7 = new Ingredient("crushed red pepper flakes",0.6,"g",3);
		Ingredient dish2ing8 = new Ingredient("Worcestershire sauce",16,"ml",7);
		Ingredient dish2ing9 = new Ingredient("milk",20,"ml",4);
		Ingredient dish2ing10 = new Ingredient("grated Parmesan cheese",5,"g",8);
		Ingredient dish2ing11 = new Ingredient("seasoned bread crumbs",115,"g",4);
		dish2.addIngredient(dish2ing1);
		dish2.addIngredient(dish2ing2);
		dish2.addIngredient(dish2ing3);
		dish2.addIngredient(dish2ing4);
		dish2.addIngredient(dish2ing5);
		dish2.addIngredient(dish2ing6);
		dish2.addIngredient(dish2ing7);
		dish2.addIngredient(dish2ing8);
		dish2.addIngredient(dish2ing9);
		dish2.addIngredient(dish2ing10);
		dish2.addIngredient(dish2ing11);
		dishes.add(dish2);

        Dish dish3 = new Dish("Ice cream",Dish.DESERT,"icecream.jpg","Enjoy the ice cream!");
        Ingredient dish3ing1 = new Ingredient("eggs",0.5,"",1);
        Ingredient dish3ing2 = new Ingredient("milk",30,"ml",6);
        Ingredient dish3ing3 = new Ingredient("brown sugar",7,"g",1);
        Ingredient dish3ing4 = new Ingredient("ground nutmeg",0.5,"g",12);
        Ingredient dish3ing5 = new Ingredient("white bread",2,"slices",2);
        dish3.addIngredient(dish3ing1);
        dish3.addIngredient(dish3ing2);
        dish3.addIngredient(dish3ing3);
        dish3.addIngredient(dish3ing4);
        dish3.addIngredient(dish3ing5);
        dishes.add(dish3);

	}
	
	/**
	 * Returns the set of dishes of specific type. (1 = starter, 2 = main, 3 = desert).
	 */
	public Set<Dish> getDishes(){
		return dishes;
	}
	
	/**
	 * Returns the set of dishes of specific type. (1 = starter, 2 = main, 3 = desert).
	 */
	public Set<Dish> getDishesOfType(int type){
		Set<Dish> result = new HashSet<Dish>();
		for(Dish d : dishes){
			if(d.getType() == type){
				result.add(d);
			}
		}
		return result;
	}
	
	/**
	 * Returns the set of dishes of specific type, that contain filter in their name
	 * or name of any ingredient. 
	 */
	public Set<Dish> filterDishesOfType(int type, String filter){
		Set<Dish> result = new HashSet<Dish>();
		for(Dish d : dishes){
			if(d.getType() == type && d.contains(filter)){
				result.add(d);
			}
		}
		return result;
	}


    @Override
    public int getNumberOfGuests() {

        return this.numberOfGuests;

    }

    @Override
    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    /**you don't need a Dish type variable, but the method getSelectedDish(type)
    should go through all the dishes in the "selectedDishes" (see previous point)
    and find the one of the provided type**/
    public Dish getSelectedDish(int type) {
        Set<Dish> result2 = new HashSet<Dish>();
        for (Dish d : selectedDishes){
            if(d.getType() == type){
               /**return d;**/
               result2.add(d);
            }
        }
        /**return null;**/
        return (Dish) result2; /**KORREKT?**/
    }

    @Override
    public Set<Dish> getFullMenu() {

        /**if (selectedDishes.isEmpty()){
            Dish dish1 = new Dish("French toast",Dish.STARTER,"toast.jpg","In a large mixing bowl, beat the eggs. Add the milk, brown sugar and nutmeg; stir well to combine. Soak bread slices in the egg mixture until saturated. Heat a lightly oiled griddle or frying pan over medium high heat. Brown slices on both sides, sprinkle with cinnamon and serve hot.");
            selectedDishes.add(dish1);
            Dish dish2 = new Dish("Meat balls",Dish.MAIN,"meatballs.jpg","Preheat an oven to 400 degrees F (200 degrees C). Place the beef into a mixing bowl, and season with salt, onion, garlic salt, Italian seasoning, oregano, red pepper flakes, hot pepper sauce, and Worcestershire sauce; mix well. Add the milk, Parmesan cheese, and bread crumbs. Mix until evenly blended, then form into 1 1/2-inch meatballs, and place onto a baking sheet. Bake in the preheated oven until no longer pink in the center, 20 to 25 minutes.");
            selectedDishes.add(dish2);
            Dish dish3 = new Dish("Ice cream",Dish.DESERT,"icecream.jpg","Preheat an oven to 400 degrees F (200 degrees C). Place the beef into a mixing bowl, and season with salt, onion, garlic salt, Italian seasoning, oregano, red pepper flakes, hot pepper sauce, and Worcestershire sauce; mix well. Add the milk, Parmesan cheese, and bread crumbs. Mix until evenly blended, then form into 1 1/2-inch meatballs, and place onto a baking sheet. Bake in the preheated oven until no longer pink in the center, 20 to 25 minutes.");
            selectedDishes.add(dish3);
        }**/
        selectedDishes = dishes; // CHANGE THIS LATER TO WHAT IS ACTUALLY CHOSEN!!!!!!!!!!

        return this.selectedDishes;

    }

    /**you don't need ingredients variable, but the method should go through all the
    selectedDishes (each dish has a method getIngredients()) and get their ingredients
    and collect them in one list and return that one list**/
    public Set<Ingredient> getAllIngredients() {
        Set<Ingredient> result3 = new HashSet<Ingredient>();

        for (Dish d : selectedDishes){
            Set<Ingredient> dishIngredients = d.getIngredients();
            for (Ingredient i : dishIngredients){
                result3.add(i);
            }

        }
        /**if (selectedDishes.isEmpty()){
            Ingredient dish2ing9 = new Ingredient("milk",20,"ml",4);
            result3.add(dish2ing9);
            Ingredient dish2ing10 = new Ingredient("beef",20,"ml",4);
            result3.add(dish2ing10);
        }**/




        return result3; /**KORREKT?**/
    }

/**the same is true for the total price, you first iterate over all the
    ingredients (that you can get with previous method) and then you sum their price.
    the sum of all the prices of all ingredients you then multiply by number of guest**/
    @Override
    public float getTotalMenuPrice() {

        /**if (selectedDishes.isEmpty()){
            totalPrice = 1337;
        }**/

            for (Dish d : selectedDishes){
                for (Ingredient i : d.getIngredients()){
                totalPrice = totalPrice + (float) i.getPrice()*numberOfGuests;
                }
            }

        return totalPrice;
    }


}

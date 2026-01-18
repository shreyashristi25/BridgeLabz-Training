package com.generics.mealplangenerator;

//creating KetoMeal class that implements MealPlan interface
public class KetoMeal implements MealPlan{

	@Override
	public String getDescription () {
		return "Keto Meal : Paneer tikka, boiled eggs, grilled chicken, avocado salad, sautéed mushrooms, cheese cubes, nuts, coconut chutney, butter coffee, and leafy green vegetables." ;
	}
}

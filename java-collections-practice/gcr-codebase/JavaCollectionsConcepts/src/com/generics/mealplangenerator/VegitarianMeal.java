package com.generics.mealplangenerator;

//creating class VegitarianMeal that extends MealPlan interface
public class VegitarianMeal implements MealPlan{

	@Override
	public String getDescription() {
		return "Vegitarian meal : Rice, wheat flour, paneer, mixed vegetables, lentils, spices, oil or ghee, curd, tomatoes, onions, green chilies, ginger, and fresh herbs." ;
	}
}

package com.generics.mealplangenerator;

//creating HighProteinMeal class that implements MealPlan interface
public class HighProteinMeal implements MealPlan{

	@Override
	public String getDescription() {
		return "High-Protein Meal: lean meats, legumes, and protein-rich foods." ;
	}
}

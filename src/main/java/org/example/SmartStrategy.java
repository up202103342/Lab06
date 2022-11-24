package org.example;

import java.util.Vector;

public class SmartStrategy implements OrderingStrategy {
    private Vector<StringDrink> drinks;
    private Vector<StringRecipe> recipes;
    private Vector<StringBar> bars;

    public SmartStrategy() { drinks = new Vector<>(); recipes = new Vector<>(); bars = new Vector<>(); }
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) {
            recipe.mix(drink);
        }
        else {
            drinks.add(drink);
            recipes.add(recipe);
            bars.add(bar);
        }
    }
    public void happyHourStarted(Bar bar){
        for (int i = 0; i < drinks.size(); i++) {
            if (bars.get(i) == bar) {
                recipes.get(i).mix(drinks.get(i));
            }
        }
    }
    public void happyHourEnded(Bar bar){
    }
}

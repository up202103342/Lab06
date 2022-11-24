package org.example;

public class ImpatientStrategy implements OrderingStrategy {

    public ImpatientStrategy() {}
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        recipe.mix(drink);
    }
    public void happyHourStarted(Bar bar){}
    public void happyHourEnded(Bar bar){}
}

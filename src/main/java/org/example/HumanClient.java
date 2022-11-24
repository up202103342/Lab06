package org.example;

public class HumanClient implements Client {
    private StringDrink drink;
    private StringRecipe recipe;
    private StringBar bar;
    private boolean hh;
    private OrderingStrategy strategy;
    public HumanClient(OrderingStrategy strategy) { hh = false; this.strategy = strategy; }
    public void happyHourStarted(Bar bar) { hh = true; strategy.happyHourStarted(bar); }
    public void happyHourEnded(Bar bar) { hh = false; strategy.happyHourEnded(bar); }
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        this.drink = drink;
        this.recipe = recipe;
        this.bar = bar;
        strategy.wants(drink, recipe, bar);
    }

}

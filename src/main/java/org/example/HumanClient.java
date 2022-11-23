package org.example;

public class HumanClient implements Client {
    private StringDrink drink;
    private StringRecipe recipe;
    private StringBar bar;
    private boolean hh;
    public HumanClient() { hh = false; }
    public void happyHourStarted(Bar bar) { hh = true; }
    public void happyHourEnded(Bar bar) { hh = false; }
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        this.drink = drink;
        this.recipe = recipe;
        this.bar = bar;
    }

}

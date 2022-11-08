package org.example;

public class StringInverter implements StringTransformer{
    public StringInverter() {}
    public void execute(StringDrink drink) {
        String sb = new StringBuilder(drink.getText()).reverse().toString();
        drink.setText(sb);
    }
}

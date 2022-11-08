package org.example;

import org.example.StringDrink;
import org.example.StringTransformer;

import static java.lang.Character.*;

public class StringReplacer implements StringTransformer {
    private char a;
    private char b;
    public StringReplacer(char a, char b) {
        this.a = a; this.b = b;
    }
    public void execute(StringDrink drink) {
        char[] c = drink.getText().toCharArray();
        for (int i = 0; i < c.length; i++)
        {
            if (c[i] == a) {
                c[i] = b;
            }
        }
        drink.setText(new String(c));
    }
}

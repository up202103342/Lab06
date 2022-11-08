package org.example;

import static java.lang.Character.*;

public class StringCaseChanger implements StringTransformer {
    public StringCaseChanger() {}
    public void execute(StringDrink drink) {
            char[] c = drink.getText().toCharArray();
            for (int i = 0; i < c.length; i++)
            {
                if (isUpperCase(c[i])) {
                    c[i] = toLowerCase(c[i]);
                }
                else {
                    c[i] = toUpperCase(c[i]);
                }
            }
            drink.setText(new String(c));
    }
}

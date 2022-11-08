package org.example;

import java.util.List;

public class StringRecipe {
    private List<StringTransformer> l;
    public StringRecipe(List<StringTransformer> inp) {
        l = inp;
    }
    public void mix(StringDrink drink) {
        for (StringTransformer st : l) {
            st.execute(drink);
        }
    }
}

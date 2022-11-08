package org.example;

import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    private List<StringTransformer> l;
    public StringTransformerGroup(List<StringTransformer> a) {
        l = a;
    }
    public void execute(StringDrink drink) {
        for (StringTransformer st : l) {
            st.execute(drink);
        }
    }
}

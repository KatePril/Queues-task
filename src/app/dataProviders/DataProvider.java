package app.dataProviders;

import java.util.LinkedList;

public final class DataProvider {
    public static LinkedList<String> getFruits() {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apricot");
        fruits.add("mango");
        fruits.add("cherry");
        fruits.add("rice");
        return fruits;
    }

}

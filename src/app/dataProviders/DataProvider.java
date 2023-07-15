package app.dataProviders;

import java.util.LinkedList;
import java.util.Queue;

public final class DataProvider {
    public static Queue<String> getFruits() {
        Queue<String> fruits = new LinkedList<>();
        fruits.add("apricot");
        fruits.add("mango");
        fruits.add("cherry");
        fruits.add("rice");
        return fruits;
    }

}

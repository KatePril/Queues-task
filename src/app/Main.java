package app;

import app.dataProviders.DataProvider;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    }

    private static void executeTaskOne() {
        Queue<String> fruits = DataProvider.getFruits();
    }

    private static void executeTaskThree() {
        Queue<String> fruits = DataProvider.getFruits();
    }
}

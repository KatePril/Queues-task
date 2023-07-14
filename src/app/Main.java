package app;

import app.dataDisplay.OutputGetter;
import app.dataProviders.DataProvider;
import app.operators.ElementAdder;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        executeTaskOne();
    }

    private static void executeTaskOne() {
        LinkedList<String> fruits = DataProvider.getFruits();
        OutputGetter<String> outputGetter = new OutputGetter<>();
        ElementAdder<String> elementAdder = new ElementAdder<>();

        outputGetter.getIntDataMsg();
        outputGetter.getOutput(fruits);

        elementAdder.addLastElement(fruits, "kiwi");
        outputGetter.getUpdatedDataMsg();
        outputGetter.getOutput(fruits);
    }

    private static void executeTaskTwo() {
        Queue<String> fruits = DataProvider.getFruits();
    }
}

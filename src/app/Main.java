package app;

import app.dataDisplay.OutputGetter;
import app.dataProviders.DataProvider;
import app.operators.ElementAdder;
import app.operators.ElementRemover;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        executeTaskOne();
        executeTaskTwo();
    }

    private static void executeTaskOne() {
        Queue<String> fruits = DataProvider.getFruits();
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
        OutputGetter<String> outputGetter = new OutputGetter<>();
        ElementRemover<String> elementRemover = new ElementRemover<>();

        outputGetter.getIntDataMsg();
        outputGetter.getOutput(fruits);

        System.out.printf("%s was removed%n", elementRemover.removeFirstElement(fruits));
        outputGetter.getUpdatedDataMsg();
        outputGetter.getOutput(fruits);
    }
}

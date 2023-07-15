package app.operators;

import java.util.LinkedList;
import java.util.Queue;

public class ElementAdder<E> {

    public void addLastElement(Queue<E> list, E element) {
        list.add(element);
    }
}

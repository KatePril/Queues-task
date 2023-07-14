package app.operators;

import java.util.LinkedList;

public class ElementAdder<E> {

    public void addLastElement(LinkedList<E> list, E element) {
        list.addLast(element);
    }
}

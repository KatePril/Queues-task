package app.operators;

import java.util.LinkedList;
import java.util.Queue;

public class ElementRemover<E> {
    public E removeFirstElement(LinkedList<E> list) {
        return list.removeFirst();
    }
}

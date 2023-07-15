package app.operators;

import java.util.LinkedList;
import java.util.Queue;

public class ElementRemover<E> {
    public E removeFirstElement(Queue<E> list) {
        return list.poll();
    }
}

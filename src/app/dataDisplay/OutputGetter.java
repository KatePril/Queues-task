package app.dataDisplay;

import java.util.List;
import java.util.Queue;

public class OutputGetter<E> {
    public void getOutput(Queue<E> queue) {
        System.out.println(getQueueOutput(queue));
    }

    private String getQueueOutput(Queue<E> queue) {
        int count = 1;
        StringBuilder output = new StringBuilder();
        for (E el : queue) {
            output.append(count).append(") ");
            output.append(el);
        }
        return output.toString();
    }
}

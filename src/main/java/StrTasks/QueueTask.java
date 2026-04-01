package StrTasks;
import java.util.Queue;
import java.util.LinkedList;

public class QueueTask {

    void printQueue(Queue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.add("A");
        q.add("B");
        q.add("C");

        new QueueTask().printQueue(q);
    }
}
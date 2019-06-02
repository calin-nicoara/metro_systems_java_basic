package ro.cni.javabasicmetrosystems.prepared.day4.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
//        queue();

        dequeue();
    }

    private static void dequeue() {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(2);
        deque.offer(3);

        System.out.println(deque);

        System.out.println(deque.poll());
        System.out.println(deque.poll());

        deque.addLast(5);
        deque.addFirst(4);

        System.out.println(deque);
    }

    private static void queue() {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(2);
        queue.offer(3);

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue);
    }
}

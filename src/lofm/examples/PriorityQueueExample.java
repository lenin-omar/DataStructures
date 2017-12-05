package lofm.examples;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    private int[] ia;
    private PriorityQueue<Integer> pq1;

    public PriorityQueueExample() {
        ia = new int[]{ 1, 10, 5, 3, 4, 7, 6, 9, 8 };
        pq1 = new PriorityQueue<>();
    }

    public void showExamples() {
        // use offer() method to add elements to the PriorityQueue pq1
        for (int x : ia) {
            pq1.offer(x);
            System.out.println("pq1: " + pq1);
        }
        System.out.println("--------------------");
        PQsort pqs = new PQsort();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(10, pqs);
        // In this particular case, we can simply use Collections.reverseOrder()
        // instead of self-defined comparator
        for (int x : ia) {
            pq2.offer(x);
            System.out.println("pq2: " + pq2);
        }
        // print size
        System.out.println("size: " + pq2.size());
        // return highest priority element in the queue without removing it
        System.out.println("peek: " + pq2.peek());
        // print size
        System.out.println("size: " + pq2.size());
        // return highest priority element and removes it from the queue
        System.out.println("poll: " + pq2.poll());
        // print size
        System.out.println("size: " + pq2.size());
        // print collection
        System.out.print("pq2: " + pq2);
    }

    static class PQsort implements Comparator<Integer> {

        public int compare(Integer one, Integer two) {
            return two - one;
        }

    }

}

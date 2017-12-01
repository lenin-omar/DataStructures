package lofm;

import lofm.examples.ArrayVsLinkedExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Array example
//        ArraysExample arraysExample = new ArraysExample();
//        arraysExample.runExamples();

        // Collections class example
//        binarySearchExample();
//        sortExample();

        // ArrayList
        ArrayVsLinkedExample arrayVsLinkedExample = new ArrayVsLinkedExample();
        arrayVsLinkedExample.failFastExample();
        arrayVsLinkedExample.compareAddingFirst();
        arrayVsLinkedExample.compareAddingMiddle();
        arrayVsLinkedExample.compareAddingLast();
    }

    private static void binarySearchExample() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(20);

        // 10 is present at index 3.
        int index = Collections.binarySearch(list, 10);
        System.out.println(index);

        // 15 is not present. 15 would have been inserted
        // at position 4. So the function returns (-4-1)
        // which is -5.
        index = Collections.binarySearch(list, -1);
        System.out.println(index);
    }

    private static void sortExample() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(33);
        list.add(1);
        list.add(13);
        Collections.sort(list);
        System.out.println("list: "+list);
    }

}

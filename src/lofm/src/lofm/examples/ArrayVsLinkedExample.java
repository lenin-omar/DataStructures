package lofm.examples;

import lofm.model.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinkedExample {

    List<Person> arrayList;
    List<Person> linkedList;

    public ArrayVsLinkedExample() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        for(int i=0; i<10000; i++) {
            arrayList.add(new Person(i,"Person-"+i, i));
            linkedList.add(new Person(i,"Person-"+i, i));
        }
    }

    public void failFastExample() {
        List<String> cities = new ArrayList<>();
        cities.add("Guadalajara");
        cities.add("Toronto");
        cities.add("New York");
        cities.add("Mexico City");

        // foreach
        for (String city : cities) {
            System.out.println(city);
        }

        Iterator iterator = cities.iterator();

        while (iterator.hasNext()) {
            String city = (String) iterator.next();
            System.out.println("It's gonna crash! O_o");
            cities.remove(city);
//            iterator.remove();
            System.out.println("City from iterator: " + city);
        }
    }

    public void compareAddingFirst() {
        long before;
        System.out.println("Time invested in inserting 1 person in ArrayList in position 0 (nanoseconds): ");
        before = System.nanoTime();
        arrayList.add(0, new Person(10001,"Test",10001)); // Insertion in position 0
        System.out.println(System.nanoTime()- before);
        System.out.println("Time invested in inserting 1 person in LinkedList in position 0 (nanoseconds): ");
        before = System.nanoTime();
        linkedList.add(0, new Person(10001,"Test",10001));  // Insertion in position 0
        System.out.println(System.nanoTime()- before);
    }

    public void compareAddingMiddle() {
        long before;
        System.out.println("Time invested in inserting 1 person in ArrayList in position 5000 (nanoseconds): ");
        before = System.nanoTime();
        arrayList.add(5000, new Person(10001,"Test",10001)); // Insertion in position 0
        System.out.println(System.nanoTime()- before);
        System.out.println("Time invested in inserting 1 person in LinkedList in position 5000 (nanoseconds): ");
        before = System.nanoTime();
        linkedList.add(5000, new Person(10001,"Test",10001));  // Insertion in position 0
        System.out.println(System.nanoTime()- before);
        //It takes more time to LinkedList in the middle because we don´t hace access to determined position
    }

    public void compareAddingLast() {
        long before;
        System.out.println("Time invested in inserting 1 person in ArrayList in last position (nanoseconds): ");
        before = System.nanoTime();
        arrayList.add(10001, new Person(10001,"Test",10001)); // Insertion in position 0
        System.out.println(System.nanoTime()- before);
        System.out.println("Time invested in inserting 1 person in LinkedList in last position (nanoseconds): ");
        before = System.nanoTime();
        linkedList.add(10001, new Person(10001,"Test",10001));  // Insertion in position 0
        System.out.println(System.nanoTime()- before);
    }
}
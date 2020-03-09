package com.jgdy4.structures.zad1;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(Arrays.asList(new Person("Jan", "Kowalski", 25),
                new Person("Janek", "Kowal", 35),
                new Person("Janusz", "Kowalewski", 15),
                new Person("Juliusz", "Kowa", 58),
                new Person("Zugmunt", "Jankowski", 48),
                new Person("Mariusz", "Zombi", 38)
        ));
        list.forEach(System.out::println); // wypisanie jedno pod drugim
        System.out.println(); // jedna linia przerwy

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        list.forEach(System.out::println); // wypisanie jedno pod drugim
        System.out.println(); // jedna linia przerwy


    }

}

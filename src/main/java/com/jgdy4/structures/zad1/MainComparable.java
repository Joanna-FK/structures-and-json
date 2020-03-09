package com.jgdy4.structures.zad1;

import java.util.*;

public class MainComparable  {
    public static void main(String[] args) {


        List<Person> personList = new ArrayList<>(Arrays.asList(new Person("Jan", "Kowalski", 25),
                new Person("Janek", "Kowal", 35),
                new Person("Janusz", "Kowalewski", 15),
                new Person("Juliusz", "Kowa", 58),
                new Person("Zugmunt", "Jankowski", 48),
                new Person("Mariusz", "Zombi", 38)
        ));


        personList.forEach(System.out::println); //wypisanie jedno po drugim
        System.out.println();//jedna linia przerwy
        Collections.sort(personList); // w przypadku comparable nie jest wymagany comparator

        personList.forEach(System.out::println); // wypisanie jedno pod drugim
        System.out.println(); // jedna linia przerwy

    }
}


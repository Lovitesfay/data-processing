package com.pluralsight.streams;

import com.pluralsight.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("lovi", "tesfay", 24));
        persons.add(new Person("biruk", "tafese", 17));
        persons.add(new Person("justin", "king", 19));
        persons.add(new Person("larry", "legend", 32));
        persons.add(new Person("mark", "moten", 45));
        persons.add(new Person("jackie", "chan", 22));
        persons.add(new Person("steve", "harvey", 34));
        persons.add(new Person("michael", "jordan", 8));
        persons.add(new Person("christiano", "ronaldo", 19));
        persons.add(new Person("messi", "buzy", 10));

        System.out.println("Search: ");
        String search = input.nextLine();

        List<Person> matches = persons.stream().filter(person -> person.getFirstName().equalsIgnoreCase(search)).toList();
        System.out.println("Matches: " + matches);



        //get the total age
        int totalAge = persons.stream()
                .mapToInt(person -> person.getAge())
                .sum();
        //print out the total age
        System.out.println("the total age is " + totalAge);


    }
}

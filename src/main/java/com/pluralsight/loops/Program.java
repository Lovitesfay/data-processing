package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
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

     //   System.out.println("Search for a name (first or last): ");
      //  String searchName = sc.nextLine();

        // List<Person> matchedPeople = new ArrayList<Person>();


        //  for (Person person : persons) {

        //    if (person.getFirstName().toLowerCase().contains(searchName.toLowerCase())) {
        //    matchedPeople.add(person);
        //  }
        //  }

        //    for (Person person : matchedPeople) {
        //     System.out.println(person.getFirstName() + " " + person.getLastName());
        //  }

            int sum = 0;
        for (Person person : persons) {
             sum += person.getAge();

        }
        System.out.println(sum);
    }
}


package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("lovi", "tesfay"));
        persons.add(new Person("biruk", "tafese"));
        persons.add(new Person("justin", "king"));
        persons.add(new Person("larry", "legend"));
        persons.add(new Person("mark", "moten"));
        persons.add(new Person("jackie", "chan"));
        persons.add(new Person("steve", "harvey"));
        persons.add(new Person("michael", "jordan"));
        persons.add(new Person("christiano", "ronaldo"));
        persons.add(new Person("messi", "buzy"));

        System.out.println("Search for a name (first or last): ");
        String searchName = sc.nextLine();

        List<Person> matchedPeople = new ArrayList<Person>();



            for (Person person : persons) {

                if (person.getFirstName().toLowerCase().contains(searchName.toLowerCase())) {
                matchedPeople.add(person);
            }
        }

            for (Person person : matchedPeople) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
        }
    }



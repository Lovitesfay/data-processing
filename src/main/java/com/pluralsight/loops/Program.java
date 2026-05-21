package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("lovi", "tesfay"));
        persons.add(new Person("lovi", "tesfay"));
        persons.add(new Person("lovi", "tesfay"));
        persons.add(new Person("lovi", "tesfay"));
        persons.add(new Person("lovi", "tesfay"));
        persons.add(new Person("lovi", "tesfay"));
        persons.add(new Person("lovi", "tesfay"));
        persons.add(new Person("lovi", "tesfay"));
        persons.add(new Person("lovi", "tesfay"));
        persons.add(new Person("lovi", "tesfay"));

        System.out.println("Search for a name (first or last): ");

        List<Person> matchedPeople = new ArrayList<Person>();



            String searchName = "Lovi";

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



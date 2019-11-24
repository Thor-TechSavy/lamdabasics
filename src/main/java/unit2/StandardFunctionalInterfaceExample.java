package unit2;

import common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
        //sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName()
                .compareTo(p2.getLastName()));

        //create method to print all elements in the list
        printConditionally(people, p -> true);

        //create method to print all elements that have last name beginning with C
        printConditionally(people, p -> p.getLastName().startsWith("C"));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }

    }
}

package unit1;

import common.Condition;
import common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {
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

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }

    }
}

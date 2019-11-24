package unit1;

import common.Condition;
import common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
        //sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        //create method to print all elements in the list
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return true;
            }
        });
        //create method to print all elements that have last name beginning with C
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }

    }
}
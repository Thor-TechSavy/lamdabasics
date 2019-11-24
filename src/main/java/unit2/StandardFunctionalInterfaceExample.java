package unit2;

import common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
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
        performConditionally(people, p -> true, p -> System.out.println(p));

        //create method to print all elements that have last name beginning with C
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
    }

    private static void performConditionally(List<Person> people,
                                             Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }

    }
}

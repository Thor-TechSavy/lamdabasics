package unit3;

import common.Person;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
   /*     people.stream() //new view of collection , could be seen as a conveyor belt
                .filter(p -> p.getLastName().startsWith("C")) // an operation
                .forEach(p -> System.out.println(p.getFirstName()));//terminal operation , END operation*/
        long count = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();
        System.out.println(count);
    }
}

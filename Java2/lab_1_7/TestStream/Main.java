package lab_1_7.TestStream;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        04.05.17
 * <p>
 * TASK 1.7.4  *
 * <p>
 * 1) Create a class Main with a main() method, which:
 * - create and output a list of integers using Stream functions: create an infinite stream
 * of integers, starting at 10 and increasing every next on 10, then restrict it 10 the first
 * elements, which are then halved and collect the list;
 * - create a list of strings of 10 elements and then using the Stream, select, sort and
 * print the lines starting with some a symbol.
 */

public class Main {

    public static void main(String[] args) {

//                          * TASK 1.7.4.1 *
        Stream<Integer> streamOfIterate = Stream.iterate(0, i -> i + 10);

        List<Integer> list = streamOfIterate.limit(10)
                .map(elem -> elem / 2)
                .collect(Collectors.toList());

        System.out.println(list);

        List<String> strings = Arrays.asList("Apple", "Banana", "Orange", "Pear",
                "Melon", "Water-melon", "Cherry", "Strawberry", "Plum", "Pineapple", "Apricot", "Avocado");

        System.out.println(" - - - - - - ");
        System.out.println("This words starting from \"A\" letter: \n");
        strings.stream().sorted((String a, String b) -> (a.charAt(0) - b.charAt(0)))
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);


        System.out.println(" - - - - - - \n");

        //                          * TASK 1.7.4.2 *
        //        creating persons
        List<Person> persons = new ArrayList();
        persons.add(new Person("Mary", "female", 32));
        persons.add(new Person("Kevin", "male", 18));
        persons.add(new Person("Rachel", "female", 27));
        persons.add(new Person("Jack", "male", 25));
        persons.add(new Person("Scott", "male", 33));
        persons.add(new Person("Ann", "female", 37));
        persons.add(new Person("Frank", "male", 21));
        persons.add(new Person("Eleanora", "female", 23));

        System.out.println("This guys are military mans: \n");
//        get a military mans
        persons.stream()
                .filter((elem) -> (elem.getAge() >=18 && elem.getAge() <=27 && elem.getGender() =="male" ))
                .forEach(System.out::println);

        //                          * TASK 1.7.4.3 *
        //    calculate a average woman age
        System.out.println(" - - - - - - \n");
        double averAge = persons.stream()
                .filter((elem) -> elem.getGender() =="female")
                .mapToInt(w -> w.getAge())
                .average()
                .getAsDouble();
        System.out.println("The average woman age is: " + averAge);
    }
}

package lambda;

// declarative programming

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {

        /* Functional interface : is an interface with only one abstract method */
        // this is an anonymous inner class
        Printer p1 = new Printer() {
            @Override
            public void greet(String message) {
                System.out.println(message);
            }
        };
        // test
        p1.greet("hello world");

        /* Lambda expression : like an anonymous function  (something)->{something else} */
        Printer p2 = System.out::println;
        // test
        p2.greet("my name is hamza");

        /*
        1- a lambda expression can access to the static and non-static fields in the class , local variables as well
        2- this : represents the reference to the current instance of the class
        */

        /* Consumer : void consume(obj) */

        Consumer<String> consumer = (value)-> System.out.println(value.toUpperCase());
        consumer.accept("hello");

        // BiConsumer : accept two arguments

        BiConsumer<String,String> biConsumer = (value,reg) -> System.out.println(Arrays.toString(value.split(reg)));
        biConsumer.accept("hamza dabaghi","[h]");

        // intConsumer : accept an int , we have also double and long consumers
        IntConsumer intConsumer = (System.out::println);
        intConsumer.accept(2);


        //test

        List<String> numbers = List.of("a","b","c","d");
        numbers.forEach(value -> System.out.println("- "+ value));

        // chaining consumers

        Consumer<String> print = value -> System.out.println("- "+ value);
        Consumer<String> printUpperCase = value -> System.out.println("- "+ value.toUpperCase());
        numbers.forEach(print.andThen(printUpperCase));


        /* Supplier : obj supply() , get method*/

        Supplier<Double> getRandom = Math::random;
        System.out.println(getRandom.get());


        /* Function : obj map(obj) */

        /* Predicate : bool test(condition) */
    }
}

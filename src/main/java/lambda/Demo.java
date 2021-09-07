package lambda;

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

        
        /* Consumer : */



        /* Supplier : */

        /* Function : */

        /* Predicate : */
    }
}

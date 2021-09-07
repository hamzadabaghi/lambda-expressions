package lambda;

public class Demo {

    public static void main(String[] args) {

        /* Functional interface : is an interface with only one abstract method */

        // this is an anonymous inner class
        Printer p = new Printer() {
            @Override
            public void greet(String message) {
                System.out.println(message);
            }
        };

        // test
        p.greet("hello world");



        /* Consumer : */


        /* Supplier : */

        /* Function : */

        /* Predicate : */
    }
}

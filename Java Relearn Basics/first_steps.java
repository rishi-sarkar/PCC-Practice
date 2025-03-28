/*
 * These are the basic steps in getting used to Java again
 * Starting from the basics and working back to all OOP
 */

 public class first_steps {
    public static void main(String[] args) {
        // basic print lines
        System.out.print("Hi and ");
        System.out.println("Hello World");
        System.out.println(1);
        System.out.println(10*5);

        String name = "Rishi";
        System.out.println(name);
        
        int age = 22;
        System.out.println(age);
        age = 23; //soon enough
        System.out.println(age);

        char lastname;
        lastname = 's';
        System.out.println(lastname);

        final int siblings = 1;
        System.out.println(siblings);

        float price = 12.99f; // 32 bit
        double weight = 167.8; // 64 bit
        System.out.println(price + weight);

        System.out.println(name + " Sarkar");

        int x = 4, y = 5, z = 6;
        System.out.println(x + y + z);
        x = y = z = 10;
        System.out.println(x + y + z);

        /*
         * Primitive Data Types:
         * byte
         * short
         * int
         * long
         * float
         * double
         * boolean
         * char
         */

        
        

    }
}
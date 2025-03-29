/*
 * These are the basic steps in getting used to Java again
 * Starting from the basics and working back to all OOP
 */

 public class first_steps {
    
    public static int triple(int number) {
        return number * 3;
    }

    public static void bestShow(String show) {
        System.out.println("The best show is " + show);
    }


    public static void main(String[] args) {
        // basic print lines
        System.out.print("Hi");
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

        int num = 15;
        System.out.println(triple(num));

        bestShow("New Girl");

        boolean raining = true;
        boolean friday = true;

        if (friday && raining) {
            System.out.println("Read a book at home");
        }
        else if (friday || raining) {
            System.out.println("Go out");
        }
        else {
            System.out.println("Work");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
        int day = 6;
        do {
            switch (day) {
                case 1 -> {
                    System.out.println("Monday");
                }
                case 2 -> {
                    System.out.println("Tuesday");
                }
                case 3 -> {
                    System.out.println("Wednesday");
                }
                case 4 -> {
                    System.out.println("Thursday");
                }
                case 5 -> {
                    System.out.println("Friday");
                    friday = false;
                }
                case 6 -> {
                    System.out.println("Saturday");
                }
                case 7 -> {
                    System.out.println("Sunday");
                }
            }
            if (day == 7) {
                day = 0;
            } else {
                day++;
            }
        } while (friday);


        int[] list = new int[5];
        for (int i = 0; i < 5; i++) {
            list[i] = i;
        }
        System.out.println(list[3]);


    }
}
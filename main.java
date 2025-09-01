public class main {
    public static void main(String[] args) {

        // This is how we print in Java

        /* This is a multi line comment */

        System.out.print("I like pizza \n");
        System.out.println("It's really good!");
        System.out.println("Buy me pizza!");
        System.out.println("I would like more!");
        
        // sout shortcut for System.out.println();


        int age; // declaration
        age = 21; // assigning age

        System.out.println("My age is " + age);

        int year = 2025;
        System.out.println(year);

        System.out.println("The year is " + year);

        double price = 19.99;
        double gpa = 8.48;
        double temperature = -12.5;

        System.out.println(price);
        System.out.println(temperature);
        System.out.println(gpa);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);

        if(isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        String name = "Namit Jain";
        System.out.println("My name is " + name);

        String email = "fake123@gmail.com";
        System.out.println(email);

        String car = "Mustang";
        System.out.println(car);

        String color = "red";
        System.out.println(color);

        System.out.println("My name is " + name + ". I have a " + car + ". It is " + color + " in color.");

    }
}

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Int input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Double input
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // Boolean input
        System.out.print("Are you a student: ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name + ". Age: " + age + ". GPA: " + gpa);

        if(isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}

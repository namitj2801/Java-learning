import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        // calucalte the area of a rectangle

        double width = 0;
        double height = 0;
        // double area = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your width: ");
        width = scanner.nextDouble();
        
        System.out.print("Enter your height: ");
        height = scanner.nextDouble();

        
        System.out.println("The area of the rectangle is: " + width*height + "cm²");
        scanner.close();
    }
}

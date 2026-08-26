import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       
    System.out.println("Enter the length: ");
       double length = keyboard.nextDouble();

       System.out.println("Enter the width: ");
       double width = keyboard.nextDouble();

       System.out.println("The area of the rectangle is: " + (length * width));

       keyboard.close();
      
    }
}

import java.util.Scanner;
public class posNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
       
        System.out.println("Enter positive one by one. Enter a negative number to stop.");
        while (true) {
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("The sum of the positive numbers entered is: " + sum);
        scanner.close();
    }
}

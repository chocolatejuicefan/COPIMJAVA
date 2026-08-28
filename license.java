import java.util.Scanner;
public class License {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a valid driver's license? (true/false): ");
        boolean hasLicense = scanner.nextBoolean();

        if (age >= 18 && hasLicense) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("You are not eligible to drive.");
        }
        scanner.close();
    }
}

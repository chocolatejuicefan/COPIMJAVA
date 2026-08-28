import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the original price: ");
        double originalPrice = keyboard.nextDouble();

        double discountRate = 0.0;

        if (originalPrice <= 50) {
            discountRate = 0.05; // 5% discount
        } else if (originalPrice <= 100) {
            discountRate = 0.10; // 10% discount
        } else {
            discountRate = 0.15; // 15% discount
        }
        double finalPrice = originalPrice - (originalPrice * discountRate);

        System.out.println("Discount applied: " + (discountRate * 100) + "%");
        System.out.println("Final price after discount: $" + finalPrice);

        keyboard.close();
    }
}

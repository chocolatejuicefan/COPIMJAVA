import java.util.Scanner;
public class concateSt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatenatedString);

        scanner.close();
    }

    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }
}

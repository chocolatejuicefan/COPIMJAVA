import java.util.Scanner;

public class countingVowels {
    public static void main(String[] args) {
      
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = keyboard.nextLine();

        sentence = sentence.toLowerCase();
  //Java program to count the number of vowels in a sentence
        int counter = 0;

       
         for (int i=0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
                    counter++;
                }
                System.out.println("The sentence contains " + counter + " vowels.");
                keyboard.close();
         }
    }
}

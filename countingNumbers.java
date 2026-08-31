public class countingNumbers {
    public static void main(String[] args) {
        int[] numbers = {15, 4, 95, 7, 23, 86};
        //System.out.println(numbers[3]);
        
        int evenCounter = 0, oddCounter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        System.out.println("Even numbers: " + evenCounter);
        System.out.println("Odd numbers: " + oddCounter);
    }
}

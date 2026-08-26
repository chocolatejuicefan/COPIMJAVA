public class forLoop {
public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4)
            continue; // skip this iteration
            if(i == 7)
                break;// end the loop
            System.out.println(i);
        }
    }
}

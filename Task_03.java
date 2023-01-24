import java.io.IOException;
import java.util.Scanner;

/**
 * Task_03
 */

public class Task_03 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        boolean b = true;
        for (int P = 1; P <= input; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.println(P);
            else
                b = true;
        }
    }

}

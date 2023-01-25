import java.io.IOException;
import java.util.Scanner;

/**
 * Task_02
 */

public class Task_02 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите число: ");
        Scanner a = new Scanner(System.in);
        int value = a.nextInt();

        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        System.out.println(result);
        a.close();

    }
}

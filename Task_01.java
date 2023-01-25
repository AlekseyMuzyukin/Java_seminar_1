import java.io.IOException;
import java.util.Scanner;

/**
 * Task_01
 */
public class Task_01 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите число: ");
        Scanner a = new Scanner(System.in);
        int value = a.nextInt();

        int result = 0;
        for (int i = 1; i <= value; i++) {
            result += i;
        }
        a.close();
        System.out.println(result);
    }
}
import java.io.IOException;

/**
 * Task_01
 */
public class Task_01 {

public static void main(String[] args) throws IOException {
    int result = multiple(9);
    System.out.println(result);
}

public static int multiple(int value) {
    int result = 0;
    for (int i = 1; i <= value; i++) {
        result += i;
    }
    return result;
}
}
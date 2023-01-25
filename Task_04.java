import java.util.Scanner;

public class Task_04 {
    // /**
    // *
    // */
    public static Scanner iScanner = new Scanner(System.in);

    public static int InputInt(String text) {

        System.out.println(text);
        return iScanner.nextInt();
    }

    public static char InputChar(String text) {
        System.out.println(text);
        return iScanner.next().charAt(0);

    }

    public static String InputString(String text) {
        System.out.println(text);
        if (iScanner.hasNextLine()) {
            return iScanner.nextLine();
        }
        return "";
    }

    public static boolean CheckActiv(String userInput) {
        return !userInput.equals("Stop");

    }

    public static float Function(int a, int b, char ch) {
        if (ch == '+')
            return a + b;
        else if (ch == '-')
            return a - b;
        else if (ch == '*')
            return a * b;
        else if (ch == '/' && b != 0)
            return a / b;
        else
            return -1;
    }

    public static void main(String[] args) {
        // boolean CheckActiv = true;
        String active = " ";
        while (CheckActiv(active)) {
            int a = InputInt("Введите первое число");
            int b = InputInt("Введите второе число");
            char ch = InputChar("Введите знак");
            System.out.printf("Результат: %.1f\n", Function(a, b, ch));
            active = InputString("Для остановки набери Stop \n или нажми Enter");
        }
        iScanner.close();
    }

}

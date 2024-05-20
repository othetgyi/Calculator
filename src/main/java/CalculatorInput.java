import java.util.Scanner;
public class CalculatorInput {
    public static double getNumber1() {
        Scanner keyboard = new Scanner(System.in);
        double number1;

        System.out.print("Enter your first number: ");
        number1 = keyboard.nextDouble();
        return number1;
    }

    public static double getNumber2() {
        Scanner keyboard = new Scanner(System.in);
        double number2;

        System.out.print("Enter your second number: ");
        number2 = keyboard.nextDouble();
        return number2;
    }
}

import java.util.Scanner;

public class CalculatorOperator {

    public static String getCalculatorOperator() {
        Scanner keyboard = new Scanner(System.in);
        String mathsOperation;

        System.out.print(("Enter what math operation you want to perform - add, subtract, multiply, divide: "));
        mathsOperation = keyboard.nextLine();
        return mathsOperation;
    }
}

import java.util.Scanner;



public class Calculator {
    public static void main(String[] args) {//add unit tests for main
        outputIntro();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double input1 = scanner.nextDouble();

        System.out.print("Enter your second number: ");
        double input2 = scanner.nextDouble();

        System.out.print(("Enter a math operation - add, subtract, multiply, divide: "));
        String operator = scanner.next();

        calculateResult(input1, input2, operator);
    }

    public static void outputIntro() {
        System.out.println("Welcome to Java Calculator! I will ask you for two numbers and an operator and then perform the calculation.");
    }
    public static double calculateResult(double input1, double input2, String operator) {
        double result = 0;

        switch (operator) {
            case "add" -> {
                result = input1 + input2;
                System.out.print("Your result is " + result);
                return result;
            }
            case "subtract" -> {
                result = input1 - input2;
                System.out.print("Your result is " + result);
                return result;
            }
            case "multiply" -> {
                result = input1 * input2;
                System.out.print("Your result is " + result);
                return result;
            }
            case "divide" -> {
                result = input1 / input2;
                System.out.print("Your result is " + result);
                return result;
            }
        }
        System.out.println("That operator was not in the correct format");
        return result;
    }
}

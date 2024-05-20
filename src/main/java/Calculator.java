import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        outputIntro();
        double number1 = CalculatorInput.getNumber1();
        double number2 = CalculatorInput.getNumber2();
        String operator = CalculatorOperator.getCalculatorOperator();
        calculateResult(number1, number2, operator);
    }

    public static void outputIntro() {
        System.out.println("Welcome to Java Calculator! I will ask you for two numbers and an operator and then perform the calculation.");
    }
    public static double calculateResult(double number1, double number2, String operator) {
        double result = 0;

        switch (operator) {
            case "add" -> {
                result = number1 + number2;
                System.out.print("Your result is " + result);
                return result;
            }
            case "subtract" -> {
                result = number1 - number2;
                System.out.print("Your result is " + result);
                return result;
            }
            case "multiply" -> {
                result = number1 * number2;
                System.out.print("Your result is " + result);
                return result;
            }
            case "divide" -> {
                result = number1 / number2;
                System.out.print("Your result is " + result);
                return result;
            }
        }
        System.out.println("That operator was not in the correct format");
        return result;
    }
}

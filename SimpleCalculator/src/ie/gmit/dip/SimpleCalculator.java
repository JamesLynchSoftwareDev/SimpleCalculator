package ie.gmit.dip;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //New scanner object

        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();                // scaner awaits input from user

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = 0;
        boolean validOperation = true;

        switch (operator) {                  // switch statement for operator and catch small errors
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }

        scanner.close();     // closes scanner object
    }
}

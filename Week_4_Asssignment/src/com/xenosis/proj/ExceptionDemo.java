package com.xenosis.proj;
import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = {"10", "20", "30"};

        try {
            System.out.println("Enter an index (0-2): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + data[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds - " + e.getMessage());
        }

        System.out.println("Enter a number to divide 100 by: ");
        try {
            String input = scanner.next();
            int divisor = Integer.parseInt(input);
            int result = 100 / divisor;
            System.out.println("100 / " + divisor + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format - " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed - " + e.getMessage());
        }

        System.out.println("Enter a number to check for negativity: ");
        try {
            int num = scanner.nextInt();
            checkForNegative(num);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        String str = null;
        try {
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception - " + e.getMessage());
        }

        System.out.println("Execution finished.");
        scanner.close();
    }

    public static void checkForNegative(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed: " + number);
        }
        System.out.println("The number " + number + " is valid.");
    }
}


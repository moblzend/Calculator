package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        System.out.println(calc(nextLine));
    }

    public static String calc(String input) throws Exception {
        String[] array = input.split(" ");
        if (array.length != 3) throw new Exception("т.к. строка не является математической операцией");
        int a = Integer.parseInt(array[0]);
        String operator = array[1];
        int b = Integer.parseInt(array[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10) throw new Exception();

        return String.valueOf(verifyArgs(a, b, operator));
    }

    public static int verifyArgs(int a, int b, String operator) throws Exception {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new Exception("т.к. не корректный математический оператор");
        };
    }
}

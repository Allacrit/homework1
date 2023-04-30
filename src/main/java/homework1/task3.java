//Реализовать простой калькулятор

package homework1;

import java.util.Scanner;

public class task3 {
    private static String operations;
    private static int result;
    private static int numberOne;
    private static int numberTwo;

    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        numberOne = scanNumber();
        System.out.print("Введите второе число: ");
        numberTwo = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        operations = scanOperations();
        result = getResult();
        System.out.printf("%d %s %d = %d", numberOne, operations, numberTwo, result);
    }

    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }

    static int getResult() {
        switch (operations) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
            default:
                System.out.println("!!!НЕ ПРАВИЛЬНЫЙ ОПЕРАТОР!!!");
                System.out.println("Введите оператор: -, +, *, /");
                operations = scanOperations();
                getResult();
                break;
        }
        return result;
    }
}
//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package homework1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = scanner.nextInt();
        scanner.close();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        System.out.printf("Факториал числа: %d\n", getFactorial(i));
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}

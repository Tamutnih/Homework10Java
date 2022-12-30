package main.java.com.example;

import java.util.Scanner;

/*Создать детский класс Is Positive — ему дают целое число, он одобряет его, если оно положительное */
public class IsPositive {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число >> ");
        int a = scanner.nextInt();
        boolean isPositive = (a > 0);
        if (isPositive)
            System.out.println("положительное  число");
        else {
            System.out.println("отрицательное  число");
        }
        if (a == 0) {
            System.out.println("ноль");
        }
    }

    public char[] isGood(int i) {
        return null;
    }
}
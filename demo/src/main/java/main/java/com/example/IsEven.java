package main.java.com.example;

import java.util.Scanner;

/* Создать детский класс IsEven— ему дают целое число, он одобряет его, если оно чётное */
public class IsEven {
    public static void main(String[] args) {
        // Пользователь вводит число
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число >> ");
        int num = input.nextInt();

        boolean remainder = isEven(num);
        if (remainder == true)
            System.out.println("Введенное число является четным.");
        else
            System.out.println("Введенное число является нечетным.");
    }

    public static boolean isEven(int number) {

        if (number % 2 == 0)
            return true;
        else
            return false;
    }

    public char[] isGood(int i) {
        return null;
    }

}

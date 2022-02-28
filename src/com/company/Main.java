package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        // метод while от 1 до 100 упр.1

        int q = 1;
        while (q <= 100) {
            System.out.print(q);
            System.out.print(" ");
            q++;
        }
        System.out.println();

        // метод for от 1  до 100 упр.1

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // метод for от 100 до 1 упр.2
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // метод if else вывод только четных чисел от 1 до 100 упр.3

            for (int i = 0; i <= 100; i = i + 2) {
                if (i > 1) {
                    System.out.print(i);
                }
                System.out.print(" ");
            }
        System.out.println();

        // выводим только нечетные числа от 100 до 1 упр.4

            for (int i = 100; i>=1; i = i - 1) {
                 if (i == 99);{
                     i--;
                     System.out.print(i + " ");

            }
        }



    }
}







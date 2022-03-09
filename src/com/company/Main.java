package com.company;

public class Main {

    public static void main(String[] args) {
        sum1();
        sum2();
        sum3();
    }

    private static void sum1() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i--;
        for (; i >= 1; --i) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void sum2() {
        int firstFriday = 4;
        for (; firstFriday <= 31; firstFriday++) {
            if ((firstFriday - 4) % 7 == 0) {           //вычетаем значение первого дня пятницы, чтобы перебрать весь месяц.
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
            }
        }
    }

    private static void sum3() {
        int thisYear = 2021;
        for (int i = 0; i < thisYear + 79; i++) {
            if (i % 79 == 0 && (thisYear - 200) < i) {
                System.out.println(i);
            }
        }
    }
}

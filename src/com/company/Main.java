package com.company;

public class Main {

    public static void main(String[] args) {
        sum1();     //Задача №1 - проверка результата:
        sum2();     //Задача №2 - проверка результата:
        sum3();     //Задача №3 - проверка результата:
    }

    //Задача №1:
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

    //Задача №2:
    private static void sum2() {
        for (int firstFriday = 4; firstFriday <= 31; firstFriday += 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }
    }

    //Задача №3:
    private static void sum3() {
        int thisYear = 2021;
        for (int i = 0; i < thisYear + 79; i++) {
            if (i % 79 == 0 && (thisYear - 200) < i) {
                System.out.println(i);
            }
        }
    }
}

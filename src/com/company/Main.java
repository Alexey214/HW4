package com.company;

public class Main {

    public static void main(String[] args) {
        sum1();     //Задача №1 - проверка результата:
        sum2();     //Задача №2 - проверка результата:
        sum3();     //Задача №3 - проверка результата:
        sum4();     //Задача №4 - проверка результата:
        sum5();     //Задача №5 - проверка результата:
        sum6();     //Задача №6 - проверка результата:
        sum7();     //Задача №7 - проверка результата:

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

    //Задача №4:
    private static void sum4() {
        int a = 3;
        int b = 5;
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ": ");
            if (i % a == 0 && i % b == 0) {
                System.out.print("ping pong");
            } else if (i % a == 0) {
                System.out.print("ping");
            } else if (i % b == 0) {
                System.out.print("pong");
            }
            System.out.println();
        }
    }

    //Задача №5:
    private static void sum5() {
        int a = 0;
        int b = 1;
        int c = 0;
        int count = 0;
        System.out.print(a + " " + b + " ");
        while (count < 8) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            count++;
        }
        System.out.println();    //чтобы в консоли решение задач разделить))
    }

    //Задача №6:
    private static void sum6() {
        int age = 19;
        double salary = 58_000;
        if (salary >= 50_000 && salary < 80_000) {
            salary = salary * 1.2;
        } else if (salary >= 80_000) {
            salary = salary * 1.5;
        }
        if (age < 23) {
            salary = salary * 2;
        } else {
            salary = salary * 3;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
    }

    //Задача №7:
    private static void sum7() {
        int age = 25;
        double salary = 60_000;
        int wantedSum = 330_000;
        int term = 12;
        double interestRate = 1.1;
        double maxPay = salary * 0.5;
        boolean decision = wantedSum * interestRate <= maxPay * term;
        String s;
        if (age < 23) {
            interestRate += 0.01;
        } else if (age >= 23 && age < 30) {
            interestRate += 0.005;
        }
        if (salary >= 80_000) {
            interestRate -= 0.007;
        }
        if (decision) {
            s = "Одобрено";
        } else {
            s = "Отказано";
        }
        System.out.printf("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. Платеж по кредиту %.1f рублей." + s, (wantedSum * interestRate));

    }
}
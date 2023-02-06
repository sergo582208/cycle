import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task10() {
        int N = 2;
        for(int i = 1; i < 10; i++){
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }

    public static void task8() {
        int cAsh = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + cAsh;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
    }

    public static void task9() {
        int moNey = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = moNey + total;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
    }

    public static void task7() {
        for (int i = 1; i < 1000; i = i * 2) {
            System.out.println (i);
        }
    }

    public static void task6() {
        for (int i = 0; i < 100; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task5() {
        for (int i = 1904; i < 2096; i = i + 4){
            System.out.println("Високосный год " + i);
        }
    }

    public static void task4() {
            for (int i = 10; i > -10; i = i - 1) {
                System.out.println("Число " + i);
            }
    }

    public static void task3() {
        for (int i = 2; i <17; i++)
        if (i % 2 == 0){
            System.out.println("Число " + i);
        }
    }

    public static void task2() {
        for (int i = 11; i > 0; i = i - 1) {
            System.out.println("Число " + i);
        }
    }

    public static void task1() {
        for(int i = 0; i < 11; i++){
            System.out.println("Число " + i);
        }
    }
}
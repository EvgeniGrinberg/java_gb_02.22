package ru.gb.grinberg.homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        }

    public static void printThreeWords() {
        System.out.println(
                "Orange \n" +
                "Banana \n" +
                "Apple");
    }

    public static void checkSumSign() {
        int a = 10, b = -20;
        if (a + b >= 0)
            System.out.println("����� �������������");
        else
            System.out.println("����� �������������");
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0)
            System.out.println("�������");
        if (value > 0 && value <= 100)
            System.out.println("������");
        if (value > 100)
            System.out.println("�������");
    }

    public static void compareNumbers() {
        int a = 10, b = 20;
        if ( a>= b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");

    }
}

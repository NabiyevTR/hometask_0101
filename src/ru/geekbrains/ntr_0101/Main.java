package ru.geekbrains.ntr_0101;

public class Main {

    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {

        // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        boolean bool = true;

        byte byteNumber = 123;
        short shortNumber = 1234;
        int intNumber = 12345;
        long longNumber = 123456L;

        float floatNumber = 3.14f;
        double doubleNumber = Math.PI;

        char character = 't';

        String string = "JAVA - LESSON 1";
    }

    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – входные параметры этого метода;
    public static int calc(int a, int b, int c, int d) {
        return d == 0 ? -1 : a * (b + (c / d));
    }

    // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
    // от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean isSumInRange(int a, int b) {
        return a + b > 10 && a + b <= 20;
    }

    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен
    // напечатать в консоль положительное ли число передали, или отрицательное;
    // Замечание: ноль считаем положительным числом.
    public static void printPosOrNeg(int a) {
        System.out.println(a >= 0 ? "Число положительное" : "Число отрицательное");
    }

    // 6. Написать метод, которому в качестве параметра передается целое число, метод должен
    // вернуть true, если число отрицательное;
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void printHello(String name) {
        System.out.println("Привет, " + name);
    }

    // 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    //    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

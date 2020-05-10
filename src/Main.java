import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte a = 127; //-128 -127
        int b = 28;
        float c = 1;
        double c1 = 1.5;
        char d = 125;
        short e = 200;
        long f = 1000000000;

        String name = "GeekBrains.ru";
        System.out.println("Hello world");
        System.out.println(name);
        System.out.println("I'm " + b + " old");
        System.out.println("float " + c);
        System.out.println("double " + c1);
        System.out.println("char " + d);
        System.out.println("short " + e);
        System.out.println("long " + f);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите 4 числа...");

        System.out.println("Результат = " + function(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));

        System.out.println("Введите 2 числа ");
        System.out.println("Результат =" + task4(scanner.nextInt(), scanner.nextInt()));

        System.out.println("Введите число");
        task5(scanner.nextInt());

        System.out.println("Введите число");
        System.out.println(task6(scanner.nextInt()));

        System.out.println("Введите имя...");
        task7(scanner.next());

        System.out.println("Введите год");
        task8(scanner.nextInt());


    }

    public static double function(double a, double b, double c, double d) {

        double result = a * (b + (c / d));
        return result;

    }

    public static boolean task4(int a, int b) {
        if (a + b > 10 && a + b <= 20) {
            return true;
        } else return false;
    }

    public static void task5(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else System.out.println("Отрицательное");

    }

    public static boolean task6(int a) {
        if (a >= 0) {
            return false;
        } else return true;

    }

    public static void task7(String name) {
        System.out.println("Привет, " + name + "!");

    }

    public static void task8(int year) {
        if (year%4 == 0 && year%100!=0)
            System.out.println("Високосный");
        else System.out.println("Обычный год");
    }
}
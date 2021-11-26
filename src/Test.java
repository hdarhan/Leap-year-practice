import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год в формате \"yyyy\"");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("Високосный год");
        } else if (year % 100 == 0) {
            System.out.println("Не високосный год");
        } else if (year % 4 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }
}
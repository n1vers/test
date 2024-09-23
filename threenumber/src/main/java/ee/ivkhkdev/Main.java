package ee.ivkhkdev;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ведите трехзначное число: ");
        number = scanner.nextInt();
        int units=number % 10;
        int tens =(number/10)%10;
        int hundreds=number/100;
        int sum = units+tens+hundreds;
        System.out.println("Единицы: " + units);
        System.out.println("Десятки: " + tens);
        System.out.println("Сотни: " + hundreds);
        System.out.println("Сумма цифр: " + sum);
    }
}
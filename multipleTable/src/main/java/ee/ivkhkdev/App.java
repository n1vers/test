package ee.ivkhkdev;

import java.util.Random;
import java.util.Scanner;

public class App {

    public void run(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctAnswer = 0;
        for (int i = 0;i < 5;i++){
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            System.out.println("сколько будет " + num1+"*"+num2+"?");
            int answer = scanner.nextInt();
            if (answer == num1 * num2){
                correctAnswer++;
                System.out.println("\u001B[32mПравильно!\u001B[0m");
            } else {
                System.out.println("\u001B[31mОшибка!\u001B[0m");
            }
        }

        System.out.println("\nКоличество правильных ответов: " + correctAnswer);
        if (correctAnswer == 5) {
            System.out.println("Молодец!");
        } else if (correctAnswer >= 3) {
            System.out.println("Надо бы еще поучить.");
        } else {
            System.out.println("Срочно нужно учить таблицу умножения!");
        }
    }
}

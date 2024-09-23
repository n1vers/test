package ee.ivkhkdev;

import java.util.Arrays;
import java.util.Random;

public class App {
    public void run(){
        Random random = new Random();
        int[] number = new int[20];

        for (int i = 0; i < number.length; i++) {
            while (true){
                int num = random.nextInt(100);
                if (num%2 == 0){
                    number[i] = num;
                    break;
                }

            }
            ;
        }
        System.out.println("Array"+ Arrays.toString(number));

        int min = Arrays.stream(number).min().getAsInt();
        int max = Arrays.stream(number).max().getAsInt();

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

        int sum=0;
        int count=0;
        for (int num: number) {
            if (num != min && num != max) {
                sum += num;
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.printf("Среднее арифметическое без учета минимального и максимального: %.2f",average);
    }
}

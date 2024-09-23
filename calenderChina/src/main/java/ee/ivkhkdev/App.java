package ee.ivkhkdev;

import java.util.Scanner;

public class App {
    static String[] colors = {"зеленый", "красный", "желтый", "белый", "черный"};
    static String[] animals = {"крыса", "корова", "тигр", "заяц", "дракон", "змея",
            "лошадь", "овца", "обезьяна", "курица", "собака", "свинья"};

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        int baseYear = 1984;
        int yearOffset = year - baseYear;
        int colorIndex = (yearOffset % 10) / 2;
        int animalIndex = yearOffset % 12;
        String color = colors[colorIndex];
        String animal = animals[animalIndex];
        System.out.println("Год " + color + " "+ animal);
    }
}

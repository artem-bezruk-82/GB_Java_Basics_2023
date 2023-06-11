// Семинар 1
// Задание 1
// 1.1 Написать программу которая ввести имя в консоли? получит введенную строку и выведет приветствие
// 1.2 Дан массив двоичных чисел, например [1,1,0,1,1,1]. Вывести максимальное количество подряд идущих 1/

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main
{
    public static void main(String[] args)
    {
        ShowGreetings();

        byte[] binaryNumbers = {1,1,0,1,0,1,0,0,1,1,0,1,1,1};
        System.out.println(Arrays.toString(binaryNumbers));
        int unitsMax = 0;
        int unitsCounter = 0;
        for (int i = 0; i < binaryNumbers.length; i++) {
            if (binaryNumbers[i] == 1)
            {
                unitsCounter++;
            }
            if (binaryNumbers[i] == 0 || i == binaryNumbers.length - 1) {
                if (unitsCounter > unitsMax)
                {
                    unitsMax = unitsCounter;
                }
                unitsCounter = 0;
            }
        }
        System.out.printf("There are %d placed in a row continuously", unitsMax);

    }

    public static void ShowGreetings()
    {
        System.out.println("Please enter your name");
        Scanner inputConsole = new Scanner(System.in);
        String name = inputConsole.nextLine();
        System.out.printf("Hello, %s and welcome!\n", name);
    }
}
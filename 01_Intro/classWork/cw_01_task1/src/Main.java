// Семинар 1
// Задание 1
// Написать программу которая запрашивает ввести имя в консоли, получает введенную строку и выводит приветствие

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ShowGreetings();
    }

    public static void ShowGreetings()
    {
        System.out.println("Please enter your name");
        Scanner inputConsole = new Scanner(System.in);
        String name = inputConsole.nextLine();
        System.out.printf("Hello, %s and welcome!\n", name);
    }
}
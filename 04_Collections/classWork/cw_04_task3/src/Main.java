// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 4. Хранение и обработка данных ч1: приоритетные коллекции

// Задание 3
// Реализовать консольное приложение, которое принимает от пользователя и запоминает строки.
// Если пользователем введено "print", то выводится список строк так, чтобы последняя введенная строка была первой в выводе,
// а первая введенная строка стока - последней. Структура читится.

import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Stack<String> textStack = new Stack<>();
        String text = "";
        System.out.println("Please enter your text. To show entered text enter [~print]. To exit enter [~exit] command");
        Scanner inputConsole = new Scanner(System.in);
        while (!text.equals("~exit"))
        {
            text = inputConsole.nextLine();
            if (!text.equals("~exit"))
            {
                if (text.equals("~print"))
                {
                    while (!textStack.empty())
                    {
                        System.out.println(textStack.pop());
                    }
                }
                else
                {
                    textStack.push(text);
                    System.out.println(textStack);
                }
            }
        }
    }
}
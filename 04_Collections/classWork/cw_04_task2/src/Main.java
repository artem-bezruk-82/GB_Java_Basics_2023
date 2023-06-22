// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 4. Хранение и обработка данных ч1: приоритетные коллекции

// Задание 2
// Реализовать консольное приложение, которое:
// Принимает от позьзователя любой текст
// Нужно сохранить текст в связный список
// Если введено print~num, выводит строку из num в связном списке и удаляет ее из списка

import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<String> textList = new LinkedList<>();
        String text = "";
        System.out.println("Please enter your text. To delete entered text enter [print~num]. To exit enter [~exit] command");
        Scanner inputConsole = new Scanner(System.in);
        while (!text.equals("~exit"))
        {
            text = inputConsole.nextLine();
            if (!text.equals("~exit"))
            {
                if (text.startsWith("print~"))
                {
                    text = text.replace("print~", "");
                    try
                    {
                        int line = Integer.parseInt(text);
                        System.out.println(textList.get(line));
                        if (line >= 0 && line < textList.size())
                        {
                            textList.remove(line);
                        }
                    }
                    catch (Exception exception)
                    {
                        System.out.println(exception.getMessage());
                    }

                } else
                {
                    textList.add(text);
                }
            }
        }

        for (String line : textList)
        {
            System.out.println(line);
        }

    }
}
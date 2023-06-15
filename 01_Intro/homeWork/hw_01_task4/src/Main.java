// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 1. Знакомство с языком программирования Java
// Домашняя работа

// Задание 4 Задано уравнение вида q + w = e,
// q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства. Знаки вопроса - одинаковые цифры.
// Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        String input = "2? + ?5 = 69";
        System.out.println(input);
        input = input.replace(" ", "");
        input = input.replace("-","+-");
        input = input.trim();
        String[] arr = input.split("=");
        int result = Integer.parseInt(arr[1]);
        arr = arr[0].split("\\+");
        int leftValue = ParseValueInt(arr[0]);
        int rightValue = ParseValueInt(arr[1]);
        int leftValueDelta = leftValue >= 10 ? 1 : 10;
        int rightValueDelta = rightValue >= 10 ? 1 : 10;
        ArrayList<String> solutions = new ArrayList<String>();
        for (int i = 1; i <= 9; i++)
        {
            int leftVal = leftValue + i* leftValueDelta;
            int rightVal = rightValue + i * rightValueDelta;
            if (leftVal + rightVal == result)
                solutions.add(String.format("%d + %d = %d", leftVal, rightVal, result));
        }
        if (solutions.size() > 0)
        {
            for (String item : solutions)
                System.out.println(item);
        } else
        {
            System.out.println("There are no solutions exist");
        }

    }

    public static int ParseValueInt(String str)
    {
        if (str.charAt(1) == '?')
            return Character.getNumericValue(str.charAt(0)) * 10;
        if (str.charAt(0) == '?')
            return Character.getNumericValue(str.charAt(1));
        return Integer.parseInt(str);
    }
}
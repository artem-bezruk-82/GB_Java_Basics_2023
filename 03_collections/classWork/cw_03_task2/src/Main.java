// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 3. Коллекции

// Задание 2
// Заполнить список десятью случайными числами. Отсортировать список и вывести на экран.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> values = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++)
        {
            values.add(random.nextInt(100));
        }
        values.sort(Comparator.naturalOrder());

        System.out.println(values);
    }
}
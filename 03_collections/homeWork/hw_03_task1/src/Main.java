// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 3. Коллекции
//Домашняя работа

//Задание
//Пусть дан произвольный список целых чисел.
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> values = new ArrayList<>();
        Random random = new Random();
        int size = random.nextInt(15,30);
        for (int i = 0; i < size; i++)
        {
            values.add(random.nextInt(100));
        }
        System.out.println(values);
        values.removeIf(value -> (value % 2 == 0));
        System.out.println(values);
        if (!values.isEmpty())
        {
            values.sort(Comparator.naturalOrder());
            int sum = 0;
            for (int i = 0; i < values.size(); i++)
            {
                sum += values.get(i);
            }
            System.out.printf(String.format("Max value: %d; Min Value: %d; Avg value: %f",
                    values.get(values.size() -1), values.get(0), (double) sum/values.size()));
        } else
        {
            System.out.println("The list is empty");
        }


    }
}
// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 6. Хранение и обработка данных ч3: множество коллекций Set

// Задание 1
// Написать метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 50
// Вычислить процент уникальных значений в массиве

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = new int[1000];
        FillInArrayRandomly(arr, 0, 50);
        double uniqueValuesPercentage = 100 * (double)GetNumberOfUniqueValues(arr) / arr.length;
        System.out.printf("Unique values percentage: %f", uniqueValuesPercentage);

    }

    public static int GetNumberOfUniqueValues(int[] array)
    {
        Set<Integer> set = new HashSet<>();
        for (int j : array)
            set.add(j);

        return set.size();
    }

    public static void FillInArrayRandomly(int[] array, int startRange, int endRange)
    {
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(startRange, endRange);
        }
    }
}
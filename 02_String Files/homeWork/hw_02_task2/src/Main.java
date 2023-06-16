// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 2. Строки. Файлы. Исключения.
// Домашняя работа

// Задание 2
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.


import java.util.Arrays;
import java.io.FileWriter;

public class Main
{
    public static void main(String[] args)
    {
        String filePath = "log.txt";

        int[] arr = {7, 4, 8, 2, 19, 34, 12, 6, 1, 3};
        System.out.println(Arrays.toString(arr));
        for (int write = 0; write < arr.length; write++)
        {
            for (int sort = 0; sort < arr.length - 1; sort++)
            {
                if (arr[sort] > arr[sort + 1]) {
                    int temp = arr[sort + 1];
                    arr[sort + 1] = arr[sort];
                    arr[sort] = temp;
                }
            }
            LogToFile(filePath, Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void LogToFile(String filePath, String logText)
    {
        try
        {
            FileWriter fileWriter = new FileWriter(filePath , true);
            fileWriter.write(String.format("%s\n", logText));
            fileWriter.close();
        }
        catch (Exception exc)
        {
            System.out.println(exc.getMessage());
        }
    }
}
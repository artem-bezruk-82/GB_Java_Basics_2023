// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 2. Строки. Файлы. Исключения.

// Задание 3
// Записать слово "Test" в файл 10 раз

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main
{
    public static void main(String[] args)
    {
        //Write to file
        int n = 10;
        String text = "Test";
        String filePath = "test.txt";
        try
        {
            FileWriter fileWriter = new FileWriter(filePath , false); // false - rewrite; true - enables append;
            for (int i = 0; i < n; i++)
            {
                fileWriter.write(String.format("%s\n", text));
            }
            fileWriter.close();
        }
        catch (Exception exc)
        {
            System.out.println(exc.getMessage());
        }

        //Read from file
        File file = new File(filePath);
        try
        {
            FileReader fileReader = new FileReader(file);
            char[] arr = new char[(int)file.length()];
            fileReader.read(arr);
            fileReader.close();
            for (char c : arr)
            {
                System.out.print(c);
            }
        }
        catch (Exception exc)
        {
            System.out.println(exc.getMessage());
        }

    }
}
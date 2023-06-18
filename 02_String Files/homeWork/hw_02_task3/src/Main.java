// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 2. Строки. Файлы. Исключения.
// Домашняя работа

// Задание 3
// Дана строка (сохранить в файл и читать из файла)
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class Main
{
    public static void main(String[] args)
    {
        String filePath = "scores.json";
        try
        {
            String textJson = GetJsonTextFromFile(filePath);
            String[] recordsArr = GetRecordsArray(textJson);
            for (int i = 0; i < recordsArr.length; i++) {
                Student student = GetStudent(recordsArr[i]);
                System.out.println(student);
            }
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    public static Student GetStudent(String jsonObjString)
    {
        Student student = new Student();
        String[] fields = jsonObjString.split(",");
        for (int i = 0; i < fields.length; i++) {
            String[] field = fields[i].split(":");
            if (i == 0)
            {
                student.setSurname(field[1]);
            }
            if (i == 1)
            {
                student.setScore(Integer.parseInt(field[1]));
            }
            if (i == 2)
            {
                student.setSubject(field[1]);
            }
        }
        return student;
    }

    public static String[] GetRecordsArray(String textJson)
    {
        String[] recordsArray = textJson.split("},");
        for (int i = 0; i < recordsArray.length; i++)
        {
            recordsArray[i] = recordsArray[i].replace("{","").replace("}","").replace("\"", "");
        }
        return recordsArray;
    }

    public static String GetJsonTextFromFile(String filePath) throws IOException
    {
        File file = new File(filePath);
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                sb.append(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return sb.toString().replace("[","").replace("]","");
    }
}
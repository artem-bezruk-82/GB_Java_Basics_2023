// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 2. Строки. Файлы. Исключения.
// Домашняя работа

// Задание 1
// Дана строка sql-запроса "select * from students WHERE ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// String input_str = "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}"
// Ввод данных: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow

package org.example;

import com.google.gson.Gson;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<SelectStudent> objects =  new ArrayList<>();
        objects.add(new SelectStudent("Artem", "Russia", "Voronezh", 40));
        objects.add(new SelectStudent("Misha", "Russia", null, 45));
        objects.add(new SelectStudent("kolya", "Russia", "Moscow", null));
        objects.add(new SelectStudent("Gurgen", null, "Moscow", null));

        ArrayList<String> stringsGSON = new ArrayList<>();

        Gson jsonObject = new Gson();

        for(SelectStudent item : objects)
            stringsGSON.add(jsonObject.toJson(item));

        System.out.println("To JSON strings");
        for (String stringGSON : stringsGSON)
            System.out.println(stringGSON);

        System.out.println("From JSON strings");
        for (String stringGSON : stringsGSON)
        {
            SelectStudent object = jsonObject.fromJson(stringGSON, SelectStudent.class);
            System.out.println(object);
        }
    }
}
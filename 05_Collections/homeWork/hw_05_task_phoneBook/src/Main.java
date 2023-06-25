// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 5. Хранение и обработка данных ч2: множество коллекций Map
// Домашняя работа

//Задание
//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.
//Пример:
//Иванов 1231234
//Иванов 3456345
//Иванов 5676585
//Петров 1234598
//Петров 8233211
//Сидоров 4268913

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        CreateNewContact(phoneBook, "Ivanov");
        AddNewNumber(phoneBook, "Ivanov", 1231234);
        AddNewNumber(phoneBook, "Ivanov", 3456345);
        AddNewNumber(phoneBook, "Ivanov", 5676585);

        CreateNewContact(phoneBook, "Petrov");
        AddNewNumber(phoneBook, "Petrov", 1234598);
        AddNewNumber(phoneBook, "Petrov", 8233211);

        CreateNewContact(phoneBook, "Sidorov");
        AddNewNumber(phoneBook, "Sidorov", 4268913);

        PrintPhoneBook(phoneBook);
    }

    public static void PrintPhoneBook(Map<String, ArrayList<Integer>> phoneBook)
    {
        Map<String, Integer> temp = new HashMap<>();

        for (Map.Entry<String, ArrayList<Integer>> item : phoneBook.entrySet())
            temp.put(item.getKey(), item.getValue().size());

        List<Map.Entry<String, Integer>> list = new ArrayList<>(temp.entrySet());
        list.sort(Map.Entry.comparingByValue());


        for (int i = list.size() - 1; i >= 0; i--)
        {
            System.out.printf("%s: ", list.get(i).getKey());
            System.out.println(phoneBook.get(list.get(i).getKey()));
        }

    }

    public static void CreateNewContact(Map<String, ArrayList<Integer>> phoneBook, String name)
    {
        phoneBook.put(name, new ArrayList<Integer>());
    }

    public static void AddNewNumber(Map<String, ArrayList<Integer>> phoneBook, String name, int number)
    {
        if (!phoneBook.containsKey(name))
            CreateNewContact(phoneBook, name);

        phoneBook.get(name).add(number);
    }
}
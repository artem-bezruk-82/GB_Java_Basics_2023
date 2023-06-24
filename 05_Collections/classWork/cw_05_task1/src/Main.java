// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 5. Хранение и обработка данных ч2: множество коллекций Map

// Задание 1
// Создать структуру данных для хранения номеров паспортов и фамилий сотрудников организации
// Вывести записи сотрудников с Фамилией Иванов

import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> passports = new HashMap<>();
        passports.put(123456, "Ivanov");
        passports.put(321456, "Vasiliev");
        passports.put(234561, "Petrova");
        passports.put(234432, "Ivanov");
        passports.put(654321, "Petrova");
        passports.put(345768, "Ivanov");

        for (Map.Entry<Integer, String> passport : passports.entrySet())
        {
            if (passport.getValue() == "Ivanov")
            {
                System.out.printf("Passport: %d; Name: %s\n", passport.getKey(), passport.getValue());
            }
        }

    }
}
// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 3. Коллекции

// Задание 1
// Заполнить список названиями планет солнечной системы в произвольном порядке с повторами.
// Вывести название каждой планеты и количество повторов

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Main
{
    public static void main(String[] args)
    {
        String[] planetsArr =
                {
                        "Mercury"
                        ,"Venus"
                        ,"Earth"
                        ,"Mars"
                        ,"Jupiter"
                        ,"Saturn"
                        ,"Uranus"
                        ,"Neptune"
                };

        ArrayList<String> planetsLst = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, planetsArr.length -1 + 1);
            planetsLst.add(planetsArr[randomNum]);
        }

        Map<String, Integer> planetsDict = new HashMap<>();

        for (String planet : planetsLst)
        {
            planetsDict.putIfAbsent(planet,0);
            if (planetsDict.containsKey(planet))
                planetsDict.put(planet, planetsDict.get(planet) + 1);
        }

        for(Map.Entry<String, Integer> item : planetsDict.entrySet())
        {
            System.out.printf("%s - %d \n", item.getKey(), item.getValue());
        }
    }
}
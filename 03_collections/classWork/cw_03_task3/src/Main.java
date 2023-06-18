// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 3. Коллекции

// Задание 3
// Создать список ArrayList. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.


import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add("Moscow");
        arrayList.add(10);
        arrayList.add("Sochi");
        arrayList.add("Lipetsk");
        arrayList.add(20);
        arrayList.add("Voronezh");
        arrayList.add(5);
        arrayList.add(55);
        arrayList.add("Tula");

        System.out.println(arrayList);
        arrayList.removeIf(item -> (item instanceof Integer));
        System.out.println(arrayList);

    }
}
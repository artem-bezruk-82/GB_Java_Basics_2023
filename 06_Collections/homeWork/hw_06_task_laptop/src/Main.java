// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 6. Хранение и обработка данных ч2: множество коллекций Set
// Домашняя работа

//Задание
// Реализовать в java класс Ноутбук для магазина техники - выделить поля и методы.
// оздать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД hd hdd
// 3 - Операционная система
// 4 - Цвет
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(8, 256, Laptop.OSEnum.Windows, Laptop.ColorsEnum.Blue));
        laptops.add(new Laptop(16, 512, Laptop.OSEnum.Windows, Laptop.ColorsEnum.Green));
        laptops.add(new Laptop(32, 1024, Laptop.OSEnum.Windows, Laptop.ColorsEnum.Gray));
        laptops.add(new Laptop(8, 256, Laptop.OSEnum.Windows, Laptop.ColorsEnum.White));
        laptops.add(new Laptop(16, 512, Laptop.OSEnum.Windows, Laptop.ColorsEnum.Red));
        laptops.add(new Laptop(16, 512, Laptop.OSEnum.Windows, Laptop.ColorsEnum.Black));
        laptops.add(new Laptop(32, 1024, Laptop.OSEnum.Ubuntu, Laptop.ColorsEnum.Blue));
        laptops.add(new Laptop(8, 256, Laptop.OSEnum.Ubuntu, Laptop.ColorsEnum.Green));
        laptops.add(new Laptop(16, 512, Laptop.OSEnum.Ubuntu, Laptop.ColorsEnum.Gray));
        laptops.add(new Laptop(32, 1024, Laptop.OSEnum.Ubuntu, Laptop.ColorsEnum.White));
        laptops.add(new Laptop(8, 256, Laptop.OSEnum.Ubuntu, Laptop.ColorsEnum.Red));
        laptops.add(new Laptop(16, 512, Laptop.OSEnum.Ubuntu, Laptop.ColorsEnum.Black));

        Laptop filter = new Laptop();
        LaptopExt.SetLaptopConsole(filter);
        System.out.println(filter);

        for (Laptop laptop : laptops)
        {
            if (filter.GetOs() == Laptop.OSEnum.Undefined && filter.GetColor() == Laptop.ColorsEnum.Undefined)
            {
                if (laptop.GetRamCapacityGb() >= filter.GetRamCapacityGb() &&
                        laptop.GetHddCapacityGb() >= filter.GetHddCapacityGb())
                    System.out.println(laptop);
            }

            if (filter.GetOs() != Laptop.OSEnum.Undefined && filter.GetColor() == Laptop.ColorsEnum.Undefined)
            {
                if (laptop.GetRamCapacityGb() >= filter.GetRamCapacityGb() &&
                        laptop.GetHddCapacityGb() >= filter.GetHddCapacityGb() &&
                        laptop.GetOs() == filter.GetOs())
                    System.out.println(laptop);
            }

            if (filter.GetOs() == Laptop.OSEnum.Undefined && filter.GetColor() != Laptop.ColorsEnum.Undefined)
            {
                if (laptop.GetRamCapacityGb() >= filter.GetRamCapacityGb() &&
                        laptop.GetHddCapacityGb() >= filter.GetHddCapacityGb() &&
                        laptop.GetColor() == filter.GetColor())
                    System.out.println(laptop);
            }

            if (filter.GetOs() != Laptop.OSEnum.Undefined && filter.GetColor() != Laptop.ColorsEnum.Undefined)
            {
                if (laptop.GetRamCapacityGb() >= filter.GetRamCapacityGb() &&
                        laptop.GetHddCapacityGb() >= filter.GetHddCapacityGb() &&
                        laptop.GetColor() == filter.GetColor() &&
                        laptop.GetOs() == filter.GetOs())
                    System.out.println(laptop);
            }

        }
    }
}
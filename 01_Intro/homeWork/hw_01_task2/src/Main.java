// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 1. Знакомство с языком программирования Java
// Домашняя работа
// Задание 2
// Вывести все простые числа от 1 до 1000

public class Main
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 1000; i++) {
            if (IsPrime(i))
                System.out.println(i);
        }
    }

    public static boolean IsPrime(int value)
    {
        int val = Math.abs(value);
        if (val < 2)
            return false;
        for (int i = 2; i < Math.sqrt(val); i++)
        {
           if (val % i == 0)
               return false;
        }
        return true;
    }
}
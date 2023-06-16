// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 2. Строки. Файлы. Исключения.

// Задание 1
// Дано четное число N>0 и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая сотоит из чередующихся символов c1 и c2, насия с c2.

import java.lang.StringBuilder;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(GetInterleavedSequence('#', '@', 10));
    }

    public static String GetInterleavedSequence(char symbolFirst, char symbolSecond, int length)
    {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < sb.capacity(); i++) {
            sb.append(i % 2 == 0 ? symbolFirst : symbolSecond);
        }
        return sb.toString();
    }


}
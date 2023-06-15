// Урок 1. Знакомство с языком программирования Java
// Задание 1
// Вычислить n-ое треугольного число (сумма чисел от 1 до n)
// n! (произведение чисел от 1 до n)


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int num = GetConsoleInputInt("Please enter integer value", 0);
        System.out.printf("sum(1...%d) = %d\n", num, GetTriangularNumber(num));
        System.out.printf("%d! = %d\n", num, GetFactorial(num));
    }

    public static int GetFactorial(int value)
    {
        int factorial = 1;
        for (int i = 1; i <= value; i++)
            factorial *= i;
        return factorial;
    }

    public static int GetTriangularNumber(int value)
    {
        int triangularNumber = 0;
        for (int i = 0; i <= value; i++)
            triangularNumber += i;
        return triangularNumber;
    }


    public static int GetConsoleInputInt(String requestText, int startRange)
    {
        return GetConsoleInputInt(requestText, startRange, Integer.MAX_VALUE);
    }

    public static int GetConsoleInputInt(String requestText, int startRange, int endRange)
    {
        Scanner consoleInput = new Scanner(System.in);
        int value;
        do
        {
            System.out.println(requestText);
            while (!consoleInput.hasNextInt())
            {
                System.out.printf("Entered value is not integer type. %s\n", requestText);
                consoleInput.next();
            }
            value = consoleInput.nextInt();
            if (value < startRange || value > endRange)
            {
                System.out.printf("Entered value is out of %d...%d range. %s\n", startRange, endRange, requestText);
            }
        } while (value < startRange || value > endRange);
        return value;
    }
}
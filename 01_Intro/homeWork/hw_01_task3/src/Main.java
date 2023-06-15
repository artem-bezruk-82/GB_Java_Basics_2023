// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 2. Знакомство с языком программирования Java
// Домашняя работа

// Задание 3
// Реализовать простой калькулятор


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double valueLeft = GetConsoleInputDouble("Please enter first value");
        System.out.println(valueLeft);

        System.out.println("Please enter operation [+, -, *, /]");
        Scanner consoleInput = new Scanner(System.in);
        char operation = (consoleInput.next().trim().toCharArray())[0];

        double valueRight = GetConsoleInputDouble("Please enter second value");
        System.out.println(valueRight);

        try
        {
            double result = GetCalculationResult(valueLeft, valueRight, operation);
            System.out.printf("%f %s %f = %f", valueLeft, operation, valueRight, result);
        }
        catch (Exception exc)
        {
            System.out.println(exc.getMessage());
        }
    }

    public static double GetCalculationResult (double valueLeft, double valueRight, char operation) throws Exception
    {
        return switch (operation)
        {
            case '+' ->
                valueLeft + valueRight;
            case '-'->
                valueLeft - valueRight;
            case '*'->
                valueLeft * valueRight;
            case '/'->
                valueLeft / valueRight;
            default ->
                throw new Exception("Invalid operation. The only +, -, *, / are supported");
        };
    }


    public static double GetConsoleInputDouble(String requestText)
    {
        Scanner consoleInput = new Scanner(System.in);

        System.out.println(requestText);
        while (!consoleInput.hasNextDouble())
        {
            System.out.printf("Entered value is not a number. %s\n", requestText);
            consoleInput.next();
        }
        return consoleInput.nextInt();
    }

}


// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 2. Строки. Файлы. Исключения.

// Задание 2
// Напишите метод сжатия строки "aaaabbbcddaa" до "a4b3cd2a2"

public class Main
{
    public static void main(String[] args)
    {
        String str = "aaaabbbcddaa";
        System.out.println(str);
        System.out.println(GetStringShrunk(str));
    }

    public static String GetStringShrunk(String str)
    {
        if (str.isEmpty())
            return str;
        StringBuilder sb = new StringBuilder();
        char currentSymbol = str.charAt(0);
        int symbolCounter = 1;
        for (int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == currentSymbol)
            {
                symbolCounter++;
            }
            if (str.charAt(i) != currentSymbol || i == str.length() - 1)
            {
                sb.append(currentSymbol);
                if (symbolCounter > 1)
                    sb.append(symbolCounter);
                currentSymbol = str.charAt(i);
                symbolCounter = 1;
            }
        }
        return sb.toString();
    }
}
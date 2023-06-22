// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 4. Хранение и обработка данных ч1: приоритетные коллекции

// Задание 4
// Метод, который принимает на вход массив едлементов, которые помещает в очередь и выводит в консоль


import java.util.LinkedList;
import java.util.Queue;

public class Main
{
    public static void main(String[] args)
    {
        String[] text = {"qwer", "rewq", "asdf", "fdsa"};
        Queue<String> testQueue = ArrayToQue(text);
        System.out.println(testQueue);
    }

    public static Queue<String> ArrayToQue(String[] array)
    {
        Queue<String> queue = new LinkedList<>();
        for(String line : array)
        {
            queue.add(line);
        }
        return queue;
    }
}
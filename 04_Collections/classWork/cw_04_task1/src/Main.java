// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 4. Хранение и обработка данных ч1: приоритетные коллекции

// Задание 1
// Замерить время, за которое в ArrayList добявятся 1 000 000 элементов
// Замерить время, за которое в LinkedList добявятся 1 000 000  элементов
// Сравнить время


import java.util.ArrayList;
import java.util.LinkedList;


public class Main
{
    public static void main(String[] args)
    {

        int numberOfElements = 10_000_000;
        System.out.printf("\n*** Test push back %d elements***\n", numberOfElements);
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfElements; i++)
        {
            arrayList.add(i);
        }
        long stopTime = System.currentTimeMillis();

        long arrayListTime = stopTime - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfElements; i++)
        {
            linkedList.add(i);
        }
        stopTime = System.currentTimeMillis();
        long linkedListTime = stopTime - startTime;
        System.out.printf("Array List filled in within %d ms" +
                "\nLinked list filled in within %d ms" +
                "\nDifference is %d ms", arrayListTime, linkedListTime, linkedListTime - arrayListTime);

        arrayList.clear();
        linkedList.clear();

        numberOfElements = 100_000;
        System.out.printf("\n*** Test push front &d ***\n", numberOfElements);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfElements; i++)
        {
            arrayList.add(0, i);
        }
        stopTime = System.currentTimeMillis();

        arrayListTime = stopTime - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfElements; i++)
        {
            linkedList.add(0, i);
        }
        stopTime = System.currentTimeMillis();
        linkedListTime = stopTime - startTime;
        System.out.printf("Array List filled in within %d ms" +
                "\nLinked list filled in within %d ms" +
                "\nDifference is %d ms", arrayListTime, linkedListTime, linkedListTime - arrayListTime);
    }
}
// Курс: Java. Знакомство и как пользоваться базовым API
// Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
//Домашняя работа

// Задание
// Даны два Deque, представляющие два целых числа.
// Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// Умножьте два числа и верните произведение в виде связанного списка.
// Сложите два числа и верните сумму в виде связанного списка.


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Random;
import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {
        ArrayDeque<Character> leftValueDeque = GetDequeRandomIntValue(3,6);
        ArrayDeque<Character> rightValueDeque = GetDequeRandomIntValue(3,6);
        System.out.println(leftValueDeque);
        System.out.println(rightValueDeque);
        int leftValue = DequeCharToInteger(leftValueDeque);
        int rightValue = DequeCharToInteger(rightValueDeque);
        int sum = leftValue + rightValue;
        int mult = leftValue * rightValue;
        System.out.printf("%d + %d = %d\n", leftValue, rightValue, sum);
        System.out.printf("%d * %d = %d\n", leftValue, rightValue, mult);
        LinkedList<Character> sumLinkedList = IntegerToLinkedList(sum);
        LinkedList<Character> multLinkedList = IntegerToLinkedList(mult);
        System.out.println(sumLinkedList);
        System.out.println(multLinkedList);

    }

    public static LinkedList<Character> IntegerToLinkedList(int value)
    {
        String valueStr = Integer.toString(value);
        LinkedList<Character> linkedList = new LinkedList<>();
        for (int i = 0; i < valueStr.length(); i++)
        {
            linkedList.add(valueStr.charAt(i));
        }
        return linkedList;
    }

    public static int DequeCharToInteger(ArrayDeque<Character> arrayDeque)
    {
        StringBuilder sb = new StringBuilder();
        Iterator<Character> itr = arrayDeque.descendingIterator();

        while (itr.hasNext())
            sb.append(itr.next());

        return Integer.parseInt(sb.toString());
    }

    public static ArrayDeque<Character> GetDequeRandomIntValue(int lengthMin, int lengthMax)
    {
        ArrayDeque<Character> dequeRandomValue = new ArrayDeque<>();
        Random random = new Random();
        int digits = random.nextInt(lengthMin,lengthMax);
        for (int i = 0; i < digits - 1; i++)
        {
            dequeRandomValue.addLast(Character.forDigit(random.nextInt(0,9), 10));
        }
        dequeRandomValue.addLast(Character.forDigit(random.nextInt(1,9), 10));
        if (random.nextInt() < 0)
        {
            dequeRandomValue.addLast('-');
        }
        return dequeRandomValue;
    }
}
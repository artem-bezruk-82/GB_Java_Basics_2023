// Семинар 1
// Задание 3
// Дан массив целых чисел и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти лементы в конец массива 01%03

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 3, 6, 7, 3, 8, 9};
        int val = 3;
        System.out.println(Arrays.toString(arr));
        UpdateArray(arr, val);
        System.out.println(Arrays.toString(arr));
    }

    public static void UpdateArray(int[] array, int value)
    {
        int[] arrayTemp = Arrays.copyOf(array, array.length);
        Arrays.fill(array, value);
        int arrayIndex = 0;
        for (int i = 0; i < arrayTemp.length; i++)
        {
            if (arrayTemp[i] != value)
            {
                array[arrayIndex] = arrayTemp[i];
                arrayIndex++;
            }
        }
    }
}
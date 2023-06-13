// Семинар 1
// Задание 2
// Дан массив двоичных чисел, например [1,1,0,1,1,1].
// ывести максимальное количество подряд идущих 1

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        byte[] binaryNumbers = {1,1,0,1,0,1,0,0,1,1,0,1,1,1};
        System.out.println(Arrays.toString(binaryNumbers));
        int unitsMax = 0;
        int unitsCounter = 0;
        for (int i = 0; i < binaryNumbers.length; i++) {
            if (binaryNumbers[i] == 1)
            {
                unitsCounter++;
            }
            if (binaryNumbers[i] == 0 || i == binaryNumbers.length - 1) {
                if (unitsCounter > unitsMax)
                {
                    unitsMax = unitsCounter;
                }
                unitsCounter = 0;
            }
        }
        System.out.printf("There are %d units placed in a row continuously", unitsMax);
    }
}
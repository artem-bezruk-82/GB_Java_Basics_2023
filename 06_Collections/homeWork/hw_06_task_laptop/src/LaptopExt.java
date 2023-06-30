import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LaptopExt
{
    public static void SetLaptopConsole(Laptop laptop)
    {
        Map<Integer, String> menu = new HashMap<>();
        menu.put(0, "APPLY");
        menu.put(1, "Define RAM capacity");
        menu.put(2, "Define HDD capacity");
        menu.put(3, "Define preferred OS");
        menu.put(4, "Define desirable color");

        int menuItem = -1;

        while (menuItem != 0)
        {
            System.out.println("Laptop settings menu");
            for (Map.Entry<Integer, String> item : menu.entrySet())
                System.out.printf("\t%d - %s\n", item.getKey(), item.getValue());

            menuItem = GetConsoleInputInt("Please chose laptop parameter", 0, menu.size());

            switch (menuItem)
            {
                case 1:
                    SetRamConsole(laptop);
                    break;
                case 2:
                    SetHddConsole(laptop);
                    break;
                case 3:
                    SetOsConsole(laptop);
                    break;
                case 4:
                    SetColorConsole(laptop);
                    break;
                default:
                    break;
            }
        }

    }
    public static void SetRamConsole(Laptop laptop)
    {
        String prompt = String.format("Please enter RAM capacity, Gb: %s", Arrays.toString(Laptop.GetRamCapacityValues()));
        int ramCapacity = GetConsoleInputInt(prompt, Laptop.GetRamCapacityValues()[0],
                Laptop.GetRamCapacityValues()[Laptop.GetRamCapacityValues().length - 1]);

        try
        {
            laptop.SetRamCapacityGb(ramCapacity);
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    public static void SetHddConsole(Laptop laptop)
    {
        String prompt = String.format("Please enter HDD capacity, Gb: %s", Arrays.toString(Laptop.GetHddCapacityValues()));
        int hddCapacity = GetConsoleInputInt(prompt, Laptop.GetHddCapacityValues()[0],
                Laptop.GetHddCapacityValues()[Laptop.GetHddCapacityValues().length - 1]);

        try
        {
            laptop.SetHddCapacityGb(hddCapacity);
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    public static void SetOsConsole(Laptop laptop)
    {
        System.out.println("OS setting menu:");
        for (Laptop.OSEnum item : Laptop.OSEnum.values())
            System.out.printf("\t%d - %s\n", item.ordinal(), item);

        int osId = GetConsoleInputInt("Please chose OS",
                Laptop.OSEnum.Undefined.ordinal(), Laptop.OSEnum.values().length);

        switch (osId)
        {
            case 0:
                laptop.SetOs(Laptop.OSEnum.Undefined);
                break;
            case 1:
                laptop.SetOs(Laptop.OSEnum.Windows);
                break;
            case 2:
                laptop.SetOs(Laptop.OSEnum.Ubuntu);
                break;
            case 3:
                laptop.SetOs(Laptop.OSEnum.Astra);
                break;
            default:
                break;
        }
    }

    public static void SetColorConsole(Laptop laptop)
    {
        System.out.println("Color setting menu:");
        for (Laptop.ColorsEnum item : Laptop.ColorsEnum.values())
            System.out.printf("\t%d - %s\n", item.ordinal(), item);

        int colorId = GetConsoleInputInt("Please chose color",
                Laptop.ColorsEnum.Undefined.ordinal(), Laptop.ColorsEnum.values().length);

        switch (colorId)
        {
            case 0:
                laptop.SetColor(Laptop.ColorsEnum.Undefined);
                break;
            case 1:
                laptop.SetColor(Laptop.ColorsEnum.Green);
                break;
            case 2:
                laptop.SetColor(Laptop.ColorsEnum.Blue);
                break;
            case 3:
                laptop.SetColor(Laptop.ColorsEnum.Red);
                break;
            case 4:
                laptop.SetColor(Laptop.ColorsEnum.White);
                break;
            case 5:
                laptop.SetColor(Laptop.ColorsEnum.Black);
                break;
            case 6:
                laptop.SetColor(Laptop.ColorsEnum.Gray);
                break;
            default:
                break;
        }
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

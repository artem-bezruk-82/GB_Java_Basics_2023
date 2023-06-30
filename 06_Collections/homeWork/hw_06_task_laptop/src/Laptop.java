import java.util.Arrays;

public class Laptop
{
    public enum OSEnum
    {
        Undefined,
        Windows,
        Ubuntu,
        Astra
    }

    public enum ColorsEnum
    {
        Undefined,
        Green,
        Blue,
        Red,
        White,
        Black,
        Gray
    }

    private static int[] ramCapacityValues = {4, 8, 16, 32, 64};
    private static int[] hddCapacityValues = {128, 256, 512, 1024, 2000, 3000};

    private int _ramCapacityGb;
    private int _hddCapacityGb;
    private OSEnum _os;

    private ColorsEnum _color;

    public Laptop(int ramCapacityGb, int hddCapacityGb, OSEnum os, ColorsEnum color)
    {
        try
        {
            SetRamCapacityGb(ramCapacityGb);
            SetHddCapacityGb(hddCapacityGb);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        _os = os;
        _color = color;
    }

    public Laptop()
    {
        this(ramCapacityValues[0], hddCapacityValues[0], OSEnum.Undefined, ColorsEnum.Undefined);
    }

    public int GetRamCapacityGb() {return _ramCapacityGb;}
    public int GetHddCapacityGb() {return _hddCapacityGb;}
    public OSEnum GetOs() {return _os;}
    public ColorsEnum GetColor() {return _color;}

    public static int[] GetRamCapacityValues() {return ramCapacityValues;}
    public static int[] GetHddCapacityValues() {return hddCapacityValues;}

    public void SetRamCapacityGb(int ramCapacityGb) throws Exception
    {
        if (Arrays.binarySearch(ramCapacityValues, ramCapacityGb) >= 0)
            _ramCapacityGb = ramCapacityGb;
        else
            throw new Exception(String.format("Capacity is out of supported set: %s",Arrays.toString(ramCapacityValues)));
    }

    public void SetHddCapacityGb(int hddCapacityGb) throws Exception
    {
        if (Arrays.binarySearch(hddCapacityValues, hddCapacityGb) >= 0)
            _hddCapacityGb = hddCapacityGb;
        else
            throw new Exception(String.format("Capacity is out of supported set: %s",Arrays.toString(hddCapacityValues)));
    }

    public void SetOs(OSEnum os) {_os = os;}
    public void SetColor(ColorsEnum color) {_color = color;}

    @Override
    public String toString()
    {
        return String.format("RAM, Gb: %d; HDD, Gb: %d; OS: %s; Color: %s", _ramCapacityGb, _hddCapacityGb, _os, _color);
    }
}

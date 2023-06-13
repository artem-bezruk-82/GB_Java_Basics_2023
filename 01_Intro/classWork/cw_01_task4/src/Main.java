// Семинар 1
// Задание 4
// Переставьте слова обратном порядке


public class Main
{
    public static void main(String[] args)
    {
        String textStr = "Welcome to our Java Basic course";
        System.out.println(textStr);
        String[] textArr = textStr.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = textArr.length -1; i >= 0; i--)
        {
            sb.append(String.format("%s ",textArr[i]));
        }
        sb.deleteCharAt(sb.length() -1);
        textStr = sb.toString();
        System.out.println(textStr);
    }
}
package org.example;

import com.google.gson.Gson;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<SelectStudent> objects =  new ArrayList<>();
        objects.add(new SelectStudent("Artem", "Russia", "Voronezh", 40));
        objects.add(new SelectStudent("Misha", "Russia", null, 45));
        objects.add(new SelectStudent("kolya", "Russia", "Moscow", null));
        objects.add(new SelectStudent("Gurgen", null, "Moscow", null));

        ArrayList<String> stringsGSON = new ArrayList<>();

        Gson jsonObject = new Gson();

        for(SelectStudent item : objects)
            stringsGSON.add(jsonObject.toJson(item));

        System.out.println("To JSON strings");
        for (String stringGSON : stringsGSON)
            System.out.println(stringGSON);

        System.out.println("From JSON strings");
        for (String stringGSON : stringsGSON)
        {
            SelectStudent object = jsonObject.fromJson(stringGSON, SelectStudent.class);
            System.out.println(object);
        }
    }
}
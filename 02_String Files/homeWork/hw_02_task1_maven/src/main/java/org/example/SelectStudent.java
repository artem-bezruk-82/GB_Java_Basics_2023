package org.example;

public class SelectStudent
{
    private String name;
    private String country;
    private String city;
    private Integer age;

    public SelectStudent(String name, String country, String city, Integer age)
    {
        this.name = name;
        this.country = country;
        this.city = city;
        this.age = age;
    }


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        if (this.name != null)
            sb.append(String.format("name=%s", this.name));
        if (this.country != null)
            sb.append(String.format(sb.length() > 0 ? " AND country=%s" : "country=%s", this.country));
        if (this.city != null)
            sb.append(String.format(sb.length() > 0 ? " AND city=%s" : "city=%s", this.city));
        if (this.age != null)
            sb.append(String.format(sb.length() > 0 ? " AND age=%d" : "age=%d", this.age));

        return String.format("SELECT * FROM students WHERE %s;",sb);
    }
}

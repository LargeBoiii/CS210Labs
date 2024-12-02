package Lab7RedemptionArc;

public class Link 
{
    public String name;
    public int age;
    public String course;
    public int yearOfStudy;
    public Link next;
    
    public Link(String name, int age, String course, int yearOfStudy)
    {
        this.name = name;
        this.age = age;
        this.course = course;
        this.yearOfStudy = yearOfStudy;
        this.next = null;
    }
}

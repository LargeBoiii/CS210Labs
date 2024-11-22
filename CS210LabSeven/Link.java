package CS210LabSeven;

public class Link 
{
    public String name;
    public int age;
    public String course;
    public int yearOfStudy;
    
    public Link next;
    public Link previous;

    public Link(String nameIn, int ageIn, String courseIn, int yosIn)
    {
        name = nameIn;
        age = ageIn;
        course = courseIn;
        yearOfStudy = yosIn;
    }
}

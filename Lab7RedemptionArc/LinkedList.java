package Lab7RedemptionArc;

public class LinkedList 
{
    private Link first;
    
    public LinkedList()
    {
        first = null;
    }

    public void insert(String name, int age, String course, int yearOfStudy)
    {
        Link newLink = new Link(name, age, course, yearOfStudy);
    
        
        if(this.isEmpty() || newLink.name.compareTo(first.name) < 0)    //list is empty, or new link should be fist
        {
            newLink.next = first;
            first = newLink;
        }
        else
        {
            Link current = first;
            Link previous = null;
            while(newLink.name.compareTo(current.name) > 0)
            {
                previous = current;
                current = current.next;
            }
            previous.next = newLink;
            newLink.next = current;
        }
     
    }



    public void printList()
    {
        Link current = first;
        while(current != null)
        {
            printLink(current);
            current = current.next;
        }
    }
    
    public void printLink(Link l)
    {
        System.out.println(l.name +" "+l.age+" "+l.course+" "+l.yearOfStudy);
    }

    public boolean isEmpty()
    {
        return (first == null);
    }
}

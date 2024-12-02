package CS210LabEight;

public class LinkedList 
{
    private Link first;
    
    public LinkedList()
    {
        first = null;
    }

    public void insert(String str)
    {
        Link newLink = new Link(str);
        if(isEmpty())
        {
            first = newLink;
        }
        else
        {
            newLink.next = first;
            first = newLink;
        }
    }

    public boolean isEmpty()
    {
        return (first == null);
    }

    public void printList()
    {
        Link current = first;
        while(current != null)
        {
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.println();
    }

    public void breakMyList()
    {
        Link current = first;
        System.out.println("im fucking the list");
        while(current != null)
        {
            if(current.next == null)
            {
                current.next = first;
                System.out.println("lists fucked now bro");
                break;
            }
            current = current.next;
        }
    }

    public void printWhereListBreaks()
    {
        Link current = first;
        while(current != null)
        {
            if(current.next == first)
            {
                System.out.println("The link containing " + current.data + " causes the loop");
                break;
            }
            current = current.next;
        }
    }
}

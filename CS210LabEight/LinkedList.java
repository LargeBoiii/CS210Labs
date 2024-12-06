package CS210LabEight;

public class LinkedList 
{
    private Link first;
    
    public LinkedList()
    {
        first = null;
    }

    public void insert(int dataIn)
    {
        Link newLink = new Link(dataIn);
        Link current = first;
        if(isEmpty())
        {
            first = newLink;
        }
        else
        {
            while(current.data < newLink.data)
            {
                if(current.next != null)
                {
                    current = current.next;
                }
                else{
                    break;
                }
            }
            newLink.next = current.next;
            current.next = newLink;
        }
    }

    public boolean isEmpty()
    {
        return (first == null);
    }

    public void createLoop(int loopOrigin, int loopDestination)
    {
        int elemCount = 1;
        Link current = first;
        Link loopOriginLink = null;
        Link loopDestinationLink= null;

        while(current != null)
        {
            if(loopOrigin == elemCount)
            {
                loopOriginLink = current;
            }
            else if(loopDestination == elemCount)
            {
                if(loopDestination > first.data)
                {
                    loopDestinationLink = current;
                    loopDestinationLink.next = current.next;
                }
                loopDestinationLink = current;
            }
            current = current.next;
            elemCount++;
        }
        loopOriginLink.next = loopDestinationLink;
    }

    public void detectLoop()
    {
        Link current = first;
        Link previous = first;
        while(current != null)
        {
            if(current.next != null)
            {
                if(current.next.data != (current.data + 1))
                {
                    System.out.println("The link containing " + current.data + " causes the loop");
                    break;
                }
            }
            current = current.next;
        }
    }

    public void fixLoop()
    {
        Link current = first;
        while(current != null)
        {
            if(current.next != null)
            {
                if(current.next.data != (current.data + 1))
                {
                    current.next = first;
                    break;
                }
            }
            current = current.next;
        }
    }

    public void printList()
    {
        Link current = first;
        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
            if(current.next == first)
            {
                System.out.println(current.data);
                break;
            }
        }
    }
    
}

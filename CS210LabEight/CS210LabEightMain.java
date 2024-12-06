package CS210LabEight;

public class CS210LabEightMain 
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.createLoop(5, 3);
        list.detectLoop();
        list.fixLoop();
        list.printList();
    }    
}

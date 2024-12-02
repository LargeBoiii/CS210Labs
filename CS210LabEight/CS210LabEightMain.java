package CS210LabEight;

public class CS210LabEightMain 
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insert("6");
        list.insert("5");
        list.insert("4");
        list.insert("3");
        list.insert("2");
        list.insert("1");
        list.printList();
        System.out.println("-----------------");
        list.breakMyList();
        list.printWhereListBreaks();
        
    }    
}

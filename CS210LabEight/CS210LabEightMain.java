package CS210LabEight;

public class CS210LabEightMain 
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insert("this link will break the list because its not cool");
        list.insert("this link wont because its cool unlike some other link");
        list.insert("this link wont because its cool unlike some other link");
        list.insert("this link wont because its cool unlike some other link");
        list.insert("this link wont because its cool unlike some other link");
        list.insert("this link wont because its cool unlike some other link");
        list.printList();
        System.out.println("-----------------");
        list.breakMyList();
        list.printWhereListBreaks();
        
    }    
}

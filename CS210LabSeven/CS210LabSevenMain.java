package CS210LabSeven;
import java.util.*;
//method that takes in printList OR attributeType(name,age,course,yos), attrValue(val), action(print,remove)

public class CS210LabSevenMain 
{
    public static void main(String [] args)
    {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        list.insertAtHead("joe",24,"comp sci",5);
        list.insertAtHead("jane",50,"nursing",4);
        list.insertAtHead("bob",99,"kush growing",3);
        list.insertAtHead("ferdia",100,"data science",2);
        list.insertAtHead("noah",12,"tpm",1);

        handleInput(list,"print list");
        //System.out.print('\n');
        handleInput(list,"print list");
    }

    //  Printing List // Deleting Links // Getting links w/ specific value user enters
    static public void handleInput(LinkedList list,String wePrinting)
    {
        if(wePrinting.equalsIgnoreCase("print list"))
        {
            list.printList();
        }
    }

    static public void handleInput(LinkedList list, String paramName, String paramValue, String action)
    {
        if(action.equalsIgnoreCase("print"))
        {
            //find all nodes with passed paramName = paramValue, and print them
        }
        else if(action.equalsIgnoreCase("remove"))
        {
            //find all nodes with passed paramName = paramValue, delete them
        }
    }
}

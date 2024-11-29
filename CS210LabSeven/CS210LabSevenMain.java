package CS210LabSeven;
import java.util.*;
//method that takes in printList OR attributeType(name,age,course,yos), attrValue(val), action(print,remove)

public class CS210LabSevenMain 
{
    public static void main(String [] args)
    {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("b".compareTo("a"));
        list.insertAlphabetically("Bunny", 26, "CSSE", 2);
        System.out.println("we got here 1");
        list.insertAlphabetically("Larry", 18, "ARTS", 1);
        System.out.println("its started 2");
        list.insertAlphabetically("Steve", 32, "ComputationalThinking", 4);
        System.out.println("its started 3");

        //populateList(list);

        String action = "";
        String param;
        String paramValue;
        while(!action.equalsIgnoreCase("quit"))
        {
            System.out.println("PRINT / REMOVE / PRINT LIST / NEW LINK /  QUIT");
            action = sc.nextLine();
            if(action.equalsIgnoreCase("PRINT LIST"))
            {
                parseInput(list,"doesnt matter","doesnt matter",action);
                continue;   //skip rest of loop if user wants to print list
            }
            else if(action.equalsIgnoreCase("quit"))
            {
                break;  
            }
            else if(action.equalsIgnoreCase("new link"))
            {
                System.out.println("Enter attributes Name | Age | Course | Year of Study separated by spaces");
                String input = sc.nextLine();
                String[] attributes = input.split("\s{1,}");
                list.insertAlphabetically(attributes[0],Integer.parseInt(attributes[1]),attributes[2] ,Integer.parseInt(attributes[3]));
                continue;
            }
            System.out.println("Enter parameter to search by: Age, Name, Course, Year of study");
            param = sc.nextLine();
            System.out.println("Enter parameter value to search for:");
            paramValue = sc.nextLine();

            System.out.println("First node in the list with " + param + " value " + paramValue + " is:");
            parseInput(list, param, paramValue, action);
        } 
        sc.close(); 
    }



    //  Printing List // Deleting/Getting links w/ specific value user enters

    static public void parseInput(LinkedList list, String paramName, String paramValue, String action)
    {
        if(action.equalsIgnoreCase("print"))
        {
            list.printLink(paramName, paramValue);
        }
        else if(action.equalsIgnoreCase("remove"))
        {
            list.removeLink(paramName, paramValue);
        }
        else if(action.equalsIgnoreCase("print list"))
        {
            list.printList();   //when we pass print list, pass paramName = "", paramValue = ""
        }
    }

    //populating list with inputs
    
    public static void populateList(LinkedList list)
    {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;
        String course = "";
        int yearOfStudy = 0;
        String stopOrNot = "";

        while(!stopOrNot.equalsIgnoreCase("N"))
        {
            //taking input
            System.out.println("Enter name");
            name = sc.nextLine();
            System.out.println("Enter age");
            age = Integer.parseInt(sc.nextLine());
            System.out.println("Enter course");
            course = sc.nextLine();
            System.out.println("Enter year of study");
            yearOfStudy = Integer.parseInt(sc.nextLine());

            //adding to linked list + stopping 
            list.insertAlphabetically(name, age, course, yearOfStudy);
            System.out.println("Continue populating list? Y/N");
            stopOrNot = sc.nextLine();
        }
    } 
}

package CS210LabFive;
import java.util.*;

public class Lab5Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack Stack = new Stack(100);
        String input = new String("");
        Boolean Arrived = false;
        String nextInstruction = new String("");
        
        System.out.println("Start direction, enter \"Arrived\" when done");
        while(!Arrived)
        {
            input = sc.nextLine();
            if(input.equalsIgnoreCase("Arrived"))
            {
                Arrived = true;
            }
            else
            {
                Stack.push(input);
            }
        }

        while(!Stack.isEmpty())
        {
            nextInstruction = Stack.peek();
            if(nextInstruction.equalsIgnoreCase("Go North"))
            {
                System.out.println("Go South");
                Stack.pop();
            }
            else if(nextInstruction.equalsIgnoreCase("Go South"))
            {
                System.out.println("Go North");
                Stack.pop();
            }
            else if(nextInstruction.equalsIgnoreCase("Go East"))
            {
                System.out.println("Go West");
                Stack.pop();
            }
            else if(nextInstruction.equalsIgnoreCase("Go West"))
            {
                System.out.println("Go East");
                Stack.pop();
            }
            else if(nextInstruction.equalsIgnoreCase("Go Back"))
            {
                Stack.pop();
                Stack.pop();
            }
        }
    }
}
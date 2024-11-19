package CS210LabFive;
import java.util.*;

public class Lab5Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack Stack = new Stack(100);
        //Queue Queue = new Queue(100);
        Stack Stack2 = new Stack(100);
        //String[] arr = new String[100];
        String input = new String("");
        Boolean Arrived = false;
        String nextInstruction = new String("");
        boolean palindrome = true;
        
        System.out.println("Start direction, enter \"Arrived\" when done");
        //int count = 0;
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
                Stack2.push(input);
                //arr[count] = input;

            }
            //count++;
        }

        //System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------");
        System.out.println("Stack output:");
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
        System.out.println("---------------");
        while(!Stack2.isEmpty())
        {
            if(!Stack2.peek().equals(Stack2.peekBottom()))
            {
                palindrome = false;
                //System.out.println(Stack2.peek() + " " + Stack2.peekBottom());
            }
            Stack2.pop();
            Stack2.popBottom();
        }
        System.out.println(palindrome);
        sc.close();
    }

    
}
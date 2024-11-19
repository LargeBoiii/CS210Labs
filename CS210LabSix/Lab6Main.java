package CS210LabSix;

import java.util.*;
/*
size 6
3
8
2
9
REMOVE
5
3
 */
public class Lab6Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter queue size");
        int size = Integer.parseInt(sc.nextLine());
        System.out.println("Enter queue instructions, then \"Done\"");

        PriorityQueue pQueue = new PriorityQueue(size);
        
        String input = sc.nextLine();
        while(!input.equalsIgnoreCase("done"))
        {
            if(input.equalsIgnoreCase("remove"))
            {
                pQueue.remove();
            }
            else
            {
                pQueue.insert(Integer.parseInt(input));
            }
            input = sc.nextLine();
        }
        
        pQueue.printQueue();
        sc.close();
    }
}
import java.util.Scanner;

public class LabTwo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Enter a number to see the number of steps in its Collatz Sequence"); 
        userInput = sc.nextInt();
        collatzSequence(userInput);  
        sc.close(); 
    }

    public static void collatzSequence(int num)
    {
        boolean breakCondition = false;
        int counter = 0;
        
        while(!breakCondition)
        {
            counter++;
            System.out.println(num);
            if(num == 1)
            {
                breakCondition = true;
            }
            else if(num % 2 != 0)
            {
                num = (num * 3) + 1;
            }
            else
            {
                num = num / 2;
            }
        }
        System.out.println("Number of steps = " + counter );
    }
}

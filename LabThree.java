import java.util.*;

public class LabThree
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //initialising array
        boolean[] sieve = new boolean[7920]; //7920
        for(int i = 2; i < sieve.length; i++)
        {
            sieve[i] = true;
        }
        
        //sieving through the array
        for(int i = 2; i < sieve.length; i++)
        {
            for(int j = i+1; j < sieve.length; j++)
            {
                if(j % i == 0)
                {
                    sieve[j] = false;
                }
            }
        }
        
        System.out.println("Enter a number between 1-1000 to see that prime number");
        int n = sc.nextInt();
        int counter = 0;
        int Nthprime = 0;
        for(int i = 2; i < sieve.length; i++)
        {
            if(sieve[i])
            {
                counter++;
                if(counter == n)
                {
                    Nthprime = i;
                    System.out.println(Nthprime);
                }
            }
        }
        int counter2 = 0;
        for(int i = 2; i < sieve.length; i++)
        {
            if(sieve[i])
            {
                counter2++;
                if(counter2 == Nthprime)
                {
                    System.out.println("The Nth prime is:" + i);
                }
            }
        }
        sc.close();
    }
}
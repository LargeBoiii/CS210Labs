import java.util.*;

//2024 Question 2

public class sophieGermain 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int lowerBound = sc.nextInt();
        int upperBound = sc.nextInt();
        System.out.println(sophieGermainSum(lowerBound, upperBound));
    } 
    
    public static int sophieGermainSum(int lower, int upper)
    {
        int sum = 0;
        boolean[] sieve = new boolean[10000];
        for(int i = 2; i < sieve.length; i++)
        {
            sieve[i] = true;
        }
        for(int i = 2; i < sieve.length; i++)
        {
            for(int j = i + 1; j < sieve.length; j++)
            {
                if(j % i == 0)
                {
                    sieve[j] = false;
                }
            }
        }
        
        for(int i = lower; i <= upper; i++)
        {
            if(sieve[i])
            {
                if(sieve[2*i + 1] && (2*i + 1) < sieve.length)
                {
                    sum += i;
                }
            }
        }
        return sum;
    }
}

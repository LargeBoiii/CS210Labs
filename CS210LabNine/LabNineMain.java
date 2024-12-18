package CS210LabNine;
import java.util.*;
import java.time.Clock;

public class LabNineMain
{
    public static void main(String[] args)
    {
               //TAKING INPUT
        Random rng = new Random();
        int[] arr = new int[500];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = rng.nextInt(1000);
        }
        
        
        //      SORTING :D
        Clock timeBefore = Clock.systemDefaultZone();
        System.out.println(timeBefore.instant());
        Sorting.sort(arr,0,arr.length-1);
        System.out.println(timeBefore.instant()); 
        //diff of .013 (optimised)
        //diff of .024

    }
}
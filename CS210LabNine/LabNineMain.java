package CS210LabNine;
import java.util.*;

public class LabNineMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
               //TAKING INPUT 
        int size;
        System.out.println("Enter array size");
        size = Integer.parseInt(sc.nextLine());
        int[] intArr = new int[size];
        System.out.println("Enter array elements separated by spaces");
        String[] strArr = sc.nextLine().split("\s");
        for(int i = 0; i < size; i++)
        {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        sc.close();
        
        
        //      SORTING :D
        Sorting.sort(intArr,0,intArr.length-1);
        System.out.println("\n The sorted array is:");
        System.out.println(Arrays.toString(intArr));
        
    }
}
import java.util.*;

public class CS210LabFour 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int arrayLength = Integer.parseInt(sc.nextLine()); //deals w/ scanner type magic
        String[] strArray = new String[arrayLength];

        System.out.println("Enter words separater by Enter");
        for(int i = 0; i < arrayLength; i++)
        {
            strArray[i] = sc.nextLine();
        }
        strArray = strArraySelectionSort(strArray);
        strArray = AlphabeticalSort(strArray);
        System.out.println( "Smallest to largest:" + Arrays.toString(strArray));
        strArray = strArraySelectionSortReverse(strArray);
        strArray = AlphabeticalSort(strArray);
        System.out.println("Smallest to largest: " + Arrays.toString(strArray));
       

        sc.close();
    }
    

    public static String[] strArraySelectionSort(String[] arr)
    {
        String temp = "";
        int min;
        for(int outer = 0; outer < arr.length; outer++)
        {
            min = outer;
            for(int inner = outer + 1; inner < arr.length; inner++)
            {
                if(arr[inner].length() < arr[min].length())
                {
                    min = inner;
                }
            }
            temp = arr[outer];
            arr[outer] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static String[] strArraySelectionSortReverse(String[] arr)
    {
        String temp = "";
        int max;
        for(int outer = 0; outer < arr.length; outer++)
        {
           max = outer;
            for(int inner = outer + 1; inner < arr.length; inner++)
            {
                if(arr[inner].length() > arr[max].length())
                {
                    max = inner;
                }
            }
            temp = arr[outer];
            arr[outer] = arr[max];
            arr[max] = temp;
        }
        return arr;
    }

    public static String[] AlphabeticalSort(String[] arr)
    {
        String tempStr = "";
        for(int i = 0; i <arr.length; i++ )
        {
            for(int j = 0; j < arr.length - 1; j++)
            {
                if(arr[j].length() == arr[j+1].length())
                {
                    if(arr[j].toLowerCase().compareTo(arr[j+1].toLowerCase()) > 0 )
                    {
                        tempStr = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tempStr;
                    }
                }
            } 
        }
        return arr;
    }
}


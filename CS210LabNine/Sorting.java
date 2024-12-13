package CS210LabNine;

public class Sorting{
    public static void merge(int[] arr, int left, int mid, int right)
    {
        //calculate subArr sizes
        int lSize = (mid - left) + 1;
        int rSize = right - mid;
        int[] lArr = new int[lSize];
        int[] rArr = new int[rSize];
        //populate subarrays
        for(int i = 0; i < lSize;i++)
        {
            lArr[i] = arr[left+i];
        }
        for(int j = 0; j < rSize; j++)
        {
            rArr[j] = arr[j + 1 + mid];
        }
        
        int i = 0, j = 0, k = left; //i,j = initial subArr index, k = initial main array index

        while(i < lSize && j < rSize)
        {
            if(lArr[i] <= rArr[j])
            {
                arr[k] = lArr[i];
                i++;
            }
            else
            {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        //dump any left over elements into main array
        while(i < lSize)
        {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j < rSize)
        {
            arr[k] = rArr[j];
            j++;
            k++;
        }
        
    }

    public static void sort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int mid = (left + (right - 1)) / 2;
            if(right - left > 10)
            {
                sort(arr,left,mid);
                sort(arr,mid+1,right);  
            }
            else
            {
                bubbleSort(arr,left,mid);
                bubbleSort(arr,mid+1,right);
            }
            merge(arr,left,mid,right);
        }
    }

    public static void bubbleSort(int[] arr, int lowerBound, int upperBound)
    {
        int temp;
        for(int i = lowerBound; i < upperBound; i++)
        {
            for(int j = i+1; j <= upperBound; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
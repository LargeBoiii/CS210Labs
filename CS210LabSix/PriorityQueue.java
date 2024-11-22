package CS210LabSix;

public class PriorityQueue
{
    private Integer[] arr;
    private int itemCount;

    public PriorityQueue(int size)
    {
        arr = new Integer[size];
        itemCount = 0;
    }

    ///      MAIN METHODS        /// 

    public void insert(int data)
    {
        if(itemCount == 0)
        {
            arr[0] = data;
        }
        else
        {
            int i = itemCount;

            while(i > 0 && arr[i-1] > data)
            {
                arr[i] = arr[i-1];
                i--;
            }
            arr[i] = data;
        }
        itemCount++;
    }

    public Integer peek()
    {
        return arr[itemCount-1];
    }

    public void remove()
    {
        arr[0] = null;
        for(int i = 1; i <itemCount;i++ )
        {
            arr[i-1] = arr[i];
        }
        itemCount--;
        arr[itemCount] = null;
    }

    ///      OTHER METHODS       /// 

    public boolean isEmpty()
    {
        return (itemCount == 0);
    }

    public boolean isFull()
    {
        return (itemCount == arr.length);
    }

    public int size()
    {
        return itemCount;
    }

    public void printQueue()
    {
        System.out.print("{");
        for(int i = 0; i < arr.length ;i++)
        {
            if(arr[i] == null)
            {
                System.out.print("null" + " ");
            }
            else{
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("}");
        System.out.println();
    }
}
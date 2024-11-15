package CS210LabFive;

public class Queue
{
    private int maxSize;
    private String[] QueueArr;
    private int front;
    private int back;
    private int itemCount;

    public Queue(int size)
    {
        maxSize = size;
        QueueArr = new String[maxSize];
        front = 0;
        back = -1;
        itemCount = 0;
    }

    public void insert(String str)
    {
        back++;
        itemCount++;
        QueueArr[back] = str;
    }

    public String remove()
    {
        front++;
        itemCount--;
        return QueueArr[front-1];
    }

    public int getSize()
    {
        return itemCount;
    }

    public boolean isFull()
    {
        boolean fullCheck = (itemCount < maxSize) ? false : true;  
        return fullCheck;
    }
    public String[] test()
    {
        return QueueArr;
    }
}
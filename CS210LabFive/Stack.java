package CS210LabFive;

public class Stack
{
    private int top;
    private int bottom;
    private int maxSize;
    private String[] Stack;

    public Stack()
    {
        top = -1;
        bottom = 0;
        maxSize = 100;
        Stack = new String[maxSize];
    }

    public Stack(int size)
    {
        top = -1;
        bottom = 0;
        maxSize = size;
        Stack = new String[maxSize];
    }

    //methods
    public void push(String str)
    {
        top++;
        Stack[top] = str;
    }

    public String pop()
    {
        top--;
        return Stack[top + 1];
    }

    public String peek()
    {
        return Stack[top];
    }

    public String peekBottom()
    {
        return Stack[bottom];
    }
    public String popBottom()
    {
        bottom++;
        return Stack[bottom];
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public boolean isFull()
    {
        return (top == maxSize-1);
    }
}
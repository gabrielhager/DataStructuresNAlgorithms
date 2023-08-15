import java.util.Arrays;

public class ArrayQueue {
    private int size;
    private int front;
    private int rear;
    private int[] items;

    public ArrayQueue(){
        size = 5;
        front = 0;
        rear = 0;
        items = new int[size];
    }

    //enqueue
    public void enqueue(int item){
        if(rear < size)
            items[rear++] = item;
    }
    //dequeue
    public int dequeue(){
        if(rear > 0){
            return items[front++];
        }
        else return 0;
    }
    //peek
    public int peek(){
        return items[front];
    }
    //isEmpty
    public boolean isEmpty(){
        return front == rear ;
    }
    //isFull
    public boolean isFull(){
        return (rear == size) && (front != rear);
    }

    @Override
    public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append("[");
        for(int i = front; i < rear; i++)
        {
            s.append(items[i] + ", " );
        }
        s.append("]");

        return s.toString();
    }
}

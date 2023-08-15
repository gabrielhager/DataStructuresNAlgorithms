
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
public class StackQueue {
    private Stack<Integer> a = new Stack<>();
    private Stack<Integer> b = new Stack<>();
    private int size = 0;

    public void enqueue(int item){
        a.push(item);
        size++;
    }

    public int dequeue(){
        for(int i = 0; i < size; i++){
            b.push(a.pop());
        }
        size--;
        int item = b.pop();

        while(!b.isEmpty()) a.push(b.pop());

        return item;
    }

    public int peek(){
        while(!a.isEmpty())
            b.push(a.pop());
        int item = b.peek();

        while(!b.isEmpty())
            a.push(b.pop());

        return item;
    }
}

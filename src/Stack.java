public class Stack {
    private int size;
    private int[] array;
    private int count = 0;

    public Stack(int stackSize){
        size = stackSize;
        array = new int[size];
    }

    public void push(int item){
        if(count == size) System.out.println("Stack is full exception [stack overflow?]");
        array[count++] = item;
    }
    public int pop(){
        int lastItem = array[count - 1];
        array[--count] = 0;
        return lastItem;
    }
    public int peek(){
        if(count == 0) return 0;
        return array[count - 1];
    }

    public boolean isEmpty(){
        if(count == 0) return true;
        else return false;
    }
}

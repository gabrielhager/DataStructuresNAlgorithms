public class Node {
    private int value;
    private Node next;

    public Node()
    {
        value = 0;
        next = null;
    }

    public Node(int setVal, Node setNext)
    {
        value = setVal;
        next = setNext;
    }
    public int getValue() {
        return value;
    }
    public Node getNext(){
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

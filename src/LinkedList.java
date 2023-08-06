public class LinkedList {
    private Node first;
    private Node last;

    public LinkedList(){
        first = new Node();
        last = new Node();
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    //addFirst
    public void addFirst(Node newNode)
    {
        newNode.setNext(first);
        first = newNode;
    }
    //addLast
    public void addLast(Node newNode)
    {
        last.setNext(newNode);
        last = newNode;
    }
    //deleteFirst
    //deleteLast
    //contains
    //indexOf

}

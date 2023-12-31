import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size;

    public LinkedList(){
        //first = new Node();
        //last = new Node();
    }

    public void addLast(int item)
    {
        var node = new Node(item);

        if(isEmpty())
        {
            first = last = node;
        }
        else{
            last.next = node;
            last = node;
        }

        size++;
    }
    public void addFirst(int item)
    {
        var node = new Node(item);
        if(isEmpty()) first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        var current = first;
        while (current != null){
            if(current.value == item) return true;
            current = current.next;
        }
        return false;
    }

    public void removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();
        size--;
        if(first == last){
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast(){
        if(isEmpty()) throw new NoSuchElementException();
        size--;
        if(first == last){
            first = last = null;
            return;
        }
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    public int size(){
        //Traversing is too expensive, but I kept the logic here to study how to traverse the linked list
        /*
        int length = 0;
        var current = first;
        while (current != null){
            length++;
            current = current.next;
        }
        return length;
         */
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;

        for(int i = 0; i < size; i++){
            array[i] = current.value;
            current = current.next;
        }

        return array;
    }

    public void reverse() {
        //Could probably do with just a variety of getPrevious and setting things
        //Probably easier to just create an array, then put in the last items, then reset the linked list with the reversed array

        //int[] array = toArray();
        //var current = first;
        /*
        for(int i = 0; i < size; i++){
            array[size - 1 - i] = current.value;
            current = current.next;
        }

        current = first;
        for(int i = 0; i < size; i++){
            current.value = array[i];
            current = current.next;
        }
         */
        //Inline
        if(isEmpty()) return;
        var previous = first;
        var current = first.next;
        while (current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k){
        if(isEmpty()) return -1;
        if(k > size) throw new IllegalArgumentException();
        if(k == 0) return last.value;
        if(k < 0) throw new NoSuchElementException();

        var leader = first.next;
        var follower = first;

        int distance = k-1;
        int traveled = 0;

        while(leader != null){
            if(traveled != distance){
                leader = leader.next;
                traveled++;
            }
            else{
                leader = leader.next;
                follower = follower.next;
            }
        }
        return follower.value;
    }
    private Node getPrevious (Node node){
        var current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
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

    private boolean isEmpty() {return first == null;}

    //deleteFirst
    //deleteLast
    //contains
    //indexOf

}

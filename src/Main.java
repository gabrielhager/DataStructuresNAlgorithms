import java.util.*;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /* Arrays
        Myrray numbers = new Myrray(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        //numbers.removeAt(3);
        numbers.print();

        System.out.println(numbers.indexOf(90));

        System.out.println("Max " + numbers.max());

        int[] compare = {20, 30, 50, 1000, 70, 90};
        //System.out.println(numbers.intersect(compare));

        numbers.reverse();
        numbers.print();

        numbers.insertAt(90, 1);
        numbers.print();

         */

        //LinkedList
        /*
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        //list.removeLast();
        //list.reverse();
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("The Kth from the end is: " + list.getKthFromTheEnd(8));

         */

        //Stack
        //StackPractice sp = new StackPractice();
        //System.out.println(sp.isBalanced("(([<Hi>]))"));
        /*
        Stack arrayStack = new Stack(5);

        for (int i = 0; i < 5; i++){
            arrayStack.push(i + 1);
            System.out.println(arrayStack.peek());
        }

        for (int i = 0; i < 5; i++){
            arrayStack.pop();
            System.out.println(arrayStack.peek());
        }

         */

        //Reverse Queue
        /*
        Queue<Integer> myQ = new ArrayDeque<>();
        myQ.add(10);
        myQ.add(20);
        myQ.add(30);

        System.out.println(myQ);
        reverse(myQ);
        System.out.println(myQ);

         */

        //ArrayQueue
        /*
        ArrayQueue arrayQ = new ArrayQueue();
        arrayQ.enqueue(10);
        arrayQ.enqueue(20);
        arrayQ.enqueue(30);
        arrayQ.enqueue(40);
        arrayQ.enqueue(50);

        System.out.println(arrayQ);
        System.out.println(arrayQ.isFull());
        System.out.println(arrayQ.isEmpty());

        arrayQ.dequeue();
        System.out.println(arrayQ);
        arrayQ.dequeue();
        System.out.println(arrayQ);
        arrayQ.dequeue();
        System.out.println(arrayQ);
        arrayQ.dequeue();
        System.out.println(arrayQ);
        arrayQ.dequeue();
        System.out.println(arrayQ);

        System.out.println(arrayQ.isEmpty());
        System.out.println(arrayQ.isFull());

         */

        //StackQueue
        /*
        StackQueue sQ = new StackQueue();
        sQ.enqueue(10);
        sQ.enqueue(20);
        sQ.enqueue(30);
        sQ.enqueue(40);
        sQ.enqueue(50);

        System.out.println(sQ.peek());
        sQ.dequeue();
        System.out.println(sQ.peek());
        sQ.dequeue();
        System.out.println(sQ.peek());
        sQ.dequeue();
        System.out.println(sQ.peek());

        sQ.enqueue(60);
        sQ.dequeue();
        System.out.println(sQ.peek());
        sQ.dequeue();
        System.out.println(sQ.peek());

         */

        //PriorityQueue
        PriorityQueue pq = new PriorityQueue(6);
        pq.insert(7);
        System.out.println(pq.toString());
        pq.insert(1);
        pq.insert(3);
        pq.insert(5);
        pq.insert(2);
        pq.insert(-1);
        pq.insert(8);
        System.out.println(pq.toString());


    }

    //Reverse Queue
    public static void reverse(Queue<Integer> queue){
        //add
        //remove
        //isEmpty
        Stack<Integer> s = new Stack<>();

        while(!queue.isEmpty())
        {
            s.push(queue.remove());
        }
        while(!s.isEmpty()){
            queue.add(s.pop());
        }
    }
}
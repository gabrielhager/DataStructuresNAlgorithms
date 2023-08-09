import java.util.Arrays;

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

    }
}
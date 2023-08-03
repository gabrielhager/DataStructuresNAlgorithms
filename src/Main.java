public class Main {
    public static void main(String[] args) {
        Myrray numbers = new Myrray(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.insert(70);
        numbers.insert(80);
        numbers.removeAt(5);

        numbers.print();

        System.out.println(numbers.indexOf(90));

        System.out.println("Max " + numbers.max());

    }
}
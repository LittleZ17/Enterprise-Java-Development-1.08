package Interface;

public class Main {
    public static void main(String[] args) {

        IntArrayList listTest = new IntArrayList();

        listTest.add(123);
        listTest.add(456);
        listTest.add(98);
        listTest.add(567);
        listTest.add(123);

        System.out.println(listTest.get(2));
        //System.out.println(listTest.get(10));
    }
}

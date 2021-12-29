package session10.thuc_hanh.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        System.out.println("Element 1:" + myList.get(0));
        System.out.println("Element 2:" + myList.get(1));
        System.out.println("Element 3:" + myList.get(2));
        System.out.println("Element 4:" + myList.get(3));
        System.out.println("Element 5:" + myList.get(4));
        System.out.println("Element 6:" + myList.get(5));

        System.out.println("----------------------------");
        myList.get(10);
        System.out.println("Element 10:" + myList.get(10));
    }
}

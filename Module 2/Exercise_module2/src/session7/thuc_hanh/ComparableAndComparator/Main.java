package session7.thuc_hanh.ComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        /**
         * kiểm thử Comparable
         **/
        ComparableCircle[] comparableCircle = new ComparableCircle[3];
        comparableCircle[0] = new ComparableCircle();
        comparableCircle[1] = new ComparableCircle("orange", false, 5.0);
        comparableCircle[2] = new ComparableCircle(3.5);

        System.out.println("Pre-sorted:");
        for(ComparableCircle circle : comparableCircle){
            System.out.println(circle);
        }

        Arrays.sort(comparableCircle);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : comparableCircle) {
            System.out.println(circle);
        }

        /**
         * Kiểm thử Comparator
         **/
        System.out.println("-----------------------------------------");
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("blue", false, 4.3);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}

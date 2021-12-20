package session6.bai_tap.DesignTriagle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape("red");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("----------------------------------");

        Triagle triagle1 = new Triagle();
        Triagle triagle2 = new Triagle("orange", 5.0, 5.0, 5.0);
        System.out.println(triagle1);
        System.out.println(triagle2);
    }
}

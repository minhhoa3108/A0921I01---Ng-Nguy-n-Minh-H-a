package session15.bai_tap;

import java.util.Scanner;

public class Main extends Throwable {
    public static void main(String[] args) {
        TriagleCheck triagleCheck = new TriagleCheck();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = sc.nextInt();

        System.out.println("Nhập b: ");
        int b = sc.nextInt();

        System.out.println("Nhập c: ");
        int c = sc.nextInt();

        try {
            triagleCheck.checkTriagle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}

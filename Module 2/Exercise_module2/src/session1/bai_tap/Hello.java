package session1.bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String str = sc.nextLine();
        System.out.println("Hello " + str);
    }
}

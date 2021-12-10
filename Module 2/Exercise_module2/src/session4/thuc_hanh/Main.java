package session4.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng hcn:");
        double width = sc.nextDouble();
        System.out.println("Nhập chiều dài hcn:");
        double height = sc.nextDouble();
        Rectangle rec1 = new Rectangle(width, height);
        System.out.println("Hình chữ nhật: " + rec1.display());
        System.out.println("Diện tích Hình chữ nhật: " + rec1.getArea());
        System.out.println("Chu vi Hình chữ nhật: " + rec1.getPerimeter());
    }
}

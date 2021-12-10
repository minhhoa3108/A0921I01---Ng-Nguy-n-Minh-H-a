package session4.bai_tap.QuadraticEquation_PTBac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a:");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị b:");
        double b = sc.nextDouble();
        System.out.println("Nhập giá trị c:");
        double c = sc.nextDouble();
        QuadraticEquation pt1 = new QuadraticEquation(a, b, c);
        System.out.println(pt1.display());
        System.out.println(pt1.getResult());
    }
}

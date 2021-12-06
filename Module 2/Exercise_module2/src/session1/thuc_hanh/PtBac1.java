package session1.thuc_hanh;

import java.util.Scanner;

public class PtBac1 {
    public static void main(String[] args) {
        System.out.println("Cho phương trình 'a * x + b = c', hãy nhập các số:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("X = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("Phương trình vố số nghiệm!");
            } else {
                System.out.print("Vô nghiệm!");
            }
        }
    }
}

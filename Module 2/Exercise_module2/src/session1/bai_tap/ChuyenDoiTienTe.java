package session1.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền (USD): ");
        double usd = sc.nextDouble();
        double result = usd * vnd;
        System.out.println("Giá trị VNĐ: " + result);
    }
}
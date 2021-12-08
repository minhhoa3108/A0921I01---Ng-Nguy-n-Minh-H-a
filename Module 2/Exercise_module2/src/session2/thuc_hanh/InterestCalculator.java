package session2.thuc_hanh;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double interestRate = 5.5/100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn muốn gửi: ");
        double money = sc.nextDouble();
        System.out.println("Nhập số tháng bạn muốn gửi: ");
        int month = sc.nextInt();
        System.out.println("Lãi xuất của ngân hàng là: " + interestRate);

        int totalInterest = 0;
        for (int i = 1; i <= month; i++){
            totalInterest += money * (interestRate)/12 * month;
        }

        System.out.println("Tổng số tiền lãi là: " + totalInterest);
    }
}

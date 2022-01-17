package session15.thuc_hanh;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập x: ");
        double x = sc.nextDouble();
        System.out.println("Nhập y: ");
        double y = sc.nextDouble();

        NumberFormatException calc = new NumberFormatException();
        calc.calculator(x, y);
    }

    private void calculator(double x, double y){
        try{
            double a = x + y;
            double b = x - y;
            double c = x * y;
            double d = x / y;
            System.out.println("Tổng: x + y: " + a);
            System.out.println("Hiệu: x - y: " + b);
            System.out.println("Tích: x * y: " + c);
            System.out.println("Thương: x : y: " + d);
        }catch (Exception e){
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}

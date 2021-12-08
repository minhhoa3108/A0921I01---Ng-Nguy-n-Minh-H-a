package session2.thuc_hanh;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhát");
        }else{
            while(a != b){
                if (a > b) {
                    a = a - b;
                }else{
                    b = b - a;
                }
            }
            System.out.println("Ước chung lớn nhất là: " + a);
        }
    }
}

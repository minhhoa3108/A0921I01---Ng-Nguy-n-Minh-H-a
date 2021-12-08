package session2.thuc_hanh;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra:");
        int n = sc.nextInt();
        if(n < 2){
            System.out.println(n + " không phải số nguyên tố!!!");
        }else{
            boolean check = true;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(n + " là số nguyên tố.");
            }else{
                System.out.println(n + " Không phải số nguyên tố!!!");
            }
        }
    }
}

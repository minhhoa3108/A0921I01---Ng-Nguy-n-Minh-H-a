package session1.thuc_hanh;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số năm bạn muỗn biết");
        int year = sc.nextInt();

        String result;

        if(year % 100 == 0){
            if(year % 400 == 0){
                result = "Năm nhuận";
            }else{
                result = "Không phải là năm nhuận";
            }
        }else{
            if(year % 4 == 0){
                result = "Năm nhuận";
            }else{
                result = "Không phải là năm nhuận";
            }
        }

        System.out.println(result);
    }
}

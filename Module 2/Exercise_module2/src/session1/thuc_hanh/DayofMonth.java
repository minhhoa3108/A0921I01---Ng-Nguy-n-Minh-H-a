package session1.thuc_hanh;

import java.util.Scanner;

public class DayofMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tháng bạn muỗn xem");
        int month = sc.nextInt();

        String day;
        switch (month){
            case 2:
                day = "Có 28 hoặc 29 ngày";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = "Có 31 ngày";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = "Có 30 ngày";
            default:
                day = "Not Valid";
        }
        System.out.println(day);
    }
}

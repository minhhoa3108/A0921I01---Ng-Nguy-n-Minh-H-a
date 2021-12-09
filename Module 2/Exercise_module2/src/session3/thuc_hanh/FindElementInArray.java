package session3.thuc_hanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Hòa", "Hưng", "Ân", "Nguyên", "Thọ", "Châu", "Đạt"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên bạn muốn tìm:");
        String input_name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++){
            if(students[i].equals(input_name)){
                check = true;
                System.out.println("Vị trí của tên học sinh trong danh sách " + input_name + " là: " + (i+1));
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy " + input_name + " trong danh sách");
        }
    }
}

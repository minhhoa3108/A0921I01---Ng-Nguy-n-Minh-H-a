package session3.bai_tap;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập mấy phần tử:");
        int n = sc.nextInt();
        array = new int[n];
        System.out.println("Nhập giá trị bạn muốn thêm:");
        int value = sc.nextInt();
        System.out.println("Nhập vị trí bạn muốn thêm:");
        int index = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < array.length; i++){
            if (index > 1 && index < (array.length - 1)) {
                array[index] = value;
                check = true;
            }else{
                check = false;
            }
        }
        if(check){
            System.out.println("Mảng sau khi thêm phần tử là :");
            for (int j = 0; j < array.length; j++){
                System.out.print(array[j] + "\t");
            }
        }else{
            System.out.println("Không thể thêm phần tử");
        }
    }
}

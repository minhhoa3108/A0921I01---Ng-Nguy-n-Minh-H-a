package session3.thuc_hanh;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] array;
        System.out.println("Bạn muốn nhập mấy phần tử cho mảng");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++){
            System.out.println("Nhập giá trị phần tứ:" + (i +1));
            array[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("GTLN là: " + max);
    }
}

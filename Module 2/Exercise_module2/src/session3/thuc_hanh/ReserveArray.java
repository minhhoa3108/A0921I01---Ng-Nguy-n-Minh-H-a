package session3.thuc_hanh;

import java.util.Scanner;

public class ReserveArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước mảng:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Kích thước của mảng không quá 20");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " :");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("Elements in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("Reverse array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

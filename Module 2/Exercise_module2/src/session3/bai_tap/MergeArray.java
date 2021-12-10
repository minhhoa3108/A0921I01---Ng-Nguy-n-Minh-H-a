package session3.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int[] array3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu phần tử:");
        int n = sc.nextInt();
        array1 = new int[n];
        array2 = new int[n];
        array3 = new int[2*n];

        System.out.println("Nhập các giá trị cho mảng 1:");
        for (int i = 0; i < array1.length; i++){
            System.out.println("Nhập phần tử thứ " + i + " của mảng 1:");
            array1[i] = sc.nextInt();
        }

        System.out.println("Nhập các giá trị cho mảng 2:");
        for (int i = 0; i < array2.length; i++){
            System.out.println("Nhập phần tử thứ " + i + " của mảng 2:");
            array2[i] = sc.nextInt();
        }

        for (int i = 0; i < (array3.length-n); i++){
            array3[i] = array1[i];
        }
        int s = 0;
        while (s < n){
            for (int i = n; i < array3.length; i++){
                array3[i] = array2[s];
                s++;
            }
        }

        System.out.println("Các phần tử của mảng 3 là: ");
        for (int i = 0; i < array3.length; i++){
            System.out.print(array3[i] + "\t");
        }
    }
}

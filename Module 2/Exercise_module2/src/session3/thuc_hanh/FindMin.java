package session3.thuc_hanh;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập mấy phần tử:");
        int n = sc.nextInt();
        array = new int[n];
        for(int i = 0; i < array.length; i++){
            System.out.println("Nhập giá trị cho phần tử " + (i+1));
            array[i] = sc.nextInt();
        }
        int index = minValue(array);
        System.out.println("GTNN của mảng là: " + array[index]);
    }
    public static int minValue(int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < arr[index]){
                index = i;
            }
        }
        return index;
    }
}

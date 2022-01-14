package session14.thuc_hanh;

import java.util.Scanner;

public class DescriptionBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập độ dài của mảng");
        int size = sc.nextInt();
        int[] list = new int[size];

        System.out.println("Nhập giá trị của mảng có độ dài " + list.length);
        for (int i = 0; i < list.length; i++){
            list[i] = sc.nextInt();
        }

        System.out.println("mảng của bạn là: ");
        for (int lists : list){
            System.out.println(lists);
        }

        System.out.println("Mảng sau khi được sắp xếp:");
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++){
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++){
                if(list[j] > list[j + 1]){
                    System.out.println("Đổi " + list[j] + " với " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
                needNextPass = true;
            }

            if(needNextPass == false){
                System.out.println("Mảng đã được sấp xếp và không cần sắp xếp lại");
                break;
            }

            for (int k = 0; k < list.length; k++){
                System.out.println(list[k] + "\t");
            }
            System.out.println();
        }
    }
}

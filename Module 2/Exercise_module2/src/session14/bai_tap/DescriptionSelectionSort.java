package session14.bai_tap;

import java.util.Scanner;

public class DescriptionSelectionSort {
    public static void main(String[] args) {
        double[] list;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn thêm vào mảng");
        int size = sc.nextInt();
        list = new double[size];
        for (int i = 0; i < size; i++){
            list[i] = sc.nextDouble();
        }

        System.out.println("Mảng sau khi thêm");
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i] + "\t");
        }

        System.out.println("Mảng đã được sắp xếp là:");
        selectionSort(list);

    }

    public static void selectionSort(double[] list){
        for (int i =0; i < list.length - 1; i++){
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }

            for(int j = 0; j < list.length; j++){
                System.out.println(list[j] + "\n");
            }
        }
    }
}

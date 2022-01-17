package session15.thuc_hanh.ClassArrayIndexOutBoundsException;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];

        System.out.println("Danh sách các phần tử trong mảng:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + "\t");
        }

        return arr;
    }
}

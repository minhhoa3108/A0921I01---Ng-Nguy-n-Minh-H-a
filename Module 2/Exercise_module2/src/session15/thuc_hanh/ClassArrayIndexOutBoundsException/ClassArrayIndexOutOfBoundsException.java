package session15.thuc_hanh.ClassArrayIndexOutBoundsException;

import java.util.Scanner;

public class ClassArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer arr[] = arrExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 chỉ số bạn muốn kiểm tra:");
        int n = sc.nextInt();

        try {
            System.out.println("Chỉ số phần tử bạn vừa nhập vào là " + n + " có giá trị là: " + arr[n]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}

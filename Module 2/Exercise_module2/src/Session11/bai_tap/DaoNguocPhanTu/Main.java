package Session11.bai_tap.DaoNguocPhanTu;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> stackInteger = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử bạn muốn thêm vào:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Nhập giá trị cho phần tử thứ " + i);
            int j = sc.nextInt();
            stackInteger.push(j);
        }
        System.out.println(stackInteger);
    }
}

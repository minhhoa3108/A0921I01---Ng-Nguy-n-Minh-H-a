package Session11.bai_tap.DaoNguocPhanTu;


import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("bạn muốn nhập bao nhiêu phần tử");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Nhập giá trị thứ " + i);
            int j = sc.nextInt();
            stack.push(j);
        }

//        for (int i = 0; i < n; i++){
//            for (int j = i + 1; j < i; j++){
//                int temp = stack.elementAt(i);
//                stack.elementAt(i) = stack.elementAt(j);
//                stack.elementAt(j) = temp;
//            }
//        }

        System.out.println();
    }
}

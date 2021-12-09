package session2.bai_tap;

import java.util.Scanner;

public class ShowShapes {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1, Print the rectangle");
        System.out.println("2. Print the square triangle ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. exit");
        System.out.println("Enter your choice: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 7; j ++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Vuông góc dưới bên phải:");
                for(int i = 0; i < 5; i++){
                    for(int j = 0; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println("--------------------------------");
                System.out.println("Vuông góc trên bên phải:");
                for (int i = 5; i > 0; i--){
                    for (int j = 0; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i = 1; i <= 5; i++){
                    for(int j=1;j<=5-i;j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=2*i-1;j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}

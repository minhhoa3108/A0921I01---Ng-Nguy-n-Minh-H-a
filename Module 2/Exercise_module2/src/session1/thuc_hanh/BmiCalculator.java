package session1.thuc_hanh;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Nhập cân nặng (theo kilogam)");
        weight = sc.nextDouble();
        System.out.println("Nhập chiều cao (theo m)");
        height = sc.nextDouble();

        while(height > 2.5){
            System.out.println("Nhập chiều cao sai");
        }

        bmi = weight / (height*height);
        System.out.println("Chỉ số BMI của bạn là: "+ bmi);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if (18.5 <= bmi && bmi < 25){
            System.out.println("Normal");
        }else if (25 <= bmi && bmi < 30){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }

    }
}

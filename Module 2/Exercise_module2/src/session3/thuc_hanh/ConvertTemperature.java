package session3.thuc_hanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        System.out.println("----------------MENU----------------");
        System.out.println("1. Chuyển độ C sang độ F");
        System.out.println("2. Chuyển độ F sang độ C");
        System.out.println("0. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn lựa chọn của bạn:");
        int n = sc.nextInt();
        double celcius;
        double fahrenheit;
        switch (n){
            case 1:
                System.out.println("Nhập nhiệt độ");
                celcius = sc.nextDouble();
                System.out.println("Độ C sang độ F: " + CelciusToFahrenheit(celcius));
                break;
            case 2:
                System.out.println("Nhập nhiệt độ");
                fahrenheit = sc.nextDouble();
                System.out.println("Độ F sang độ C: " + FahrenheitToCelcius(fahrenheit));
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Not Valid");
        }
    }
    public static double CelciusToFahrenheit(double celcius){
        double fahrenheit = celcius * 1.8 + 32;
        return fahrenheit;
    }
    public static double FahrenheitToCelcius(double fahrenheit){
        double celcius = (fahrenheit-32) /1.8;
        return celcius;
    }
}

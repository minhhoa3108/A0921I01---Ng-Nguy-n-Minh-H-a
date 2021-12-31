package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------MENU---------------");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        int choose = sc.nextInt();

        displayMainMenu(choose);
    }


    private static void displayMainMenu(int choose) {
        Scanner sc = new Scanner(System.in);
        while(choose < 0 || choose > 6){
            System.out.println("==>>Please select valid value");
            System.out.println("0. Exit");
            int chooseLoop = sc.nextInt();
            if(chooseLoop == 0){
                System.exit(0);
            }
        }

        switch (choose){
            case 1:
                //Employee Management
                System.out.println("1\tDisplay list employees");
                System.out.println("2\tAdd new employee");
                System.out.println("3\tEdit employee");
                System.out.println("4\tReturn main menu");
                break;
            case 2:
                //Customer Management
                System.out.println("1\tDisplay list customers");
                System.out.println("2\tAdd new customer");
                System.out.println("3\tEdit customer");
                System.out.println("4\tReturn main menu");
                break;
            case 3:
                //Facility Management
                System.out.println("1\tDisplay list facility");
                System.out.println("2\tAdd new facility");
                System.out.println("3\tEdit facility");
                System.out.println("4\tReturn main menu");
                break;
            case 4:
                //Booking Managerment
                System.out.println("1\tDisplay list booking");
                System.out.println("2\tAdd new booking");
                System.out.println("3\tCreat new contracts");
                System.out.println("4\tDisplay list contracts");
                System.out.println("5\tEdit contracts");
                System.out.println("6\tReturn main menu");
                break;
            case 5:
                //Promotion Management
                System.out.println("1\tDisplay list customers use service");
                System.out.println("2\tDisplay list customers get voucher");
                System.out.println("3\tReturn main menu");
                break;
            case 6:
                System.exit(0);
                break;
        }
    }
}

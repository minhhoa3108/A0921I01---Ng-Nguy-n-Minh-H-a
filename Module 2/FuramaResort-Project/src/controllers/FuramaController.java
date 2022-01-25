package controllers;

import services.BookingServiceImpl;
import services.CustomerServiceImpl;
import services.EmployeeServiceImpl;
import services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        while (true){
            try {
                int choice = 0;
                Scanner sc = new Scanner(System.in);

                EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
                CustomerServiceImpl customerService = new CustomerServiceImpl();
                FacilityServiceImpl facilityService = new FacilityServiceImpl();
                BookingServiceImpl bookingService = new BookingServiceImpl();

                while (choice != 6){
                    System.out.println("----------------MENU-----------------");
                    System.out.println("1. Employment Management");
                    System.out.println("2. Customer Management");
                    System.out.println("3. Facility Management");
                    System.out.println("4. Booking Management");
                    System.out.println("5. Promotion Management");
                    System.out.println("6. Exit");

                    choice = sc.nextInt();
                    switch (choice){
                        case 1:
                            int choice1 = 0;
                            while (choice1 != 4){
                                System.out.println("Chọn chức năng:");
                                System.out.println("1. Hiển thị danh sách NHÂN VIÊN");
                                System.out.println("2. Thêm NHÂN VIÊN mới");
                                System.out.println("3. Chỉnh sửa thông tin NHÂN VIÊN");
                                System.out.println("4. Return main menu");

                                choice1 = sc.nextInt();
                            }
                            switch (choice1){
                                case 1:
                                    System.out.println("===================================");
                                    employeeServiceImpl.display();
                                    System.out.println("===================================");
                                    break;
                                case 2:
                                    System.out.println("===================================");
                                    employeeServiceImpl.add();
                                    System.out.println("===================================");
                                    break;
                                case 3:
                                    System.out.println("===================================");
                                    Scanner sc1 = new Scanner(System.in);
                                    System.out.println("Nhập id NHÂN VIÊN muốn chỉnh sửa:");
                                    String maID = sc.nextLine();
                                    employeeServiceImpl.edit(maID);
                                    System.out.println("===================================");
                                    break;
                                case 4:
                                    break;
                            }
                            break;
                        case 2:
                            int choice2 = 0;
                            while (choice2 != 4){
                                System.out.println("Chọn chức năng:");
                                System.out.println("1. Hiển thị danh sách KHÁCH HÀNG");
                                System.out.println("2. Thêm KHÁCH HÀNG mới");
                                System.out.println("3. Chỉnh sửa thông tin KHÁCH HÀNG");
                                System.out.println("4. Return main menu");

                                choice2 = sc.nextInt();
                            }
                            switch (choice2){
                                case 1:
                                    System.out.println("===================================");
                                    customerService.display();
                                    System.out.println("===================================");
                                    break;
                                case 2:
                                    System.out.println("===================================");
                                    customerService.add();
                                    System.out.println("===================================");
                                    break;
                                case 3:
                                    System.out.println("===================================");
                                    Scanner sc1 = new Scanner(System.in);
                                    System.out.println("Nhập id KHÁCH HÀNG muốn chỉnh sửa:");
                                    String maID = sc.nextLine();
                                    customerService.edit(maID);
                                    System.out.println("===================================");
                                    break;
                                case 4:
                                    break;
                            }
                            break;
                        case 3:
                            int choice3 = 0;
                            while (choice3 != 4){
                                System.out.println("Chọn chức năng:");
                                System.out.println("1. Display list facility");
                                System.out.println("2. Add new facility");
                                System.out.println("3. Display list facility maintenance");
                                System.out.println("4. Return main menu");

                                choice3 = sc.nextInt();
                            }
                            switch (choice3){
                                case 1:
                                    System.out.println("===================================");
                                    facilityService.display();
                                    System.out.println("===================================");
                                    break;
                                case 2:
                                    
                                    break;
                                case 3:
                                    System.out.println("===================================");
                                    System.out.println("3. Display new facility maintenance");
                                    System.out.println("===================================");
                                    break;
                                case 4:
                                    break;
                            }
                            break;
                    }
                }

            } catch (Exception e){
                System.out.println("Nhập số không được nhập chữ");
            }
        }
    }
}

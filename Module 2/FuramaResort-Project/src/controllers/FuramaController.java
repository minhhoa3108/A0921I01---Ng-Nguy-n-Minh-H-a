package controllers;

import services.*;

import java.util.Scanner;

public class FuramaController {
    private EmployeeService employeeService = new EmployeeServiceImpl();
    private CustomerService customerService = new CustomerServiceImpl();
    private FacilityService facilityService = new FacilityServiceImpl();
    private BookingService bookingService = new BookingServiceImpl();


    public void displayMainMenu() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        do {
            System.out.println("----------------MENU-----------------");
            System.out.println("1. Employment Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    int choice1 = 0;
                    System.out.println("Chọn chức năng:");
                    System.out.println("1. Hiển thị danh sách NHÂN VIÊN");
                    System.out.println("2. Thêm NHÂN VIÊN mới");
                    System.out.println("3. Chỉnh sửa thông tin NHÂN VIÊN");
                    System.out.println("4. Xóa thông tin NHÂN VIÊN");
                    System.out.println("5. Return main menu");

                    choice1 = Integer.parseInt(sc.nextLine());

                    switch (choice1){
                        case 1:
                            System.out.println("===================================");
                            employeeService.display();
                            System.out.println("===================================");
                            break;
                        case 2:
                            System.out.println("===================================");
                            employeeService.add();
                            System.out.println("===================================");
                            break;
                        case 3:
                            System.out.println("===================================");
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("Nhập id NHÂN VIÊN muốn chỉnh sửa:");
                            String maID = sc.nextLine();
                            employeeService.edit(maID);
                            System.out.println("===================================");
                            break;
                        case 4:
                            System.out.println("===================================");
                            employeeService.delete();
                            System.out.println("===================================");
                            break;
                        case 5:
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
                            Scanner sc31 = new Scanner(System.in);
                            int choice31 = 0;
                            while(choice31 != 4){
                                System.out.println("Chọn chức năng:");
                                System.out.println("1. Thêm mới Villa");
                                System.out.println("2. Thêm mới House");
                                System.out.println("3. Thêm mới Room");

                                choice31 = sc.nextInt();
                                switch (choice31){
                                    case 1:
                                        System.out.println("===================================");
                                        facilityService.addVilla();
                                        System.out.println("===================================");
                                        break;
                                    case 2:
                                        System.out.println("===================================");
                                        facilityService.addHouse();
                                        System.out.println("===================================");
                                        break;
                                    case 3:
                                        System.out.println("===================================");
                                        facilityService.addRoom();
                                        System.out.println("===================================");
                                        break;
                                    case 4:
                                        break;
                                }
                            }
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
                case 4:
                    int choice4 = 0;
                    while (choice4 != 4){
                        System.out.println("Chọn chức năng:");
                        System.out.println("1. Thêm mới BOOKING");
                        System.out.println("2. Hiển thị danh sách BOOKING");
                        System.out.println("3. Thêm HỢP ĐỒNG THUÊ mới");
                        System.out.println("4. Hiển thị danh sách HỢP ĐỒNG THUÊ");
                        System.out.println("5. Chỉnh sửa HỢP ĐỒNG THUÊ");
                        System.out.println("6. Return main menu");

                        choice4 = sc.nextInt();
                    }
                    switch (choice4){
                        case 1:
                            System.out.println("===================================");
                            bookingService.add();
                            System.out.println("===================================");
                            break;
                        case 2:
                            System.out.println("===================================");
                            bookingService.display();
                            System.out.println("===================================");
                            break;
                        case 3:
                            System.out.println("===================================");
                            System.out.println("3. Thêm HỢP ĐỒNG THUÊ mới");
                            System.out.println("===================================");
                            break;
                        case 4:
                            System.out.println("===================================");
                            System.out.println("4. Hiển thị danh sách HỢP ĐỒNG THUÊ");
                            System.out.println("===================================");
                            break;
                        case 5:
                            System.out.println("===================================");
                            System.out.println("5. Chỉnh sửa HỢP ĐỒNG THUÊ");
                            break;
                        case 6:
                            break;
                    }
                    break;
                case 5:
                    int choice5 = 0;
                    while (choice5 != 3){
                        System.out.println("Chọn chức năng:");
                        System.out.println("1. Hiển thị danh sách khách hàng sử dụng dịch vụ");
                        System.out.println("2. Hiển thị danh sách khách hàng sử dụng mã khuyến mãi");
                        System.out.println("3. Return main memu");

                        choice5 = sc.nextInt();
                        switch (choice5){
                            case 1:
                                System.out.println("===================================");
                                System.out.println("Hiển thị danh sách khách hàng sử dụng dịch vụ");
                                System.out.println("===================================");
                                break;
                            case 2:
                                System.out.println("===================================");
                                System.out.println("Hiển thị danh sách khách hàng sử dụng mã khuyến mãi");
                                System.out.println("===================================");
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }while (flag);
    }
}

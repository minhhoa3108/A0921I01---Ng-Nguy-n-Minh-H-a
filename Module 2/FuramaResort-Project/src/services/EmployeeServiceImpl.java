package services;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    private static List<Employee> employeeList;

    static {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(001, "Nguyễn Văn A", "01/01/2001", "Nam", "214028647", "091425367", "a@gmail.com",
                            "Đại học", "Lễ Tân", 500));
        employeeList.add(new Employee(002, "Nguyễn Văn B", "02/02/2002", "Nam", "214024547", "091411367", "b@gmail.com",
                "Đại học", "Quản Lý", 1000));
        employeeList.add(new Employee(003, "Nguyễn Thị C", "03/03/1999", "Nữ", "214024897", "095511367", "c@gmail.com",
                "Đại học", "Trưởng Phòng", 1500));
    }

    Scanner sc = new Scanner(System.in);
    @Override
    public void display() {
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        Employee employee = new Employee();
        System.out.println("Nhập ID:");
        employee.setMaId(sc.nextInt());
        System.out.println("Nhập họ và tên:");
        employee.setHoVaTen(sc.nextLine());
        System.out.println("Nhập ngày sinh:");
        employee.setNgaySinh(sc.nextLine());
        System.out.println("Nhập giới tính:");
        employee.setGioiTinh(sc.nextLine());
        System.out.println("Nhập số CMND (có 9 chữ số):");
        employee.setCMND(sc.nextLine());
        System.out.println("Nhập sđt:");
        employee.setSoDienThoai(sc.nextLine());
        System.out.println("Nhập email:");
        employee.setEmail(sc.nextLine());
        employee.setTrinhDo(trinhDo());// chọn trình độ
        System.out.println("Chọn vị trí làm việc:");
        employee.setViTri(viTri());//chọn vị trí làm việc
        System.out.println("Nhập Lương:");
        employee.setLuong(sc.nextInt());
    }

    @Override
    public void edit(String maID) {

    }

    public String trinhDo(){
        String trinhDo = "";
        System.out.println("Chọn trình độ học vấn của bạn");
        System.out.println("1. Trung cấp");
        System.out.println("2. Cao Đẳng");
        System.out.println("3. Đại Học");
        System.out.println("4. Sau đại học");

        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Trung cấp");
                trinhDo = "Trung cấp";
                break;
            case 2:
                System.out.println("Cao Đăng");
                trinhDo = "Cao Đăng";
                break;
            case 3:
                System.out.println("Đại Học");
                trinhDo = "Đại Học";
                break;
            case 4:
                System.out.println("sau Đại học");
                trinhDo = "sau Đại học";
                break;
        }

        return trinhDo;
    }

    public String viTri(){
        String viTri = "";
        System.out.println("Chọn vị trí làm việc của bạn");
        System.out.println("1. lễ Tân");
        System.out.println("2. Phục Vụ");
        System.out.println("3. Chuyên Viên");
        System.out.println("4. Giám Sát");
        System.out.println("5. Quản Lý");
        System.out.println("6. Giám đốc");

        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Lễ Tân");
                viTri = "Lễ Tân";
                break;
            case 2:
                System.out.println("Phục Vụ");
                viTri = "Phục Vụ";
                break;
            case 3:
                System.out.println("Chuyên Viên");
                viTri = "Chuyên viên";
                break;
            case 4:
                System.out.println("Giám sát");
                viTri = "Giám sát";
                break;
            case 5:
                System.out.println("Quản lý");
                viTri = "Quản lý";
                break;
            case 6:
                System.out.println("Giám đốc");
                viTri = "Giám đốc";
                break;
        }

        return viTri;
    }
}

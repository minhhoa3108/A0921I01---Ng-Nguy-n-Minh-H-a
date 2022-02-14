package services;

import models.Employee;
import utils.ReadAndWriteToCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    private static final String EMPLOYEE_PATH_FILE = "src\\data\\Employee.csv";
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        List<Employee> employeeList = ReadAndWriteToCSV.readEmployeeListFormCSV(EMPLOYEE_PATH_FILE);
        for (int i = 0; i < employeeList.size(); i++){
            System.out.println((i+1)+", " + employeeList.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập ID:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập họ và tên:");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        String ngaySinh = sc.nextLine();
        System.out.println("Nhập giới tính:");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhập số CMND (có 9 chữ số):");
        String CMND = sc.nextLine();
        System.out.println("Nhập sđt:");
        String sdt = sc.nextLine();
        System.out.println("Nhập email:");
        String email = sc.nextLine();
        String trinhDo = trinhDo();// chọn trình độ
        System.out.println("Chọn vị trí làm việc:");
        String viTri = viTri();//chọn vị trí làm việc
        System.out.println("Nhập Lương:");
        String luong = sc.nextLine();
        Employee employee = new Employee(id, hoVaTen, ngaySinh, gioiTinh, CMND, sdt, email, trinhDo, viTri, luong);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);

        ReadAndWriteToCSV.writeEmployeeListToCSV1(EMPLOYEE_PATH_FILE, employeeList, true);
    }

    @Override
    public void edit(String maID) {

    }

    @Override
    public void delete() {
        List<Employee> employeeList = ReadAndWriteToCSV.readEmployeeListFormCSV(EMPLOYEE_PATH_FILE);
        display();

        System.out.println("Chọn Nhân Viên bạn muốn xóa:");
        int choiceDelete = Integer.parseInt(sc.nextLine());
        employeeList.remove(choiceDelete-1);
        ReadAndWriteToCSV.writeEmployeeListToCSV1(EMPLOYEE_PATH_FILE, employeeList, false);
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

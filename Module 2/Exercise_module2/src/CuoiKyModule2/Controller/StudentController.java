package CuoiKyModule2.Controller;

import CuoiKyModule2.Model.Student;
import CuoiKyModule2.Model.Teacher;
import CuoiKyModule2.service.StudentServiceImpl;
import CuoiKyModule2.service.TeacherServiceImpl;

import java.util.Scanner;

public class StudentController {
    private StudentServiceImpl studentService = new StudentServiceImpl();
    private TeacherServiceImpl teacherService = new TeacherServiceImpl();

    public void displayMenu(){
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("------------ Chương trình Quản Lý Sinh Viên ------------");
            System.out.println("1. Thêm mới Sinh Viên");
            System.out.println("2. Xóa Sinh Viên");
            System.out.println("3. Xem danh sách Sinh Viên");
            System.out.println("4. Xem thông tin Giáo Viên");
            System.out.println("5. Tìm kiếm Sinh Viên");
            System.out.println("6. Thoát");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    //Thêm mới SV
                    System.out.println("======================================");
                    studentService.add();
                    System.out.println("======================================");
                    break;
                case 2:
                    //Xóa SV
                    System.out.println("======================================");
                    studentService.delete();
                    System.out.println("======================================");
                    break;
                case 3:
                    //Xem ds sinh viên
                    System.out.println("======================================");
                    studentService.display();
                    System.out.println("======================================");
                    break;
                case 4:
                    // xem thông tin giáo viên
                    System.out.println("======================================");
                    teacherService.display();
                    System.out.println("======================================");
                    break;
                case 5:
                    //tìm kiếm
                    break;
                case 6:
                    System.exit(0);
                default:
                    break;
            }
        }while (flag);
    }
}

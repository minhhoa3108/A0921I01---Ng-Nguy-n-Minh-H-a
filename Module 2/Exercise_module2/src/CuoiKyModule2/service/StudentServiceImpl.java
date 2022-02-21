package CuoiKyModule2.service;

import CuoiKyModule2.Model.Student;
import CuoiKyModule2.Validate.Validate;
import CuoiKyModule2.utils.ReadAndWriteToCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements Service{
    private static final String STUDENT_PATH_FILE = "src\\CuoiKyModule2\\data\\student.csv";
    Scanner sc = new Scanner(System.in);

    int id = 0;
    @Override
    public void add() {
        Validate valdate = new Validate();

        ++id;
        System.out.println("id: " + id);

        System.out.println("Nhập họ và tên");
        String ten = sc.nextLine();
        try{
            valdate.validateTen(ten);
        }catch (Exception e){
            System.err.println("Lỗi: nhập sai định dạng tên");
        }

        System.out.println("Nhập ngày sinh");
        String ngaySinh = sc.nextLine();
        try{
            valdate.validateNgaySinh(ngaySinh);
        }catch (Exception e){
            System.err.println("Lỗi: nhập sai định dạng ngày sinh");
        }

        System.out.println("Nhập giới tính");
        String gioiTinh = sc.nextLine();

        System.out.println("Nhập Số điện thoại");
        String sdt = sc.nextLine();
        try{
            valdate.validateSdt(sdt);
        }catch (Exception e){
            System.err.println("Lỗi: nhập sai định dạng số điện thoại");
        }

        System.out.println("Nhập mã lớp học");
        String maLopHoc = sc.nextLine();
        try{
            valdate.validateMaLopHoc(maLopHoc);
        }catch (Exception e){
            System.err.println("Lỗi: nhập sai định dạng mã lớp học");
        }

        Student student = new Student(id, ten, ngaySinh, gioiTinh, sdt, maLopHoc);
        List<Student> studentList = new ArrayList<>();

        studentList.add(student);

        ReadAndWriteToCSV.writeStudentToCSV(STUDENT_PATH_FILE, studentList, true);
    }

    @Override
    public void delete() {
        List<Student> studentList = ReadAndWriteToCSV.readStudentListFormCSV(STUDENT_PATH_FILE);
        display();

        System.out.println("Chọn Sinh Viên bạn muốn xóa");
        int choiceDelete = Integer.parseInt(sc.nextLine());
        studentList.remove(choiceDelete - 1);
        ReadAndWriteToCSV.writeStudentToCSV(STUDENT_PATH_FILE, studentList, true);
    }

    @Override
    public void display() {
        List<Student> studentList = ReadAndWriteToCSV.readStudentListFormCSV(STUDENT_PATH_FILE);
        for (int i = 0; i < studentList.size(); i++){
            System.out.println((i+1) + "," + studentList.get(i));
        }
    }

    @Override
    public void search() {
        List<Student> studentList = ReadAndWriteToCSV.readStudentListFormCSV(STUDENT_PATH_FILE);
        System.out.println("Nhập tên tìm kiếm:");
        String ten = sc.nextLine();

        for (int i = 0; i < studentList.size(); i++){
            System.out.println((i+1) + "," + studentList.get(i));
        }
    }
}

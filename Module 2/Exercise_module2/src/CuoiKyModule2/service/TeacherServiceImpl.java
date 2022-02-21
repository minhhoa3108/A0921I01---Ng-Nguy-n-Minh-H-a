package CuoiKyModule2.service;

import CuoiKyModule2.Model.Teacher;
import session17.thuc_hanh.Student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl implements Service{
    private static final String TEACHER_PATH_FILE = "src\\CuoiKyModule2\\data\\teacher.csv";

    static List<Teacher> teachers;

    {
        Teacher teacher1 = new Teacher(1, "Nguyen Van H", "20/2/1988", "Nam", "0901234567");
        Teacher teacher2 = new Teacher(2, "Nguyen Thi C", "19/3/1990", "Nu", "0901231267");
        Teacher teacher3 = new Teacher(3, "Nguyen Van D", "19/3/1992", "Nu", "0919731267");
//        teachers.add(teacher1);
//        teachers.add(teacher2);
//        teachers.add(teacher3);
//        writeToFile(TEACHER_PATH_FILE, teachers);
    }


    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        List<Teacher> teacherDataFromFile = readDataFromFile(TEACHER_PATH_FILE);
        for (Teacher teacher : teacherDataFromFile){
            System.out.println(teacher);
        }
    }

    @Override
    public void search() {

    }

    private static void writeToFile(String path, List<Teacher> teachers) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(teachers);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Teacher> readDataFromFile(String path){
        List<Teacher> teachers = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            teachers = (List<Teacher>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return teachers;
    }
}

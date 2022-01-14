package Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class    Main {
    public static void main(String[] args) {
        List<Student> students;

        students = new ArrayList<>();
//        students = new LinkedList<>();
        students.add(new Student(1, "A"));
        students.add(new Student(2, "B"));
//        students.remove(1);
        students.add(new Student(3, "C"));

        for (Student student : students){
            System.out.println(student);
        }
    }
}

package Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student(1, "A1"));
        students.add(new Student(2, "B1"));
        students.add(new Student(3, "C1"));
        students.add(new Student(3, "C1"));

        for (Student student : students){
            System.out.println(student);
        }
    }
}
